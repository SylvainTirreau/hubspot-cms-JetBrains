# hubspot-cms-JetBrains
# MIT License
# Copyright (c) 2021 Sylvain Tirreau (preferendum.fr)
#
# Write the Live Template xml file and the abbreviations documentation file.

import json
from git import Repo
from os import mkdir, getcwd, path, walk
from shutil import rmtree
import sys
import xml.etree.ElementTree as ET
import re

repository = "https://github.com/HubSpot/hubspot-cms-vscode.git"
root_folder = getcwd()
temp_folder = path.join(root_folder, "tmp")
snippets_folder = "snippets"
# File name is also the name of live template
file_name = "Hubspot"
abb_references = {}


def create_tmp_folder():
    try:
        if path.exists(temp_folder):
            delete_tmp_folder()
            mkdir(temp_folder)
        else:
            mkdir(temp_folder)
    except OSError:
        print(f"Creation of the directory {temp_folder} failed.")
        sys.exit()
    else:
        print(f"Successfully created the directory {temp_folder}.")


def delete_tmp_folder():
    try:
        rmtree(temp_folder)
    except OSError:
        print(f"Removing of the directory {temp_folder} failed.")
    else:
        print(f"Successfully removing the directory {temp_folder}.")


def get_remote_files():
    try:
        Repo.clone_from(repository, temp_folder)
    except:
        print(f"Cannot clone repository.")
        raise
    else:
        print(f"Repository successfully cloned.")


def get_json_content(file):
    with open(file) as json_file:
        return json.load(json_file)


if __name__ == "__main__":
    create_tmp_folder()
    get_remote_files()

    templateSet = ET.Element('templateSet')
    templateSet.set('group', file_name.capitalize())

    for root, dirs, files in walk(path.join(temp_folder, snippets_folder)):
        for name in files:
            if name.endswith('.json'):
                data = get_json_content(path.join(root, name))

                for d in data:
                    template = ET.SubElement(templateSet, 'template')
                    template.set('name', data[d]["prefix"])
                    template.set('toReformat', 'false')
                    template.set('toShortenFQNames', 'true')

                    value = ""
                    for b in data[d]["body"]:
                        search_variable = re.findall("\$\{.+?\}", b)
                        if search_variable:
                            for var in search_variable:
                                new_variable = var.replace('${', '$').replace('}', '$').replace(" ", "__").replace(":", "")
                                b = b.replace(var, new_variable)
                                variable = ET.SubElement(template, 'variable')
                                variable.set("name", new_variable.replace('$', ''))
                                variable.set('expression', '')
                                variable.set('defaultValue', '')
                                variable.set('alwaysStopAt', 'true')
                            value += b + "\n"
                        else:
                            value += b + "\n"
                    template.set('value', value)
                    template.set('description', data[d]["description"])
                    abb_references[data[d]["prefix"].replace(' ', '')] = data[d]["description"]
                    context = ET.SubElement(template, 'context')
                    option = ET.SubElement(context, 'option')
                    option.set('name', 'HTML')
                    option.set('value', 'true')
                    option = ET.SubElement(context, 'option')
                    option.set('name', 'CSS')
                    option.set('value', 'true')
                    option = ET.SubElement(context, 'option')
                    option.set('name', 'JSON')
                    option.set('value', 'true')

    # Write abbreviations reference file
    ref_content = "# Abbreviations reference\n\n"
    abb_keys = list(abb_references.keys())
    for e in sorted(abb_keys):
        ref_content += f'## {e}\n{abb_references[e]}\n\n'

    with open(f"../REFERENCES.md", "w") as ref_file:
        ref_file.write(ref_content)

    # create a new XML file with the results
    xml_data = ET.tostring(templateSet)
    with open(f"../templates/{file_name}.xml", "w") as xml_file:
        xml_file.write(xml_data.decode('utf-8'))

    delete_tmp_folder()