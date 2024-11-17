# Abbreviations reference

## !=


## <


## <=


## ==


## >


## >=


## archive_list_page
Returns true if page is a blog archive page. Ex: https://www.example.com/blog/archive/2020/02 would return true.

## area
Creates container that supports drag-and-drop in content editors.
Parameters:
- name(string) Identifier when storing data for a drag-and-drop area in the editors. Must be unique for all drag-and-drop areas in a template.
- label(string) Label used in the editor for the drag-and-drop area.
- class(string) Class names to add to the wrapping div.

## background_color
Email-template only alias for the background color defined in Settings > Marketing > Email > Configuration > Color

## blog
An alias for group.

## blog_author
This variable contains blog author information for blog author listing pages. It can be used to create conditional logic to render markup for blog author listings ({% if blog_author %}).

## body_border_color
Email-template only alias for the border color defined in Settings > Marketing > Email > Configuration > Color

## body_border_color_choice
Email-template only alias for `site_settings.body_border_color_choice` The variable is used in HubSpot's default email templates to determine whether or not a border should be added. The setting is controlled in Content Settings > Colors and Fonts. It prints values: BORDER_AUTOMATIC, BORDER_MANUAL, BORDER_NONE

## body_color
Email-template only alias for `site_settings.body_color` setting from Settings > Marketing > Email > Configuration > Color.

## boolean
Return true if object is a boolean (in a strict sense, not in its ability to evaluate to a truthy expression)

## column
A column inside a drag-and-drop area. Columns can only be children of a section or a row tag.
Parameters:
- offset(integer) Number of rows to offset the module in the row (0-11).
- width(integer) Number of rows wide the module should be.
- margin(dict) Add top and bottom margin in pixels.
- background_image(dict) Add a background image to the row.
- background_color(dict) Specify a background color for the the row.

## company_domain
Prints the company domain from Website > Pages > Branding > Logo Link.

## containing
Returns true if a list contains a value
Parameters:
- value(object) The value to check is in the list

## containingall
Returns true if a list contains all values in a second list
Parameters:
- list_two(list) The second list to check if every element is in the first list

## content.absolute_url
Prints the full URL of a page, post, or web page version of an email.

## content.archived
This variable evaluates to True, if the page or email was marked as archived by the user.

## content.author_email
The email address of the content creator.

## content.author_name
The first and last name of the content creator.

## content.author_username
The HubSpot username of the content creator.

## content.blog_post_author
This variable contains individual blog post author information for a given post.

## content.campaign
The GUID for the marketing campaign that this page or email is associated with. This unique ID can be found in the URL of a particular campaign in the Campaign's tool.

## content.campaign_name
The name of the marketing campaign that this page, this post, or this email is associated with.

## content.comment_count
The number of comments for the current blog post.

## content.comment_list
A list of the comments for the current blog post.

## content.create_page
This variable is True, if there is a web page version of the email.

## content.created
A datetime object for when the content was originally created, in UTC time. This variable can be formatted with the datetime filter.

## content.email_body
The main body of the email. This variable renders a rich text module.

## content.emailbody_plaintext
The optional override of the plain text email body.

## content.featured_image
The source url of the featured image, selected when the blog was published.

## content.featured_image_alt_text
The alt text of the featured image.

## content.from_name
The from name of the email sender.

## content.meta_description
Prints the meta description of a page. When pulling the meta description of a page, it is better to use the variable page_meta.meta_description.

## content.name
The name of a post, email, or page. For pages and emails this will print the internal content name, while for posts this will print the post title. For blog posts, this is the post title that displays. For other types of content, this is generally an internal name. This variable includes a wrapper so that it is editable via the UI, when included in blog posts. If you want to print the content name without a wrapper, use page_meta.name.

## content.next_post
Information about the next post, if one exists.

## content.post_body
The body of the blog post.

## content.post_list_content
The body blog post content, modified for the listing page. The final output is affected by summary settings in Settings > Website > Blog. If featured images are enabled in settings, this variable will remove any images above the read more separator automatically.

## content.post_list_summary_featured_image
The featured image of post summaries to be used in listing templates. This variable is affected by the settings in Settings > Website > Blog.

## content.post_summary
The blog post summary. This content is determined by the read more separator in the blog editor.

## content.previous_post
Information about the previous post, if one exists.

## content.publish_date
A datetime object representing when the content was published, in UTC time. This variable can be formatted with the datetime filter.

## content.publish_date_localized
A string representing the datetime when the content was published using the time zone defined in the account's default settings. This variable is also subject to the language and  date format settings in Settings > Website > Blog > Date Formats.

## content.reply_to
The reply to address for the email.

## content.subject
The subject of the email.

## content.template_path
The Design Manager file path to your template (ie custom/page/web_page_basic/my_template.html).

## content.topic_list
Can be used to render markup for a topic listing by looping through it. {% for topic in content.topic_list %} The items within contain the properties: name and slug.

## content.updated
A datetime object for when the user last updated the content, in UTC time. This variable can be formatted with the datetime filter.

## content_id
Prints the unique ID for a page, post, or email. This ID can be found in the URL of the editor. You can use this variable as an alias for content.id.

## contents
Contents is a sequence of your blog posts that is iterated through using a for loop.

## current_page_num
The integer index of the current page of blog posts in the view.

## default_dnd_module
Creates a wrapped module inside a drag-and-drop area.
Parameters:
- path(string) Path to the module.
- offset(integer) Number of rows to offset the module in the row (0-11).
- width(integer) Number of rows wide the module should be.
- flexbox_positioning(string) Adjust position of the module inside the row. Possible values are TOP_LEFT, TOP_CENTER, or TOP_RIGHT.

## default_module
A module
Parameters:
- module_id(String) The id of the module to render
- path(String) The path of the module to render. Include leading slash for absolute path, otherwise path is relative to template. Reference HubSpot default modules with paths corresponding to their HubL tags such as @hubspot/rich_text, @hubspot/linked_image, etc.

## defined
Return true if the variable is defined

## divisibleby
Returns true if a variable is divisible by a number
Parameters:
- divisor(number) The number to check whether a number is divisible by

## dnd_module
Creates a wrapped module inside a drag-and-drop area.
Parameters:
- path(string) Path to the module.
- offset(integer) Number of rows to offset the module in the row (0-11).
- width(integer) Number of rows wide the module should be.
- flexbox_positioning(string) Adjust position of the module inside the row. Possible values are TOP_LEFT, TOP_CENTER, or TOP_RIGHT.

## dynamic_page_crm_object
The CRM object of the dynamic page that matches with the page request path. If the request is to the listing page, this value will be null.

## dynamic_page_crm_object_type_fqn
The fully qualified name (FQN) of the crm object. The FQN is an assigned unique ID for the object, including portal ID and object name. The fqn can be used in the crm_objects function.

## dynamic_page_hubdb_row
The HubDB row of the dynamic page that matches with the page request path. If the request is to the listing page, this value will be null.

## dynamic_page_hubdb_table_id
The ID of the table selected in the 'Advanced Settings` tab of the page editor.

## dynamic_page_route_level
Current depth of a page in a multi-level dynamic template. The value starts at 0 and increments with each additional table layer.

## elif
Else if statement to be used within if statement

## else
Else statement to be used within if statement

## email_body_border_css
Email-template only alias which generates the css styles for the email border.

## email_body_padding
The email body padding setting. This setting is located in Settings > Marketing > Email > Configuration > Size.

## email_body_width
The email body width setting. This setting is located in Settings > Marketing > Email > Configuration > Size.

## eq


## equalto
Returns true if an object has the same value as another object
Parameters:
- other(object) Another object to check equality against

## even
Returns true if the value is even

## false
Return true if object is a boolean and false

## favicon_link
Prints the source URL of the favicon. This image is set in Settings > Website > Pages > Branding.

## field.alignment
HubSpot Alignment Field

## field.backgroundImage
HubSpot Background Image Field

## field.blog
HubSpot Blog Field

## field.boolean
HubSpot Boolean Field

## field.border
HubSpot Border Field

## field.choice
HubSpot Choice Field

## field.color
HubSpot Color Field

## field.cta
HubSpot CTA Field

## field.date
HubSpot Date field

## field.datetime
HubSpot Date and Time Field

## field.email
HubSpot Email Field

## field.file
HubSpot File

## field.followup
HubSpot Followup Email

## field.font
HubSpot Font Field

## field.form
HubSpot Form Field

## field.gradient
HubSpot Gradient Field

## field.hubdb
HubSpot HubDB Table

## field.icon
HubSpot Icon Field

## field.image
HubSpot Image Field

## field.link
HubSpot Link Field

## field.logo
HubSpot Logo Field

## field.menu
HubSpot Menu Field

## field.number
HubSpot Number Field

## field.page
HubSpot Page Field

## field.richtext
HubSpot Rich Text Field

## field.simplemenu
HubSpot Simple Menu

## field.spacing
HubSpot Spacing Field

## field.tag
HubSpot Tag Field

## field.text
HubSpot Text Field

## field.textAlignment
HubSpot Text Alignment Field

## field.url
HubSpot Url Field

## float
Return true if object is a float

## for


## ge
Returns true if the first object's value is greater than or equal to the second object's value
Parameters:
- other(object) Another object to compare against

## greaterthan


## group
The dictionary containing variables that pertain to an entire blog.

## group.group
HubSpot Field Group

## group.repeater
HubSpot Repeater Group

## gt
Returns true if the first object's value is strictly greater than the second
Parameters:
- other(object) Another object to compare against

## hub_id
The portal ID of your HubSpot account.

## hublblog
Boilerplate blog markup

## hubldoc
Boilerplate html/HubL document

## hubspot_analytics_tracking_code
Includes the analytics tracking code. This tag is not necessary, because standard_footer_includes, already renders the tracking code.

## if
Returns a basic if statement

## in
Returns true if value is contained in the iterable
Parameters:
- list(object) The iterable to check for the value

## integer
Return true if object is an integer or long

## is_in_blog_post_editor
Returns true if content is being rendered within the blog post editor.

## is_in_blog_post_previewer
Returns true if content is being rendered within the blog post previewer.

## is_in_editor
Returns true if content is being rendered within any content editor.

## is_in_email_editor
Returns true if content is being rendered within the email editor.

## is_in_email_previewer
Returns true if content is being rendered within the email previewer.

## is_in_global_content_editor
Returns true if content is being rendered within the global content editor.

## is_in_hs_app
Returns true if content is being rendered within the HubSpot app.

## is_in_module_previewer
Returns true if content is being rendered within the module previewer.

## is_in_page_editor
Returns true if content is being rendered within the page editor.

