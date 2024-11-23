# hubspot-cms-JetBrains
# MIT License
# Copyright (c) 2024 Sylvain Tirreau (hubspot-addict.com)
#
# Write the Live Template xml file and the abbreviations documentation file.

import json
from git import Repo
from os import mkdir, getcwd, path, walk
from shutil import rmtree
import sys
import xml.etree.ElementTree as ET
import re

# Mode = dev | prod
# In dev mode, the hubspot-cms-vscode repository is cloned only once and the tmp folder stay there. In prod mode,
# the hubspot-cms-vscode repository is always cloned and the tmp folder always removed at the end of this script execution.
mode = 'dev'
repository = "https://github.com/HubSpot/hubspot-cms-vscode.git"
root_folder = getcwd()
temp_folder = path.join(root_folder, "tmp-hubspot-cms-vscode-repository")
snippets_folder = "snippets"
# File name is also the name of this live template
file_name = "Hubspot"
abb_references = {}
html_body = ""
html_table_of_contents = ""

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
    if mode == 'dev' and not path.exists(path.join(temp_folder, snippets_folder)) or mode == 'prod':
        create_tmp_folder()
        get_remote_files()

    templateSet = ET.Element('templateSet')
    templateSet.set('group', file_name.capitalize())

    for root, dirs, files in walk(path.join(temp_folder, snippets_folder)):
        for name in files:
            if name.endswith('.json'):
                text_h2 = name.replace('_', ' ').replace('.json', '').upper()
                link_h2 = text_h2.replace(' ', '')
                html_body += f"<br><br><br><div class='d-inline-flex'><h2 id='{link_h2}'>{text_h2}</h2>&nbsp;&nbsp;<a href='#tb{link_h2}'>Back to table</a></div><br><br>"
                html_table_of_contents += f"<br><a id='#tb{link_h2}' href='#{link_h2}'>{text_h2}</a><br>"
                data = get_json_content(path.join(root, name))

                for d in data:
                    text_h3 = data[d]['prefix'].replace('~', '')
                    link_h3 = f"{link_h2}{text_h3.replace(' ', '')}"
                    html_body += f"<div class='d-inline-flex'><h3 id='{link_h3}'>{text_h3}</h3>&nbsp;&nbsp;<a href='#tb{link_h3}'>Back to table</a></div><br>"
                    html_table_of_contents += f"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a id='tb{link_h3}' href='#{link_h3}'>{text_h3}</a><br>"
                    html_body += f"<p>{data[d]['description']}</p>"
                    html_body += f"<p>{data[d]['body']}</p>"
                    template = ET.SubElement(templateSet, 'template')
                    template.set('name', data[d]["prefix"])
                    template.set('toReformat', 'false')
                    template.set('toShortenFQNames', 'true')

                    value = ""
                    for b in data[d]["body"]:
                        search_variable = re.findall("\$\{.+?\}", b)
                        if search_variable:
                            for var in search_variable:
                                new_variable = var.replace('${', '$').replace('}', '$').replace(" ", "__").replace(":",
                                                                                                                   "")
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
                    option = ET.SubElement(context, 'option')
                    option.set('name', 'JAVA_SCRIPT')
                    option.set('value', 'true')
                    option = ET.SubElement(context, 'option')
                    option.set('name', 'TypeScript')
                    option.set('value', 'true')

    # Write abbreviations reference file
    ref_content = "# Abbreviations reference\n\n"
    abb_keys = list(abb_references.keys())
    for e in sorted(abb_keys):
        ref_content += f'## {e}\n{abb_references[e]}\n\n'

    with open("../live-template/REFERENCES.md", "w") as ref_file:
        ref_file.write(ref_content)

    # create a new XML file with the results
    xml_data = ET.tostring(templateSet)
    with open(f"../live-template/templates/{file_name}.xml", "w") as xml_file:
        xml_file.write(xml_data.decode('utf-8'))

    # Create HTML structured file with references for Jetbrains plugin testing and dev.
    body = html_body
    html_content = f"""
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <title>Hubl language references</title>
            <link rel="stylesheet" href="https://www.hubspot-addict.com/hs-fs/hub/25735474/hub_generated/template_assets/65268337127/1730988751779/assets/styles/css/main-site.min.css">
        </head>
        <body>
            <div class="container">
                <div class="row d-flex">
                    <div class="col-12">
                        <h1>Hubl language references</h1>
                        <br>
                        <big>Table of contents</big>
                        <div style="font-size:0.8rem">
                        {html_table_of_contents}
                        </div>
                        <div>
                        {body}
                        </div>
                    </div>
                </div>
            </div>
        </body>
    </html>
    """
    with open("../jetbrains-plugins/hubl-language/src/test/testData/hubl-references.html", "w") as html_file:
        html_file.write(html_content)

    if mode == 'prod':
        delete_tmp_folder()