## is_in_page_previewer
Returns true if content is being rendered within the page previewer.

## is_in_previewer
Returns true if content is being rendered within any preview context.

## is_in_template_previewer
Returns true if content is being rendered within the template previewer.

## is_in_theme_editor
Returns true if content is being rendered within the theme editor.

## is_in_theme_previewer
Returns true if content is being rendered within the theme previewer.

## iterable
Return true if the object is iterable (sequence, dict, etc)

## last_page_num
The integer index of the last page of blog posts in the view.

## le
Returns true if the first object's value is less than or equal to the second object's value
Parameters:
- other(object) Another object to compare against

## lessthan


## local_dt
A datetime object of the current time in the time zone defined in your Report Settings. Usage of this variable will disable page caching in order to return the current time. May hurt page performance. Use JavaScript instead to get current date and time in a cacheable way.

## local_time_zone
The time zone, as configured in your HubSpot Report Settings.

## lower
Return true if the given string is all lowercase

## lt
Returns true if the first object's value is strictly less than the second
Parameters:
- other(object) Another object to compare against

## mapping
Return true if the given object is a dict

## membership_company_name
This is the company name listed in Private Content > General Settings.

## membership_domain
This is the domain of the private content website.

## membership_password_reset_link
Link to the reset password page for the private content website.

## membership_password_saved_link
Link to the password saved page. The link will redirect the visitor to a random restricted page that they have access to.

## membership_registration_link
Link to the registration page for the private content website.

## membership_website_admin
This is the website admin listed in Private Content > General Settings.

## ne
Returns true if an object has the different value from another object
Parameters:
- other(object) Another object to check inequality against

## next_page_num
The integer index of the next page of blog posts in the view.

## node.activeBranch
True if the node is in the top-level branch that the current page is in.

## node.activeNode
True if the node is the current page.

## node.children
The list of child nodes for the current node.

## node.contentGroupId
Blog ID of the page if it is a HubSpot blog post.

## node.label
The menu label of the page.

## node.level
The number of levels deep the current node is from the top-level nodes.

## node.linkTarget
Link target of the page.

## node.pageId
ID of the page if within HubSpot.

## node.pageTitle
Name of the content page if within HubSpot.

## node.parentNode
The parent node of the current node. The parent node will have the current node in its children property.

## node.slug
Path slug of the page.

## node.url
URL of the page.

## none
Return true if the given object is null / none

## number
Return true if the object is a number

## odd
Return true if a number is an odd number

## ofalse
Generates overrideable=False for HubL tags

## otrue
Generates overrideable=True for HubL tags

## page_meta.canonical_url
The official URL that this page should be accessed at. Usually does not include any query string parameters. Use this for the rel="canonical" tag. HubSpot automatically canonicalizes URLs.

## page_meta.html_title
The title of the page. This variable should be used in the <title> tag of HTML templates.

## page_meta.meta_description
The meta description of a page. This variable should be used in the "description" <meta> tag of HTML templates.

## page_meta.name
An alias for content.name

## portal_id
An alias for hub_id

## primary_accent_color
Email-template only alias for `site_settings.primary_accent_color`.

## primary_font
Email-template only alias for `site_settings.primary_font`.

## primary_font_color
Email-template only alias for `site_settings.primary_font_color`.

## primary_font_size
Email-template only alias for `site_settings.primary_font_size`.

## primary_font_size_num
Prints the font size number from Settings > Marketing > Email > Configuration > Font. Excludes 'px'.

## request.cookies
A dictionary of cookie names mapped to cookie values.

## request.domain
The domain used to access this page.

## request.full_url
The URL used to access this page.

## request.headers
A dictionary of available request headers.

## request.path
The path component of the URL.

## request.path_and_query
The path and query component of the URL.

## request.query
The query string component of the URL.

## request.query_dict
The query string converted into a name -> value dictionary.

## request.referrer
The HTTP referrer, the url of the page that linked to the current page.

## request.remote_ip
The IP address of the visitor.

## request.scheme
The protocol of the request (either http or https).

## request.search_engine
The search engine used to find this page, if applicable. Ex: google, aol, live, yahoo, images.google, etc.

## request.search_keyword
The keyword phrase used to find this page, if applicable.

## request_contact
A dictionary containing data about the requested contact.

## row
A row inside a drag-and-drop area. Rows can only be children of columns.
Parameters:
- margin(dict) Add top and bottom margin in pixels.
- padding(dict) Add top, bottom, left, and right padding in pixels.
- background_image(dict) Add a background image to the row.
- background_color(dict) Specify a background color for the the row.

## row.hs_child_table_id
The child table ID of the HubDB row. Can be used to build nested templates.

## row.hs_id
The internal ID of a HubDB row.

## row.hs_name
The name of the HubDB row.

## row.hs_parent_row
The parent row of the HubDB row. Can only be used when using child tables for nested templates.

## row.hs_path
The path of the HubDB row. Used to resolve a request to one row in the table specified by dynamic_page_hubdb_table_id.

## sameas
Return true if variable is pointing at same object as other variable
Parameters:
- other(object) A second object to check the variables value against

## secondary_accent_color
Email-template only alias for `site_settings.secondary_accent_color`

## secondary_font
Email-template only alias for `site_settings.secondary_font`

## secondary_font_color
Email-template only alias for `site_settings.secondary_font_color`

## secondary_font_size_num
Prints the font size number from Settings > Marketing > Email > Configuration > Font. Excludes 'px'.

## section
A top-level row inside a drag-and-drop area. Sections can only be children of a drag-and-drop area tag.
Parameters:
- max_width(number) Maximum width of the section.
- margin(dict) Add top and bottom margin in pixels.
- padding(dict) Add top, bottom, left, and right padding in pixels.
- background_image(dict) Add a background image to the row.
- background_color(dict) Specify a background color for the the row.

## sequence
Return true if the variable is a sequence. Sequences are variables that are iterable.

## simple_list_page
A boolean to indicate whether the requested page is the 'all posts' page containing links to all blog posts.

## site_settings.background_color
Background color setting from Settings > Marketing > Email > Configuration > Color. Prints a HEX value.

## site_settings.body_border_color
Body border color setting from Settings > Marketing > Email > Configuration > Color. This option becomes available when you select 'Manually set email border color' under the 'Border Color Options' dropdown. Prints a HEX value.

## site_settings.body_border_color_choice
The variable is used in HubSpot's default email templates to determine whether or not a border should be added. The setting is controlled in Content Settings > Colors and Fonts. It prints values: BORDER_AUTOMATIC, BORDER_MANUAL, BORDER_NONE

## site_settings.body_color
Body color setting from Settings > Marketing > Email > Configuration > Color. Prints a HEX value.

## site_settings.color_picker_favorite_1
Favorite color 1 setting from Settings > Marketing > Email > Configuration > Color. Prints a HEX value. Replace 1 with 2-6 to modify the tag for other favorite color settings.

## site_settings.color_picker_favorite_2
Favorite color 2 setting from Settings > Marketing > Email > Configuration > Color. Prints a HEX value. Replace 2 with 2-6 to modify the tag for other favorite color settings.

## site_settings.color_picker_favorite_3
Favorite color 3 setting from Settings > Marketing > Email > Configuration > Color. Prints a HEX value. Replace 3 with 2-6 to modify the tag for other favorite color settings.

## site_settings.color_picker_favorite_4
Favorite color 4 setting from Settings > Marketing > Email > Configuration > Color. Prints a HEX value. Replace 4 with 2-6 to modify the tag for other favorite color settings.

## site_settings.color_picker_favorite_5
Favorite color 5 setting from Settings > Marketing > Email > Configuration > Color. Prints a HEX value. Replace 5 with 2-6 to modify the tag for other favorite color settings.

## site_settings.color_picker_favorite_6
Favorite color 6 setting from Settings > Marketing > Email > Configuration > Color. Prints a HEX value. Replace 6 with 2-6 to modify the tag for other favorite color settings.

## site_settings.company_city
Prints the company city (set in Settings > Marketing > Email > Configuration > Footer).

## site_settings.company_name
Prints the company name (set in Settings > Marketing > Email > Configuration > Footer).

## site_settings.company_state
Prints the company state (set in Settings > Marketing > Email > Configuration > Footer).

## site_settings.company_street_address_1
Prints the company address (set in Settings > Marketing > Email > Configuration > Footer).

## site_settings.company_street_address_2
Prints the address line 2 from Settings > Marketing > Email > Configuration > Footer.

## site_settings.office_location_name
Prints the office location name from Settings > Marketing > Email > Configuration > Footer.

## site_settings.primary_accent_color
Primary accent color setting from Settings > Marketing > Email > Configuration > Color. Prints a HEX value.

## site_settings.primary_font
Primary font setting from Settings > Marketing > Email > Configuration > Font. Prints value from dropdown.

## site_settings.primary_font_color
Primary font color setting from Settings > Marketing > Email > Configuration > Font. Prints a HEX value.

## site_settings.primary_font_size
Primary font size setting from Settings > Marketing > Email > Configuration > Font. Includes 'px'.

## site_settings.secondary_accent_color
Secondary font color setting from Settings > Marketing > Email > Configuration > Color Prints a HEX value.

## site_settings.secondary_font
Secondary font setting from Settings > Marketing > Email > Configuration > Font. Prints value from dropdown.

## site_settings.secondary_font_color
Secondary font color setting from Settings > Marketing > Email > Configuration > Font Prints a HEX value.

## site_settings.secondary_font_size
Primary font size setting from Settings > Marketing > Email > Configuration > Font. Includes 'px'.

## standard_footer_includes
Renders the HubSpot tracking code and any other code included in your Footer HTML in Content Settings or the options of a particular page. This tag should be inserted directly before the closing body tag.

## standard_header_includes
Adds jQuery, layout.css, any attached stylesheets, a meta viewport tag, Google Analytics tracking code, other page meta information, and code added to the head tag at the domain/template/page level. This variable should be added to the <head> of HTML templates.

## string
Return true if object is a string

## string_containing
Return true if object is a string which contains a specified other string
Parameters:
- check(string) A second string to check is contained in the first string

## string_startingwith
Return true if object is a string which starts with a specified other string
Parameters:
- check(string) A second string to check is the start of the first string

## styleTab.group
Style Tab Field Group

## subscription_confirmation_url
Prints the URL of the subscription preferences confirmation page. This URL is dynamically generated on send.

## subscription_name
Prints the name of the Email Type specified for that email.

## true
Return true if object is a boolean and true

## truthy
Return true if object is 'truthy'

## undefined
Return true if object is undefined

## unsubscribe_anchor
Generates an anchor tag with the work 'unsubscribe' linked to your unsubscribe page.

## unsubscribe_link
Prints the URL of the page that allows recipients to manage subscription preferences or unsubscribe from email communications. This variable should be used in the href attribute of an <a>.

## unsubscribe_link_all
Renders a link to unsubscribe from all email communications, as opposed to a link to manage subscription preferences.

## unsubscribe_section
Renders an unsubscribe section that includes an unsubscribe link, as well as help text.

## upper
Return true if string is all uppercased

## view_as_page_section
Generates a link with help text that leads to a webpage version of an email.

## view_as_page_url
Generates a link that leads to a webpage version of an email.

## within


## year
Prints the current year.

## |abs
Return the absolute value of the argument.

## |add
adds a number to the existing value
Parameters:
- addend(number) The number added to the base number

## |allow_snake_case
Allow keys on the provided camelCase map to be accessed using snake_case

## |attr
Renders the attribute of a dictionary
Parameters:
- name(String) The dictionary attribute name to access

## |b64decode
Decode a base 64 input into a string.
Parameters:
- encoding(string) The string encoding charset to use.

## |b64encode
Encode the string input into base 64.
Parameters:
- encoding(string) The string encoding charset to use.

## |batch
A filter that groups up items within a sequence
Parameters:
- linecount(number) Number of items to include in the batch
- fill_with(String) Value used to fill up missing items

## |between_times
Calculates the time between two datetime objects
Parameters:
- end(String) Datetime object or timestamp at the end of the period
- unit(String) Which temporal unit to use

## |bool
Convert value into a boolean.

## |capitalize
Capitalize a value. The first character will be uppercase, all others lowercase.

## |center
Uses whitespace to center the value in a field of a given width.
Parameters:
- width(number) Width of field to center value in

## |convert_rgb
Converts a color given as a hex string into a comma-separated list of RGB values.

## |count


## |cut
Removes a string from the value from another string
Parameters:
- to_remove(String) String to remove from the original string

## |d


## |date


## |datetimeformat
Formats a date object
Parameters:
- format(String) The format of the date determined by the directives added to this parameter
- timezone(String) Time zone of output date
- locale(string) The language code to use when formatting the datetime

## |default
If the value is undefined it will return the passed default value, otherwise the value of the variable
Parameters:
- default_value(object) Value to print when variable is not defined
- truthy(boolean) Set to True to use with variables which evaluate to false

## |dictsort
Sort a dict and yield (key, value) pairs.
Parameters:
- case_sensitive(boolean) Determines whether or not the sorting is case sensitive
- by(enum key|value) Sort by dict key or value

## |difference
Returns a list containing elements present in the first list but not the second list
Parameters:
- list(sequence) The second list

## |divide
Divides the current value by a divisor
Parameters:
- divisor(number) The divisor to divide the value

## |divisible
Evaluates to true if the value is divisible by the given number
Parameters:
- divisor(number) The divisor to check if the value is divisible by

## |e


## |escape
Converts the characters &, <, >, ‘, and ” in string s to HTML-safe sequences. Use this filter if you need to display text that might contain such characters in HTML. Marks return value as markup string.

## |escape_attr
Escapes the content of an HTML attribute input

## |escape_html
Escapes the content of an HTML input

## |escape_jinjava
Converts the characters { and } in string s to Jinjava-safe sequences. Use this filter if you need to display text that might contain such characters in Jinjava. Marks return value as markup string.
Parameters:
- all_braces(boolean) Whether to only escape all curly braces or just when there are default expression, tag, or comment marks

## |escape_js
Escapes the content of an string input so it can be safely inserted into JavaScript

## |escape_url
Escapes the content of a URL input

## |escapejs
Escapes strings so that they can be safely inserted into a JavaScript variable declaration

## |escapejson
Escapes strings so that they can be used as JSON values

## |filesizeformat
Format the value like a ‘human-readable’ file size (i.e. 13 kB, 4.1 MB, 102 Bytes, etc).
Parameters:
- binary(boolean) Use binary prefixes (Mebi, Gibi)

## |first
Return the first item of a sequence.

## |flatten
Create a new list with all sub-lists recursively added to it up to the specified depth.
Parameters:
- list(list) The original list.
- depth(number) The depth level specifying how deep a nested list structure should be flattened. Defaults to 1. Max is 10.

## |float
Convert the value into a floating point number.
Parameters:
- default(float) Value to return if conversion fails

## |forceescape
Enforce HTML escaping. This will probably double escape variables.

## |format
Apply Python string formatting to an object.
Parameters:
- args(String...) Values to insert into string

## |format_currency
Formats a given number as a currency based on the locale and currency code passed in as a parameter. 
Parameters:
- locale(String) Locale in which to format the currency. Any Java locale language tag can be passed as a parameter. The default is the page's locale.Format : ISO639LanguageCodeInLowercase-ISO3166CountryCodeInUppercase
- currency_code(String) The ISO 4217 code of the currency. The default is the portal's default currency
- use_default decimal digits(String) A boolean input that determines if formatter needs to use default decimal digits of the currency code. The default is false.
- extend_Decimal Digits To Value Precision(String) A boolean input that determines if formatter needs to use the number of decimal digits from the given value. If the number of decimal digits from the input value is greater than the default number of decimal digits of the currency, use the number of decimal digits from the input value. Otherwise use the currency's default. The default is false.

## |format_currency_value
Formats a given number as a currency.
Parameters:
- locale(String) The language tag for the locale to use. Defaults to the page's locale.
Format: ISO639LanguageCodeInLowercase-ISO3166CountryCodeInUppercase
- currency(String) The ISO 4217 code of the currency to use. Defaults to the portal's default currency.
- minDecimalDigits(integer) The minimum number of decimal digits to use. Defaults to the currency's default number of decimal digits.
- maxDecimalDigits(integer) The maximum number of decimal digits to use. Defaults to the currency's default number of decimal digits.

## |format_date
Formats the date component of a date object
Parameters:
- format(String) The format to use. One of 'short', 'medium', 'long', 'full', or a custom pattern following Unicode LDML
https://unicode.org/reports/tr35/tr35-dates.html#Date_Format_Patterns
- timeZone(String) Time zone of the output date in IANA TZDB format
https://data.iana.org/time-zones/tzdb/
- locale(String) The locale to use for locale-aware formats

## |format_datetime
Formats both the date and time components of a date object
Parameters:
- format(String) The format to use. One of 'short', 'medium', 'long', 'full', or a custom pattern following Unicode LDML
https://unicode.org/reports/tr35/tr35-dates.html#Date_Format_Patterns
- timeZone(String) Time zone of the output date in IANA TZDB format
https://data.iana.org/time-zones/tzdb/
- locale(String) The locale to use for locale-aware formats

## |format_number
Formats a given number based on the locale passed in as a parameter.
Parameters:
- locale(String) Locale in which to format the number. The default is the page's locale.
- max_decimal precision(number) A number input that determines the decimal precision of the formatted value. If the number of decimal digits from the input value is less than the decimal precision number, use the number of decimal digits from the input value. Otherwise, use the decimal precision number. The default is the number of decimal digits from the input value.

## |format_time
Formats the time component of a date object
Parameters:
- format(String) The format to use. One of 'short', 'medium', 'long', 'full', or a custom pattern following Unicode LDML
https://unicode.org/reports/tr35/tr35-dates.html#Date_Format_Patterns
- timeZone(String) Time zone of the output date in IANA TZDB format
https://data.iana.org/time-zones/tzdb/
- locale(String) The locale to use for locale-aware formats

## |fromjson
Converts JSON string to Object

## |fromyaml
Converts a YAML string to an object

## |geo_distance
Calculates the ellipsoidal 2D distance between two points on Earth
Parameters:
- point1(location) location from a HubDB column
- point2_lat(number) latitude of point2
- point2_long(number) longitude of point2
- units(string) Units for the return value. Options are FT for feet, MI for miles, M for meters or KM for kilometers

## |groupby
Group a sequence of objects by a common attribute.
Parameters:
- attribute(String) The common attribute to group by

## |indent
Uses whitespace to indent a string.
Parameters:
- width(number) Amount of whitespace to indent
- indentfirst(boolean) If True, first line will be indented

## |int
Convert the value into an integer.
Parameters:
- default(number) Value to return if the conversion fails

## |intersect
Returns a list containing elements present in both lists
Parameters:
- list(sequence) The second list

## |ipaddr
Evaluates to true if the value is a valid IPv4 or IPv6 address
Parameters:
- function(string) Name of function. Supported functions: 'prefix', 'netmask', 'network', 'address', 'broadcast'

## |ipv4
Evaluates to true if the value is a valid IPv4 address
Parameters:
- function(string) Name of function. Supported functions: 'prefix', 'netmask', 'network', 'address', 'broadcast'

## |ipv6
Evaluates to true if the value is a valid IPv6 address
Parameters:
- function(string) Name of function. Supported functions: 'prefix', 'netmask', 'network', 'address', 'broadcast'

## |join
Return a string which is the concatenation of the strings in the sequence.
Parameters:
- d(String) The separator string used to join the items
- attr(String) Optional dict object attribute to use in joining

## |last
Return the last item of a sequence

## |length
Return the number of items of a sequence or mapping

## |list
Convert the value into a list. If it was a string the returned list will be a list of characters.

## |log
Return the natural log of the input.
Parameters:
- base(number) The base to use for the log calculation

## |lower
Convert a value to lowercase

## |map
Applies a filter on a sequence of objects or looks up an attribute.
Parameters:
- attribute(String) Filter to apply to an object or dict attribute to lookup

## |md5
Calculates the md5 hash of the given object

## |minus_time
Subtracts a specified amount of time to a datetime object
Parameters:
- diff(String) The amount to subtract from the datetime
- unit(String) Which temporal unit to use

## |multiply
Multiplies the current object with the given multiplier
Parameters:
- multiplier(number) The multiplier

## |plus_time
Adds a specified amount of time to a datetime object
Parameters:
- diff(String) The amount to add to the datetime
- unit(String) Which temporal unit to use

## |pprint
Pretty print a variable. Useful for debugging.

## |random


## |regex_replace
Return a copy of the value with all occurrences of a matched regular expression (Java RE2 syntax) replaced with a new one. The first argument is the regular expression to be matched, the second is the replacement string
Parameters:
- regex(String) The regular expression that you want to match and replace
- new(String) The new string that you replace the matched substring

## |reject
Filters a sequence of objects by applying a test to the object and rejecting the ones with the test succeeding.
Parameters:
- exp_test(name of expression test) Specify which expression test to run for making the selection

## |rejectattr
Filters a sequence of objects by applying a test to an attribute of an object or the attribute and rejecting the ones with the test succeeding.
Parameters:
- attribute(String) Attribute to test for and reject items that contain it
- exp_test(name of expression test) Specify which expression test to run for making the rejection

## |render
Renders a template string early to be used by other filters and functions

## |replace
Return a copy of the value with all occurrences of a substring replaced with a new one. The first argument is the substring that should be replaced, the second is the replacement string. If the optional third argument count is given, only the first count occurrences are replaced
Parameters:
- old(String) The old substring that you want to match and replace
- new(String) The new string that you replace the matched substring
- count(number) Replace only the first N occurrences

## |reverse
Reverse the object or return an iterator the iterates over it the other way round.

## |root
Return the square root of the input.
Parameters:
- root(number) The nth root to use for the calculation

## |round
Round the number to a given precision.
Parameters:
- precision(number) Specifies the precision of rounding
- method(enum common|ceil|floor) Method of rounding: 'common' rounds either up or down, 'ceil' always rounds up, and 'floor' always rounds down.

## |safe
Mark the value as safe, which means that in an environment with automatic escaping enabled this variable will not be escaped.

## |sanitize_html
Sanitizes the content of an HTML input

## |select
Filters a sequence of objects by applying a test to the object and only selecting the ones with the test succeeding.
Parameters:
- exp_test(name of expression test) Specify which expression test to run for making the selection

## |selectattr
Filters a sequence of objects by applying a test to an attribute of an object and only selecting the ones with the test succeeding.
Parameters:
- attr(String) Attribute to test for and select items that contain it
- exp_test(name of expression test) Specify which expression test to run for making the selection

## |shuffle


## |slice
Slice an iterator and return a list of lists containing those items.
Parameters:
- slices(number) Specifies how many items will be sliced. Maximum value is 1000. 
- fillWith(object) Specifies which object to use to fill missing values on final iteration

## |sort
Sort an iterable.
Parameters:
- reverse(boolean) Boolean to reverse the sort order
- case_sensitive(boolean) Determines whether or not the sorting is case sensitive
- attribute(String) Specifies an attribute to sort by

## |split
Splits the input string into a list on the given separator
Parameters:
- separator(String) Specifies the separator to split the variable by
- limit(number) Limits resulting list by putting remainder of string into last list item

## |string
Returns string value of object

## |striptags
Strip SGML/XML tags and replace adjacent whitespace by one space.

## |strtodate
Converts a date string and date format to a date object
Parameters:
- dateFormat(String) Format of the date string

## |strtotime
Converts a datetime string and datetime format to a datetime object
Parameters:
- datetimeFormat(String) Format of the datetime string

## |sum
Returns the sum of a sequence of numbers plus the value of parameter ‘start’ (which defaults to 0). When the sequence is empty it returns start.
Parameters:
- start(number) Sets a value to return, if there is nothing in the variable to sum
- attribute(String) Specify an optional attribute of dict to sum

## |symmetric_difference
Returns a list containing elements present in only one list.
Parameters:
- list(sequence) The second list

## |title
Return a titlecased version of the value. I.e. words will start with uppercase letters, all remaining characters are lowercase.

## |tojson
Writes object as a JSON string

## |toyaml
Writes object as a YAML string

## |trim
Strip leading and trailing whitespace.

## |truncate
Return a truncated copy of the string. The length is specified with the first parameter which defaults to 255. If the second parameter is true the filter will cut the text at length. Otherwise it will discard the last word. If the text was in fact truncated it will append an ellipsis sign ("..."). If you want a different ellipsis sign than "..." you can specify it using the third parameter.
Parameters:
- length(number) Specifies the length at which to truncate the text (includes HTML characters)
- killwords(boolean) If true, the string will cut text at length
- end(String) The characters that will be added to indicate where the text was truncated

## |truncatehtml
Truncates a given string, respecting html markup (i.e. will properly close all nested tags)
Parameters:
- length(number) Length at which to truncate text (HTML characters not included)
- end(String) The characters that will be added to indicate where the text was truncated
- breakword(boolean) If set to true, text will be truncated in the middle of words

## |unescape_html
Converts HTML entities in string s to Unicode characters.

## |union
Returns a list containing elements present in either list
Parameters:
- list(sequence) The second list

## |unique
Extract a unique set from a sequence of objects
Parameters:
- attr(Optional attribute on object to use as unique identifier) 

## |unixtimestamp


## |upper
Convert a value to uppercase

## |urldecode
Decodes encoded URL strings back to the original URL. It accepts both dictionaries and regular strings as well as pairwise iterables.

## |urlencode
Escape strings for use in URLs (uses UTF-8 encoding). It accepts both dictionaries and regular strings as well as pairwise iterables.

## |urlize
Converts URLs in plain text into clickable links.
Parameters:
- trim_url_limit(number) Sets a character limit
- nofollow(boolean) Adds nofollow to generated link tag
- target(String) Adds target attr to generated link tag

## |wordcount
Counts the words in the given string

## |wordwrap
Return a copy of the string passed to the filter wrapped after 79 characters.
Parameters:
- width(number) Sets the width of spaces at which to wrap the text
- break_long_words(boolean) If true, long words will be broken when wrapped

## |xmlattr
Create an HTML/XML attribute string based on the items in a dict.
Parameters:
- autospace(boolean) Automatically prepend a space in front of the item

## ~block
Blocks are regions in a template which can be overridden by child templates
Parameters:
- block_name(String) A unique name for the block that should be used in both the parent and child template

## ~blog_all_posts_url
Returns a full URL to the listing page for all blog posts for the specified blog
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use

## ~blog_author_url
Returns a full URL to the specified author's listing page for the specified blog
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- author_slug(author slug) Specifies which author to link to

## ~blog_authors
Returns a sequence of blog author objects for the specified blog, sorted by slug ascending
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- limit(numeric) Max authors to return

## ~blog_by_id
Returns a Blog by id or the default Blog
Parameters:
- id(id or 'default') The id of the blog to look up or 'default'

## ~blog_comments
Renders the blog comments embed tag
Parameters:
- select_blog('default' or blog id) Species which blog is connected to the comments embed
- limit(number) Sets maximum number of comments
- skip_css(bool) 
- message(string) This message is displayed when there are no comments. By default, it appears as empty.

## ~blog_page_link
Returns the absolute url of the specified paginated listing page for the current blog
Parameters:
- page(number) Required page number used to generate url

## ~blog_popular_posts
Returns a sequence of blog post objects for the specified blog, sorted by most popular first
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- limit(number) Specifies the number of posts to add to the sequence up to a limit of 200
- tag_slug(list) Optional list of tags to filter posts by
- time_frame(choice) Optional timeframe to filter posts by (must be one of 'popular_all_time', 'popular_past_year', 'popular_past_six_months', 'popular_past_month')
- logical_operator(string) Logical operator which, when tag_slug is a list, specifies how to logically filter on the slugs. Must be one of 'AND', 'OR'

## ~blog_post_archive_url
Returns a full URL to the archive listing page for the given date values on the specified blog
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- year(number) The year
- month(number) The optional month
- day(number) The optional day

## ~blog_post_by_id
Returns a blog post by id
Parameters:
- blog_post_id(id) The id of the blog post to look up

## ~blog_post_summary_wrapper


## ~blog_recent_author_posts
Returns a sequence of blog post objects for the specified blog, by the specified author, sorted by most recent first
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- author_slug(author slug) Specifies which author to filter on
- limit(number) Specifies the number of posts to add to the sequence up to a limit of 200

## ~blog_recent_posts
Returns a sequence of blog post objects for the specified blog, sorted by most recent first
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- limit(number) Specifies the number of posts to add to the sequence, maximum 200.

## ~blog_recent_tag_posts
Returns a sequence of blog post objects for the specified blog, for the specified tag, sorted by most recent first
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- tag_slug(tag slug) Specifies which tag to filter on
- limit(number) Specifies the number of posts to add to the sequence
- logical_operator(string) Logical operator which, when tag_slug is a list, specifies how to logically filter on the slugs. Must be one of 'AND', 'OR'

## ~blog_recent_topic_posts
DEPRECATED -- see 'blog_recent_tag_posts'
Returns a sequence of blog post objects for the specified blog, for the specified topic, sorted by most recent first
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- topic_slug(topic slug) Specifies which topic to filter on
- limit(number) Specifies the number of posts to add to the sequence

## ~blog_social_sharing
Blog social sharing module
Parameters:
- select_blog('default' or blog id) Species which blog is connected to the share counters
- downgrade_shared_url(boolean) Use http in the url sent to the social media networks. Used to preserve counts when upgrading domains to https only.

## ~blog_subscribe
Blog subscription module
Parameters:
- select_blog('default' or blog id) Selects which blog subscription form to render
- title(String) Defines text in a <heading_level> tag title above the subscribe form
- no_title(boolean)  If True, the <heading_level> tag above the title is removed
- response_message(String) Defines the inline thank-you message that is rendered when a user submits a form
- heading_level(String) Defines the heading level of the title
- edit_form_link(String) Generates a link that allows users to click through to the corresponding Form editor screen

## ~blog_tag_url
Returns a full URL to the specified tag's listing page for the specified blog
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- tag_slug(tag slug) Specifies which tag to link to

## ~blog_tags
Returns a sequence of the 250 most blogged-about tags (based on number of associated blog posts) for the specified blog, sorted by blog post count
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- limit(numeric) Max tags to return

## ~blog_topics
DEPRECATED -- see 'blog_tags'
Returns a sequence of the 250 most blogged-about topics (based on number of associated blog posts) for the specified blog, sorted by blog post count
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to use
- limit(numeric) Max topics to return

## ~blog_total_post_count
Returns the total number of published posts in the specified blog
Parameters:
- selected_blog(blog id or 'default') Specifies which blog to count

## ~boolean
A boolean option
Parameters:
- value(boolean) Determines whether the checkbox is checked or unchecked

## ~call
In some cases it can be useful to pass a macro to another macro. For this purpose you can use the special call block.

## ~choice
A list of options
Parameters:
- choices(String) Comma-separated list of values, or list of value-label pairs
- value(String) The default field value for the dropdown

## ~color
A color picker module
Parameters:
- color(String) A default HEX color value for the color picker module

## ~color_contrast
Returns true or false based on wheater or not given color combination passes the WCAG standard provided
Parameters:
- string(string) color code in a hex or rgb format
- string(string) color code in a hex or rgb format
- string(string) WCAG rating ('AA' or 'AAA') for A11y

## ~color_variant
Calculates a new hex color value based on a given input string var and multiplier
Parameters:
- base_color(hex color string (i.e. #fefefe)) The starting color to be altered
- brightness_offset(number) A positive or negative number used to lighten or darken the base color

## ~content_attribute
Sets default content in an attribute of the content object, such as content.email_body

## ~content_by_id
Returns a landing page, website page or blog post by id
Parameters:
- id(id) The id of the content to look up

## ~content_by_ids
Given a list of content ids, returns a dict of landing page, website page or blog posts matching those ids
Parameters:
- ids(list) A list of page or blog post ids to look up. Up to 100 content objects can be passed.

## ~crm_associations
Gets a list of associated objects from the HubSpot CRM based on the given object id, association category, and association definition id.Supported object types that can be retrieved are HubSpot built-in objects, portal specific objects, and integrator objects. For security, only portal specific objects and product can be retrieved on any public page. Any other built-in object types (except product) or integrator object types must be hosted on a page which is either password protected or requires a CMS Membership login. Objects are returned as a dict of properties and values.
Parameters:
- id(id) The id of object instance to retrieve the associations from.
- association_category(enumeration) The category of the association definition. Possible values are HUBSPOT_DEFINED, USER_DEFINED, and INTEGRATOR_DEFINED.
- association_definition id(number) The id of the association definition to use. Hubspot-defined association definition ids for the built-in object types can be found here https://legacydocs.hubspot.com/docs/methods/crm-associations/crm-associations-overview or you can use the API endpoint `/crm/v3/associations/{fromObjectType}/{toObjectType}/types` documented at https://developers.hubspot.com/docs/api/crm/associations
- query(string) Optional. Http Query Language(HQL) query to filter associated objects. The query can be formed with property expressions ANDed together using the & symbol. The supported expression operators are eq (default), neq, lt, lte, gt, gte, is_null, not_null, in, not_in, and contains(contains is only applicable for multi-valued properties). E.g. for an event "type=sports&date_gt=2020-06-01". If you want to filter by a property which has any of the given set of values, use `in` filter (e.g. type__in=sports,music). If you want to filter by a multi-select property which has all of the given values, use `contains` filter (e.g type__contains=sports,music). If a query is provided, the function will run the default query `offset=0&limit=10` to fetch the objects.
- properties(string) Optional. The list of property names that should be retrieved. If list is not provided then the properties defined as required are returned and all the properties will be returned if required properties is not defined. The object instance id is always included in the returned object properties even if it is not explicitly added in the property list.
- formatting(boolean) Optional. Format values such as dates and currency according to this portal's settings. Pass 'false' for raw strings.

## ~crm_object
Gets a single object from the HubSpot CRM by query or by instance id.Supported object types are HubSpot built-in objects, portal specific objects, and integrator objects.For security, only portal specific objects and product can be retrieved on any public page. Any other built-in object types (except product) or integrator object types must be hosted on a page which is either password protected or requires a CMS Membership login. Objects are returned as a dict of properties and values.
Parameters:
- object_type(string) The object type name e.g. 'contact', 'product', 'house_listing', 'publication', 'store_location'. For integrator object types the fully qualified name (FQN) should be used that is the type name prefixed by the app id, e.g. a34343_shipment. The only other case that the FQN should be used is when a portal specific custom object type has the same name as a HubSpot built-in object type, e.g. if a portal specific 'product' object type is needed then the FQN should be used instead of the simple type name like: p129292_contact (the number after the prefix 'p' is the portal id). Since the FQN of portal specific type carries the portal id, It is advised to avoid using the FQN for portal specific types to make the code portable across portals. Object type names are case sensitive except for built-in object types provided by HubSpot, e.g. 'CONTACT' and 'contact' refer to the same object type but 'House_Listing' is different than 'house_listing'
- query_or object instance id(string) The id of object instance to retrieve. Alternatively a Http Query Language(HQL) query with object type property expressions ANDed together using the & symbol. The supported expression operators are eq (default), neq, lt, lte, gt, gte, is_null, not_null, in, not_in, and contains(contains is only applicable for multi-valued properties). E.g. for an event "type=sports&date_gt=2020-06-01". If you want to filter by a property which has any of the given set of values, use `in` filter (e.g. type__in=sports,music).  If you want to filter by a multi-select property which has all of the given values, use `contains` filter (e.g type__contains=sports,music).
- properties(string) Optional. The list of property names that should be retrieved. If list is not provided then the properties defined as required are returned. if no required properties have been defined all the properties will be returned. The object instance id is always included in the returned object properties even if it is not explicitly added in the property list.
- formatting(boolean) Optional. Format values such as dates and currency according to this portal's settings. Pass 'false' for raw strings.

## ~crm_objects
Gets a list of object from the HubSpot CRM by query or by list of ids. For security, only product objects can be retrieved on any public page. Supported object types are HubSpot built-in objects, portal specific objects, and integrator objects.For security, only portal specific objects and product can be retrieved on any public page. Any other built-in object types (except product) or integrator object types must be hosted on a page which is either password protected or requires a CMS Membership login. Objects are returned as a list of dict of properties and values.To page through results, use limit and offset parameters on the query like limit=10&offset=20
Parameters:
- object_type(string) The object type name e.g. 'contact', 'product', 'house_listing', 'publication', 'store_location'. For integrator object types the fully qualified name (FQN) should be used that is the type name prefixed by the app id, e.g. a34343_shipment. The only other case that the FQN should be used is when a portal specific custom object type has the same name as a HubSpot built-in object type, e.g. if a portal specific 'product' object type is needed then the FQN should be used instead of the simple type name like: p129292_contact (the number after the prefix 'p' is the portal id). Since the FQN of portal specific type carries the portal id, It is advised to avoid using the FQN for portal specific types to make the code portable across portals. Object type names are case sensitive except for built-in object types provided by HubSpot, e.g. 'CONTACT' and 'contact' refer to the same object type but 'House_Listing' is different than 'house_listing'
- query_or list of object ids(string | list) Optional. The list of object instance ids to retrieve. Alternatively a Http Query Language(HQL) query with object type property expressions ANDed together using the & symbol. The supported expression operators are eq (default), neq, lt, lte, gt, gte, is_null, not_null, in, not_in, and contains(contains is only applicable for multi-valued properties). E.g. for an event "type=sports&date_gt=2020-06-01". If you want to filter by a property which has any of the given set of values, use `in` filter (e.g. type__in=sports,music). If you want to filter by a multi-select property which has all of the given values, use `contains` filter (e.g type__contains=sports,music). If neither a list of object instance ids nor a query is provided, the function will run the default query `offset=0&limit=10` to fetch the objects.
- properties(string) Optional. The list of property names that should be retrieved. If list is not provided then the properties defined as required are returned and all the properties will be returned if required properties is not defined. The object instance id is always included in the returned object properties even if it is not explicitly added in the property list.
- formatting(boolean) Optional. Format values such as dates and currency according to this portal's settings. Pass 'false' for raw strings.

## ~crm_property_definition
Gets the property definition for a given object type and property name. Supported object types are HubSpot built-in objects, portal specific objects, and integrator objects.For security, only portal specific objects and product can be retrieved on any public page. Any other built-in object types (except product) or integrator object types must be hosted on a page which is either password protected or requires a CMS Membership login. 
Parameters:
- object_type(string) The object type name e.g. 'contact', 'product', 'house_listing', 'publication', 'store_location'. For integrator object types the fully qualified name (FQN) should be used that is the type name prefixed by the app id, e.g. a34343_shipment. The only other case that the FQN should be used is when a portal specific custom object type has the same name as a HubSpot built-in object type, e.g. if a portal specific 'product' object type is needed then the FQN should be used instead of the simple type name like: p129292_contact (the number after the prefix 'p' is the portal id). Since the FQN of portal specific type carries the portal id, It is advised to avoid using the FQN for portal specific types to make the code portable across portals. Object type names are case sensitive except for built-in object types provided by HubSpot, e.g. 'CONTACT' and 'contact' refer to the same object type but 'House_Listing' is different than 'house_listing'
- property_name(string) The case-insensitive property name to retrieve the definition for. 

## ~crm_property_definitions
Gets the property definitions for a given object type and set of property names. Supported object types are HubSpot built-in objects, portal specific objects, and integrator objects.For security, only portal specific objects and product can be retrieved on any public page. Any other built-in object types (except product) or integrator object types must be hosted on a page which is either password protected or requires a CMS Membership login. 
Parameters:
- object_type(string) The object type name e.g. 'contact', 'product', 'house_listing', 'publication', 'store_location'. For integrator object types the fully qualified name (FQN) should be used that is the type name prefixed by the app id, e.g. a34343_shipment. The only other case that the FQN should be used is when a portal specific custom object type has the same name as a HubSpot built-in object type, e.g. if a portal specific 'product' object type is needed then the FQN should be used instead of the simple type name like: p129292_contact (the number after the prefix 'p' is the portal id). Since the FQN of portal specific type carries the portal id, It is advised to avoid using the FQN for portal specific types to make the code portable across portals. Object type names are case sensitive except for built-in object types provided by HubSpot, e.g. 'CONTACT' and 'contact' refer to the same object type but 'House_Listing' is different than 'house_listing'
- property_name(string) Optional. The case-insensitive property names to retrieve the definition for. If empty, the definitions for all the properties will be retrieved.

## ~cta
Renders a CTA module
Parameters:
- embed_code(String) The embed code for the CTA
- full_html(String) The embed code for the CTA. Same as embed_code
- image_src(String) Image src url that defines the preview image in the content editor
- image_editor(String) Markup for the image editor preview
- guid(String) The unique ID number of the default CTA
- cta_id(String) The id or guid of an embedded cta
- image_html(String) CTA image HTML without the CTA script
- image_email(String) Email-friendly version of the CTA code

## ~custom_widget
A custom module
Parameters:
- widget_definition(json object) 
- widget_name(String) Specifies the internal Design Manager name of the custom module that you would like to render

## ~cycle
The cycle tag can be used within a for loop to cycle through a series of string values and print them with each iteration
Parameters:
- string_to_print(String) A comma separated list of strings to print with each interation. The list will repeat if there are more iterations than string parameter values.

## ~data_token
Returns the value of any data in the context.
Parameters:
- expression(string) An expression for the object and property to render
- default(string) (Optional) A default value to use if the expression has no value
- options(dict) (Optional) Options for rendering data token

## ~datetimeformat
formats a date to a string
Parameters:
- var(date) 
- format(String) 
- timezone(String) Time zone of output date

## ~display_call_to_action
Returns the JS needed to display a call to action
Parameters:
- id(id) The id of the call to action to look up

## ~do
Evaluates expression without printing out result.

## ~email_each
Allows looping over a list value in an email where a for loop would not work. Use "item." to access the current element of the list.
Parameters:
- list(String) 
- item(String) 

## ~email_flex_area
An email flexible area tag is a widget container which renders its contained widgets in a box grid, 
with an email friendly table-based layout.

The layout schema is defined in a JSON structure at the content level; these tags are always empty
in their declaring templates.
Parameters:
- name(String) 
- no_wrapper(boolean) 
- extra_classes(String) 

## ~email_simple_subscription
Simple email unsubscribe form
Parameters:
- header(String) Renders text in an h1 tag above the unsubscribe form
- subheader(String) Renders text in an h2 tag above the unsubscribe form below the h1
- header_heading_level(String) Defines the heading level of the header
- subheader_heading_level(String) Defines the heading level of the subheader
- input_help_text(String) Renders help text in an h3 tag above your email unsubscribe form field
- button_text(String) Changes the text of the unsubscribe form submit button
- input_placeholder(String) Adds placeholder text within the email address form field
- error_info_text(String) Renders error text in an h3 tag

## ~email_subscriptions
Email subscription preferences form
Parameters:
- header(String) Renders text in an h1 tag above the subscription preferences form
- subheader_text(String) Populates text below the heading above the unsubscribe preferences
- header_heading_level(String) Defines the heading level of the header
- email_heading_level(String) Defines the heading level of the subheader
- language_select_label_text(String) Provides the label for the language select label element
- unsubscribe_single_text(String) Renders text in a <p class="header"> above the subscription options
- unsubscribe_all_text(String) Renders text in a <p class="header"> above the unsubscribe from all emails checkbox input
- unsubscribe_all_unsubbed_text(String) Populates text within a <p> that renders, if a contact is currently unsubscribed from all emails
- unsubscribe_all_option(String) Sets the text next to the unsubscribe from all emails checkbox input
- button_text(String) Sets the text of the submit button that updates subscription preferences
- resubscribe_button_text(String) Sets the text of the submit button for when contacts are resubscribing

## ~email_subscriptions_confirmation
Email unsubscribe form
Parameters:
- header(String) Renders text in an h1 tag above the unsubscribe form
- subheader_text(String) Populates text above the confirmation message
- header_heading_level(String) Defines the heading level of the header
- email_heading_level(String) Defines the heading level of the subheader
- unsubscribe_all_success(String) Sets the text that will display when someone unsubscribes from all email communications
- subscription_update_success(String) Sets the text when a recipient updates his or her subscription preferences

## ~extends
Template inheritance allows you to build a base “skeleton” template that contains all the common elements of your site and defines blocks that child templates can override.
Parameters:
- path(String) Design Manager file path to parent template

## ~facebook_messenger_link
Returns an m.me link for facebook messenger

## ~file_by_id
Returns the metadata of a file by ID
Parameters:
- file_id(id) The ID of the file to look up

## ~files_by_ids
Returns the metadata of a list of files by ID
Parameters:
- file_ids(list) The list of file ids to look up.

## ~flag_content_for_access_check
Marks content id for later access check and creates field hs-member-content-access
Parameters:
- id(id) The id of the content to check access for the logged in member

## ~flip
Outputs the first and second block in specified or reverse order depending on the evaluation of the condition

## ~follow_me
Deprecated: Use follow me default module instead.
Parameters:
- title(String) Prints an h3 heading tag above the follow me module
- module_title_tag(String) Specifies a heading tag h1-h6 to use for the module title

## ~follow_me_links
Returns a list of configured follow me links for the portal

## ~footer_js
Outputs all javascript enqueued for the head as html

## ~for
Outputs the inner content for each item in the given iterable
Parameters:
- items_to_iterate(String) Specifies the name of a single item in the sequence or dict.

## ~form
Insert one of the forms created in the Form Manager
Parameters:
- form_key(String) A unique id to target this form instance on the page
- form_to_use(String) The form ID of the form to render by default
- title(String) Populates an h3 header tag above the form
- no_title(boolean) If True, the h3 tag above the title is removed.
- form_follow_ups_follow_up_type(enum no_action|simple|automation) Specifies follow up action
- simple_email_for_live_id(number) Specifies the ID of the simple follow-up email for the live page
- simple_email_for_buffer_id(number) Specifies the ID of the simple follow-up email for the auto-save version of a page
- follow_up_type_simple(boolean) If true, enables a simple follow-up email
- follow_up_type_automation(boolean) If true, enrolls submissions in a workflow
- simple_email_campaign_id(number) Specifies the ID of the simple follow-up email
- form_follow_ups_workflow_id(number) Specifies the ID of the follow-up workflow
- response_redirect_url(String) If redirecting to an external page, this parameter specifies the URL to redirect to
- response_redirect_id(number) If redirecting to HubSpot hosted page, this parameter specifies the page ID of that page
- response_response_type(enum inline|redirect) Determines whether to redirect to another page or to display an inline thank you message on submission
- response_message(String) Sets an inline thank you message
- notifications_are_overridden(boolean) If True, the form will send notifications to specified addresses selected in the notifications_override_email_addresses
- notifications_override_guid_buffer(String) ID of override settings in auto-save version of page
- notifications_override_guid(String) ID of override settings in live version of page
- notifications_override_email_addresses(JSON list) (Deprecated) These email addresses will override  the email notification settings set in the form
- notifications_override_user_ids(JSON list) The user IDs to override email addresses for the email notification settings set in the form
- gotowebinar_webinar_key(String) Specifies the GoToWebinar webinar to enroll contacts who submit the form into
- sfdc_campaign(String) Specifies the Salesforce campaign to enroll contacts who submit the form into
- override_styles(json object) Override config for forms styles
- title_heading_level(String) Defines the heading level of the title
- is_survey(boolean) 

## ~format_address
Formats an address based on locale
Parameters:
- locale(String) 
- fullAddress(String) fullAddress object, {address: string, address2: string, city: string, state: string country: string zip: string} Address, city, state, country and zip are required. Address2 is an optional field.

## ~format_company_name
Formats a company's name by adding Japanese honorifics where appropriate
Parameters:
- name(String) Name of the company
- useHonorificIfApplicable(boolean) When this is set to true and the context's language is in Japanese, this will add a Japanese company honorific where appropriate

## ~format_date


## ~format_datetime


## ~format_name
Formats a person's name by putting the surname before the first name and adds Japanese honorifics where appropriate
Parameters:
- firstName(String) Person's first name
- surname(String) Person's surname or last name
- useHonorificIfApplicable(boolean) When this is set to true and the context's language is in Japanese, this will add a Japanese customer honorific where appropriate

## ~format_time


## ~from
Alternative to the import tag that lets you import and use specific macros from one template to another
Parameters:
- path(String) Design Manager path to file to import from
- macro_name(String) Name of macro or comma separated macros to import (import macro_name)

## ~gallery
Gallery
Parameters:
- slides(json list) A JSON list of the default caption, the link url, the alt text, the image src, and whether to open in a new tab
- loop_slides(boolean) When True, continuously loop through slides
- num_seconds(number) Time in seconds to pause between slides
- show_pagination(boolean) Provide buttons below slider to randomly navigate among slides
- sizing(enum static|resize) Determines whether the slider changes sizes, based on the height of the slides
- auto_advance(boolean) Automatically advance slides after the time set in num_seconds
- transition(enum slide|) Sets the type of slide transition
- caption_position(enum below|superimpose) Affects positioning of caption on or below the slide
- display_mode(enum standard|thumbnail|lightbox) Determines which mode the slider will display
- lightboxRows(number) Rows in lightbox mode

## ~geo_distance
Calculates the ellipsoidal 2D distance between two points on Earth
Parameters:
- point1(location) location from a HubDB column
- point2_lat(number) latitude of point2
- point2_long(number) longitude of point2
- units(string) Units for the return value. Options are FT for feet, MI for miles, M for meters or KM for kilometers

## ~get_asset_url
Returns URL to specified asset by given path
Parameters:
- path(String) The Design Manager file path to the template or file

## ~get_asset_version


## ~get_module_breakpoint_styles
Generates mapping between breakpoint names to an object with media query and breakpoint styles

## ~get_public_template_url
Returns URL to specified template by given path

## ~get_public_template_url_by_id
Returns URL to specified template by id
Parameters:
- template_id(number) The ID number of the template of file

## ~get_rss_url
Returns a URL for a specified RSS listing
Parameters:
- attributes(dict) Dictionary of parameters corresponding to most parameters of the rss listing tag. Supports 'show_date'(true/false), 'show_author'(true/false), 'show_detail'(true/false), 'limit_to_chars'(Number), 'publish_date_format'('short'/'medium'/'long' or a custom format such as "MMMM d, yyyy 'at' h:mm a"), 'click_through_text'(String), 'include_featured_image'(true/false), 'is_external'(true/false), 'number_of_items'(Number), 'publish_date_language'(String), 'rss_url'(String), 'content_group_id (Number)', 'select_blog'(String), and 'tag_id'(Number)

## ~get_theme_breakpoint_styles
Generates mapping between breakpoint names to an object with media query and breakpoint styles

## ~global_module


## ~global_widget
A global widget is one which can be shared across templates
Parameters:
- global_widget_name(String) Global module name

## ~google_search
Allow visitors to search your site on Google
Parameters:
- prefill_input_with_pathname(boolean) Uses the end part of the URL to fill the search query field
- search_field_label(String) Populates the label text in the <label> above the search input
- search_button_text(String) Populates the text of the search submit button <a>

## ~head_css
Outputs all loaded css as html

## ~head_elements
Outputs all additional elements for the head as html

## ~head_js
Outputs all javascript enqueued for the head as html

## ~header
One line of text to be displayed in a large font size
Parameters:
- header_tag(String) Select which heading tag to render (h1-h6)
- value(String) Renders default text within the heading module

## ~hubdb_table
Returns information about a table
Parameters:
- table_id(string) id or name of the table

## ~hubdb_table_column
Returns column information for specific column in a table
Parameters:
- table_id(string) id or name of the table
- column(String) id or name of the column

## ~hubdb_table_row
Returns a row from a table by id
Parameters:
- table_id(string) id or name of the table
- row_id(number) id of the row of the table

## ~hubdb_table_rows
Returns a list of HubDB rows based on the query
Parameters:
- table_id(string) id or name of the table to query
- query(string) A query such in the same format as a URL query string. If not passed, returns all rows.

## ~i18n_getlanguage
Gets the language of the current page. Currently works only within modules.

## ~i18n_getmessage
Gets the translated message for the language of the rendered page. Currently works only within modules.
Parameters:
- message_name(String) The name of the message to look up
- substitutions(sequence of strings) numbered substitution values used in placeholder 'content' attributes

## ~icon
Render an icon from the HubSpot icon library
Parameters:
- name(String) The icon name
- icon_set(String) The icon set name. Currently defined sets: fontawesome-5 (see https://fontawesome.com/icons)
- style(String) The icon style. Regular, solid, or light
- format(String) The output format. svg or unicode
- width(String) The output image width. For svg format only
- height(String) The output image height. For svg format only
- purpose(String) The role of the icon in its context. Either 'semantic' or 'decorative'
- title(String) A descriptive title for the icon
- fill(String) Sets the fill parameter on the SVG output

## ~if
Outputs inner content if expression evaluates to true, otherwise evaluates any elif blocks, finally outputting content of any else block present
Parameters:
- condition(conditional expression) An expression that evaluates to either true or false

## ~image
Renders an image tag
Parameters:
- alt(String) Sets the default alt text for the image
- width(number) Sets the width attribute of the img tag
- height(number) Sets a min-height in a style attribute of the img tag for email templates only
- align(String) Sets the align attribute of the img tag (right, left, center)
- hspace(number) Sets the hspace attribute of the img tag
- style(String) Adds inline CSS declarations to the img tag
- src(String) Populates the src attribute of the img tag
- loading(String) Sets the loading attribute of the img tag

## ~image_slider
Image slider
Parameters:
- slides(json list) A JSON list of the default caption, the link url, the alt text, the image src, and whether to open in a new tab
- loop_slides(boolean) When True, continuously loop through slides
- num_seconds(number) Time in seconds to pause between slides
- show_pagination(boolean) Provide buttons below slider to randomly navigate among slides
- sizing(enum static|resize) Determines whether the slider changes sizes, based on the height of the slides
- auto_advance(boolean) Automatically advance slides after the time set in num_seconds
- transition(enum slide|) Sets the type of slide transition
- caption_position(enum below|superimpose) Affects positioning of caption on or below the slide
- lightbox(boolean) Displays thumbnail image in lightbox, when clicked
- only_thumbnails(boolean) Display images as thumbnails instead of a slider
- with_thumbnail_nav(boolean) Include thumbnails below slider for navigation
- display_mode(enum standard|thumbnail|lightbox) Determines which mode the slider will display
- version(string) Gallery Version Number
- lightboxRows(number) Rows in lightbox mode

## ~image_src
Prints the src attribute value of an image
Parameters:
- src(String) Specifies the default URL image src

## ~import
Allows you to access and use macros from a different template
Parameters:
- path(String) Design Manager path to file to import
- import_name(String) Give a name to the imported file to access macros from

## ~include
includes multiple files in one template or stylesheet
Parameters:
- path(String) Design Manager path to the file that you would like to include

## ~include_css
Generates stylesheet link tag for specified template path
Parameters:
- path(String) The Design Manager file path to the template or file

## ~include_custom_fonts


## ~include_dnd_partial


## ~include_javascript
Generates script include tag for specified template path
Parameters:
- path(String) 

## ~inline_image_field
Renders an image tag that can be edited inline inside modules
Parameters:
- alt(String) Sets the default alt text for the image
- width(number) Sets the width attribute of the img tag
- height(number) Sets a min-height in a style attribute of the img tag for email templates only
- align(String) Sets the align attribute of the img tag (right, left, center)
- hspace(number) Sets the hspace attribute of the img tag
- style(String) Adds inline CSS declarations to the img tag
- src(String) Populates the src attribute of the img tag
- loading(String) Sets the loading attribute of the img tag

## ~inline_rich_text
A rich text area that can be edited inline inside modules
Parameters:
- value(String) Sets the default content of the rich text module
- field(String) Required name of the module field to which this text is associated

## ~inline_richtext_field
A single line of text that can be edited inline inside modules
Parameters:
- field(String) Required name of the module field to which this text is associated

## ~inline_text
A single line of text with no formatting that can be edited inline inside modules
Parameters:
- value(String) The default text of the single line text field
- field(String) Required name of the module field to which this text is associated

## ~inline_text_field
A single line of text with no formatting that can be edited inline inside modules
Parameters:
- field(String) Required name of the module field to which this text is associated

## ~js_module


## ~js_partial


## ~language_switcher
Language switcher
Parameters:
- display_mode(enum localized|pagelang|hybrid) The language of the text in the language switcher. Pagelang means the names of languages will display in the language of the page the switcher is on. Localized means the name of each language will display in that language. Hybrid is a combination of the two.

## ~linked_image
Insert a linked image from File Manager.
Parameters:
- open_in_new_tab(boolean) Selects whether or not to open the destination URL in another tab
- target(String) Sets the target attr of link tag
- link(String) Sets the destination URL of the link that wraps the img tag
- alt(String) Sets the default alt text for the image
- width(number) Sets the width attribute of the img tag
- height(number) Sets a min-height in a style attribute of the img tag for email templates only
- align(String) Sets the align attribute of the img tag (right, left, center)
- hspace(number) Sets the hspace attribute of the img tag
- style(String) Adds inline CSS declarations to the img tag
- src(String) Populates the src attribute of the img tag
- loading(String) Sets the loading attribute of the img tag

## ~load_translations
Loads translations for a given path and returns a map of the values
Parameters:
- path(string) The Design Manager file path to the _locales directory of the translations
- language_code(string) The language code
- language_code_fallback(string) The language code fallback if original is not present

## ~locale_name
Returns a human-readable string representation of a language code (optionally translated to a target language)
Parameters:
- language_code(string) The language code
- target_language_code(string) The language that the output will be translated to

## ~logo
Logo image
Parameters:
- suppress_company_name(boolean) Hides company name if an image logo isn't set
- use_account_default(boolean) User can opt in to fetch company name from Accounts default
- override_inherited_src(boolean) If true, use src from logo widget rather than src inherited from settings or template.
- src(String) Populates the src attribute of the img tag
- alt(String) Sets the default alt text for the image
- link(String) Sets the destination URL of the link that wraps the img tag
- width(number) Sets the width attribute of the img tag
- height(number) Sets a min-height in a style attribute of the img tag for email templates only
- align(String) Sets the align attribute of the img tag (right, left, center)
- hspace(number) Sets the hspace attribute of the img tag
- style(String) Adds inline CSS declarations to the img tag
- open_in_new_tab(boolean) Selects whether or not to open the destination URL in another tab
- heading_level(String) Sets the link heading level. Can be one of h1, h2, h3, h4, h5, or h6

## ~macro
Macros allow you to print multiple statements with a dynamic value or values
Parameters:
- macro_name(String) The name given to a macro
- argument_names(String) Named arguments that are dynamically, when the macro is run

## ~member_login
Render a login form.
Parameters:
- email_label(String) Label for email input field
- password_label(String) Label for password input field
- remember_me_label(String) Label for Remember Me checkbox
- submit_button_text(String) Label for form submit button
- reset_password_text(String) Label for password reset link
- reset_password_link(String) Link to password reset request page
- show_password(String) Label for Show password buttons
- rate_limit_error(String) Error message shown when login rate limit is exceeded.
- membership_passwordless_auth_text(String) Label for OTP form submit button

## ~member_register
Render a registration form.
Parameters:
- email_label(String) Label for email input field
- password_label(String) Label for password input field
- password_confirm_label(String) Label for password confirm input field
- submit_button_text(String) Label for form submit button
- show_password(String) Label for Show password buttons
- password_requirements(String) Label describing Password Requirements

## ~menu
Advanced menu module
Parameters:
- flow(enum horizontal|vertical)  This adds classes to the menu tree so that they can be styled accordingly
- root_type(enum site_root|top_parent|parent|page_id|page_name|breadcrumb) Specifies the type of advanced menu
- root_key(String) Used to find the menu root. When root_type is set to page_id or page_name, this param should be the page ID or the label of the page, respectively
- max_levels(number) Determines how many levels of nested menus render in the markup
- flyouts(boolean) When true, a class is added to the menu tree that can be styled to allow child menu items will appear when you hover over the parent
- site_map_name(String) Name of menu tree from Advanced Menus
- id(String) The menu id from Advanced Menus

## ~module
A module
Parameters:
- module_id(String) The id of the module to render
- path(String) The path of the module to render. Include leading slash for absolute path, otherwise path is relative to template. Reference HubSpot default modules with paths corresponding to their HubL tags such as @hubspot/rich_text, @hubspot/linked_image, etc.

## ~module_asset_url
Gets the URL for an asset attached to a module
Parameters:
- name(String) The name of the asset

## ~module_attribute
Defines a rich attribute for a module. Only valid within a module_block tag

## ~namespace
Create a namespace object that can hold arbitrary attributes.It may be initialized from a dictionary or with keyword arguments.
Parameters:
- dictionary(Map) The dictionary to initialize with
- kwargs(NamedParameter...) Keyword arguments to put into the namespace dictionary

## ~oembed
Returns OEmbed data dictionary for given request. Only works in emails.
Parameters:
- request(String) Request object, {url: string, max_width: long, max_height: long}

## ~page_by_id
Returns a landing or website page by id
Parameters:
- page_id(id) The id of the page to look up

## ~page_footer
Company copyright information footer

## ~password_prompt
Requests a password to access a landing page.
Parameters:
- submit_button_text(String) Label for button below password entry field
- password_placeholder(String) Placeholder text for the password field
- bad_password_message(String) Text to display if an incorrect password is entered

## ~password_reset
Render a password reset form.
Parameters:
- password_label(String) Label for password input field
- password_confirm_label(String) Label from password confirm field
- submit_button_text(String) Label for form submit button
- show_password(String) Label for Show password buttons
- password_requirements(String) Label describing Password Requirements

## ~password_reset_request
Render a password reset request form.
Parameters:
- email_label(String) Label for email input field
- submit_button_text(String) Label for form submit button
- password_reset_message(String) Message displayed after requesting a password reset email

## ~personalization_token
Returns the value of a contact or contact related property, or a default.
Parameters:
- expression(string) An expression for the object and property to render
- default(string) (Optional) A default value to use if the expression has no value

## ~post_filter
Include a list of links to filter blog posts. Filter posts by tag, month, or author. 
This module can only be used in templates for: Blog Post
Parameters:
- select_blog('default' or blog id) Selects the HubSpot blog to use for the listing
- expand_link_text(String) Text link to display if more posts than max_links number available
- title_tag(String) Sets the tag used for the list title 
- list_tag(String) Sets the tag used for the list
- list_title(String) List title to display
- max_links(number) Sets maximum number of links
- filter_type(enum author|month|tag) Selects the type of filter

## ~post_listing
Include a listing of links to blog posts. Order posts by date or popularity.
This module can only be used in templates for: Blog Post
Parameters:
- select_blog('default' or blog id) Selects the HubSpot blog to use for the listing
- title_tag(String) Sets the tag used for the list title
- list_tag(String) Sets the tag used for the list
- list_title(String) List title to display
- include_featured_image(boolean) Display featured image along with post link
- listing_type(enum recent|popular_all_time|popular_past_year|popular_past_six_months|popular_past_month) Selects the type of listing to render
- max_links(number) Sets maximum number of links

## ~postal_location
Returns the lat/lon location of a postal code
Parameters:
- postal_code(string) postal code of the location
- country_code(string) Country code for the postal code

## ~print
Echos the result of the expression
Parameters:
- expr(expression) Expression to print

## ~product_recommendations
Returns a list of products of most popular products in a portal based on their appearance in deals 
Parameters:
- store_id(string) The ID of the ecommerce store or 'all' or 'HS'
- limit(number) The max number of products to fetch
- currency(string) The optional currency
- min_price(number) The optional min price
- max_price(number) The optional max price
- enable_price_formatting(boolean) The optional flag to enable price formatting. Default to true.

## ~range
Return a list containing an arithmetic progression of integers. With one parameter, range will return a list from 0 up to (but not including) the value. With two parameters, the range will start at the first value and increment by 1 up to (but not including) the second value. The third parameter specifies the step increment. All values can be negative. Impossible ranges will return an empty list. Ranges can generate a maximum of 1000 values.
Parameters:
- start(number) 
- end(number) 
- step(number) 

## ~raw
Process all inner expressions as plain text

## ~raw_html
Insert custom HTML module
Parameters:
- value(String) Sets the default content HTML of the module

## ~related_blog_posts
Returns a list of related blog post objects for the specified blog, sorted by relevance for the given parameters
Parameters:
- blog_ids(comma separated blog ids) Limit results to these blog(s)
- blog_post_ids(comma separated blog post ids) Blog posts to use in similarity search
- blog_post_override(comma separated blog post ids) Blog posts that must be included in results
- limit(number) Max number of posts to return
- tags(comma separated tag names) The tag name(s) to filter with
- start_date(date (yyyy-mm-dd)) Earliest published date
- end_date(date (yyyy-mm-dd)) Latest published date
- blog_authors(comma separated blog author names) Limit results to these author name(s)
- path_prefixes(comma separated path prefixes) The path prefixes
- post_formatter(string) Name of macro to render a blog post
- featured_image_resize_options(object) options for resizing blog post featured image urls before passing them into the post_formatter. supports the same arguments as rewrite_image_url.
- allow_any_language(boolean) Bypass filtering posts to be the same language as the current blog post. Defaults to false.
- tag_boost(number) Boost for how much weight is given to relating posts with matching tags

## ~require_css
Enqueue an inline stylesheet

## ~require_head
Enqueue a head element

## ~require_js
Enqueue an inline script
Parameters:
- position(String) 

## ~resize_image_url
Rewrites the URL of an image in File Manager to a URL that will resize the image on request
Parameters:
- url(string) URL of a HubSpot-hosted image
- width(number) the new image width, in pixels
- height(number) the new image height, in pixels
- length(number) the new length of the largest side, in pixels
- upscale(boolean) use the resized image dimensions even if they would scale up the original image (images may appear blurry)
- upsize(boolean) return the resized image even if it is larger than the original in bytes

## ~rich_text
A block of text and content that can be styled with the editor.
Parameters:
- html(String) Sets the default content of the rich text module

## ~rss_listing
RSS Listing
Parameters:
- show_title(boolean) Shows or hides RSS feed title
- show_date(boolean) Displays post date
- show_author(boolean) Displays author name
- show_detail(boolean) Display post summary up to number of characters set by limit_to_chars parameter
- title(String) Populates a heading above the RSS feed listing
- limit_to_chars(number) Maximum number of characters to display in summary
- publish_date_format(String)  Format for the publish date. Possible values include 'short', 'medium', 'long', or custom (MMMM d, yyyy)
- attribution_text(String) The text which attributes an author to a post
- click_through_text(String) The text which will be displayed for the click through link at the end of a post summary
- publish_date_text(String) The text which indicates when a post was published
- include_featured_image(boolean) Displays featured image with post link for HubSpot generated RSS feeds
- item_title_tag(String) Specifies HTML tag of each post title
- is_external(boolean) RSS feed is from an external blog
- number_of_items(number) Maximum number of posts to display
- publish_date_language(String) Specifies the language of the publish date (for external feeds)
- rss_url(string) The URL where the RSS feed is located
- content_group_id(number) ID for blog when feed source is internal blog
- tag_id(number) ID for tag when feed source is internal blog
- select_blog('default' or blog id) Can be used to select an internal HubSpot blog feed
- feed_source(String) Set source for RSS feed (contains is_external, rss_url, and/or content_group_id

## ~script_embed
Defines an embeddable object which renders differently in the editor vs a live page
Parameters:
- type(String) Type of embeddable object (wistia|embedly)
- src(String) Object source
- title(String) Object title
- options(String) Options for particular type of embed
- description(String) Description of embed for SEO purposes

## ~section_header
An extra large, centered, header to denote an entire section
Parameters:
- header(String) Text to display in header
- subheader(String) Text to display in subheader
- heading_level(String) Sets the section heading level. Can be one of h1, h2, h3, h4, h5, or h6

## ~set
Assigns the value or result of a statement to a variable
Parameters:
- var(variable identifier) The name of the variable
- expr(expression) The value stored in the variable (string, number, boolean, or sequence

## ~set_response_code
Set the respond code as the specified code. 404 is the only supported code for now.
Parameters:
- code(integer) The http response code

## ~sign_postlisting_url
Returns a signed URL for the provided URL
Parameters:
- blog_id(number or default) The id of the blog or default blog for the postlisting.
- list_type(string) The type of the postlisting.
- max_links(number) The max links in the postlisting.
- tag_name(string) The name of a tag on which to filter results

## ~simple_menu
Simple menu, uses static link structure
Parameters:
- orientation(enum horizontal|vertical) Defines classes of menu markup to allow to style the orientation of menu items on the page
- menu_tree(json list) Menu structure including page link names and target URLs

## ~social_sharing
Allow visitors to share your page on social networks
Parameters:
- use_page_url(boolean) If true, the module shares the URL of the page by default
- link(String) Specifies a different URL to share
- pinterest(JSON) Parameters for Pinterest link format and icon image source
- twitter(JSON) Parameters for Twitter link format and icon image source
- linked_in(JSON) Parameters for LinkedIn link format and icon image source
- facebook(JSON) Parameters for Facebook link format and icon image source
- email(JSON) Parameters for email sharing link format and icon image source 

## ~space
Used to add an empty module for spacing to the left or right of another module in a row

## ~strtodate
converts a string and date format into a date object
Parameters:
- dateString(string) date as string
- dateFormat(string) format of the date string

## ~strtotime
converts a string and datetime format into a datetime object
Parameters:
- var(datetimeString) datetime as string
- var(datetimeFormat) format of the datetime string

## ~style_settings
Provides style context from a template that will be used when a style is not defined on the content object

## ~super
Only usable within blocks, will render the contents of the parent block by calling super.

## ~targeted_module_attribute
Defines a smart object parameter for a module. Only valid within a module_block tag definition.
Parameters:
- criterion_id(number) The smart rule ID number (set up in Template Builder and clone to file)
- order(String) Zero indexed order of smart rules
- target_type(String) Type of smart module

## ~targeted_widget_attribute
Defines a smart object parameter for a widget. Only valid within a widget_block tag definition.
Parameters:
- criterion_id(number) The smart rule ID number (set up in Template Builder and clone to file)
- order(String) Zero indexed order of smart rules
- target_type(String) Type of smart module

## ~text
A single line of text with no formatting
Parameters:
- value(String) Sets the default text of the single line text field

## ~textarea
Creates an editable plaintext text area
Parameters:
- value(String) Sets the default text of the textarea

## ~to_local_time
Converts a UNIX timestamp to a date in the portal's timezone
Parameters:
- date(datetime) UNIX timestamp to convert to local time

## ~today


## ~topic_cluster_by_content_id
Returns topic cluster associated with a piece of content.
Parameters:
- content_id(id) The id of the page to look up

## ~truncate
truncates a given string to a specified length
Parameters:
- string(string) String to be truncated
- length(number) Specifies the length at which to truncate the text (includes HTML characters)
- killwords(boolean) If true, the string will cut text at length
- end(String) The characters that will be added to indicate where the text was truncated

## ~type


## ~unique_string
Creates a distinctive string based on the input string
Parameters:
- string(string) value used to produce a unique string

## ~unixtimestamp


## ~unless
Unless is a conditional just like 'if' but works on the inverse logic.
Parameters:
- expr(expression) Condition to evaluate

## ~video_metadata_by_player_id
Returns the metadata of a video by player id. Only works for videos files that allow embedding, sharing, and tracking.
Parameters:
- request(id) Request object, {id: long, domain: string}. Id is required. Domain is optional and will override the default domain of the video share url.

## ~video_player
A video player
Parameters:
- player_id(number) Id of the video player
- type(String) Type of the player embed code. The value can be iframe, script, or scriptv4
- width(number) Set the width attribute of the video player
- height(number) Set the height attribute of the video player
- hide_playlist(boolean) Hide the playlist if set to true
- viral_sharing(boolean) Display the social networks sharing button on the player if set to true
- embed_button(boolean) Display embed button on the player if set to true
- color(String) Player color
- playlist_color(String) Playlist color
- play_button_color(String) Player play button color
- style(String) Additional style for player
- conversion_asset(String) Event setting for player
- placeholder_alt_text(String) Alt text for video placeholder image
- autoplay(boolean) Plays the video on page load if set to true
- loop(boolean) Loops the video if set to true
- muted(boolean) Mute the player on load if set to true
- hidden_controls(boolean) Hide controls on the player if set to true
- full_width(boolean) Make player fit it's container by width

## ~video_thumbnail
Rewrites the URL of an image in File Manager to a URL that will overlay a play button on request.
Parameters:
- request(String) Request object, {url: string, width: integer, height: integer, color: string scale: double} Url has to be the url of a HubSpot-hosted image. One of height or width is required. Color (optional) is a hex color string. Scale (optional) is a number between 0.1 an 1, default scale is 0.5.

## ~widget_attribute
Defines a rich attribute for a widget. Only valid within a widget_block tag

## ~widget_block
A widget block can be used to define widget attribute values with rich content, using widget_attribute tags
Parameters:
- widgetType(valid HubL module type) 

## ~widget_container
Flexible column

## ~widget_wrapper
Used to compile an inline widget_wrapper from code

