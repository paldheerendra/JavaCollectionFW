@EMC-9
Feature: EMC-9: Header test feature for CMS and Mecca Desktop

@Desktop @CMS
Scenario: EMC-9_CMS_Check whether system displays menu when user create header block first time for site

Description: following menu :
-Navigation menu
-Mecca Logo
-Search 
-Deposit CTA
-Balance block
-My account icon 
-“Log In” CTA
-“Join Now“ CTA"

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Try to create Header under site settings
Then System displays following blocks for Header
|option|
|Navigation menu|
|Mecca Logo|
|Search| 
|Deposit CTA|
|Balance block|
|My account icon| 
|'Log In' CTA|
|'Join Now' CTA|

@Desktop @CMS
Scenario: Check whether system able to add or remove blocks from Header in CMS settings
Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Navigate to Site Settings > Header
Then Verify System displays header section under site settings
Then Try to remove any block from Header
And verify System allows to remove blocks from Header
Then Try to add any block from Header
And verify System allows to add blocks from Header


@Desktop @CMS
Scenario: Check whether system able to set different visibility on every block of the header

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Navigate to Site Settings > Header
Then Verify System displays header section under site settings
Then check system allows to set visibility for every block


@Desktop @CMS
Scenario: Check whether user able to secondary line (Balance) ONLY for mobile
Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Navigate to Site Settings > Header
Then Verify System displays header section under site settings
Then user able to Hide secondary line (Balance) ONLY for mobile

@Desktop @Mecca
Scenario: Check whether system displays following on header from Left to Right for logged IN customer on any Page on Desktop

Description: Following
- Mecca Logo
- Navigation menu
- Search loupe icon
- Deposit CTA
- Balance amount/dots +  Balance text  +    Hide/Unhide balance switch
-My account icon + number of unread messages

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
Then Verify System displays following at Header of the Page from Left to Right:
|Option|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Deposit CTA|
|Balance amount/dots +  Balance text  +    Hide/Unhide balance switch|
|My account icon + number of unread messages|

@Desktop @Mecca
Scenario: Check whether header have responsive behavior when user resize window from Desktop design to tablet design

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
Then Resize the window from Desktop to Tablet
Then Verify window should be resized to tablet view
And Verify it displays following at Header of the Page from Left to Right:
|option|
|Hamburger menu|
|Mecca Logo|
|Search loupe icon|
|Deposit CTA|
|Balance amount/dots +  Balance text  +    Hide/Unhide balance switch|
|My account icon + number of unread messages|

Then Resize the window from Tablet view to Desktop view
Then Verify window should be resized to desktop view
And Verify system displays following options at Header of the Page:
|option|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Deposit CTA|
|Balance amount/dots +  Balance text  +    Hide/Unhide balance switch|
|My account icon + number of unread messages|


@Desktop @Mecca
Scenario: Check whether header have responsive behavior when user resize window from Desktop to Mobile view

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
Then Resize the window from Desktop to Mobile
Then Verify window should be resized to Mobile view
And Verify it displays following at Header of the Page from Left to Right:
|option|
|Hamburger menu|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Deposit CTA|
|My account icon + number of unread messages|

And Verify it displays following on secondary line on the page from Left to right
|option|
|Balance text|
|Balance amount/dots|
|Hide/Unhide balance switch|

Then Resize the window from Mobile view to Desktop view
Then Verify window should be resized to desktop view
And Verify system displays following options at Header of the Page:
|option|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Deposit CTA|
|Balance amount/dots +  Balance text  +    Hide/Unhide balance switch|
|My account icon + number of unread messages|


@Mobile 
Scenario: Check whether system displays following on header from Left to Right for logged IN customer on any Page on Mobile device:
Description: Following
- Hamburger menu
- Mecca Logo
- Search loupe icon
- Deposit CTA
-My account icon + number of unread messages
Secondary line:
-Balance text 
-Balance amount/ dots 
-Hide/Unhide balance switch"


Given Invoke the mecca site on Mobile in Portrait Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
And Verify it displays following at Header of the Page from Left to Right:
|option|
|Hamburger menu|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Deposit CTA|
|My account icon + number of unread messages|

And Verify it displays following on secondary line on the page from Left to right
|option|
|Balance text|
|Balance amount/dots|
|Hide/Unhide balance switch|

@Mobile
Scenario: Check whether system displays following on header from Left to Right for logged IN customer on any Page on Mobile device:
Description: Following
- Hamburger menu
- Mecca Logo
- Search loupe icon
- Deposit CTA
-My account icon + number of unread messages
Secondary line:
-Balance text 
-Balance amount/ dots 
-Hide/Unhide balance switch"


Given Invoke the mecca site on Mobile in LandScape Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
And Verify it displays following at Header of the Page from Left to Right:
|option|
|Hamburger menu|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Deposit CTA|
|My account icon + number of unread messages|

And Verify it displays following on secondary line on the page from Left to right
|option|
|Balance text|
|Balance amount/dots|
|Hide/Unhide balance switch|


@Mobile @Tablet
Scenario: Check whether system displays following on header from Left to Right for logged IN customer on any Page on Mobile device:
- Hamburger menu
- Mecca Logo
- Search loupe icon
- Deposit CTA
-My account icon + number of unread messages"

Given Invoke the mecca site on Mobile in Portrait Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
And Verify it displays following at Header of the Page from Left to Right:
|option|
|Hamburger menu|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Deposit CTA|
|My account icon + number of unread messages|



@Mobile @Tablet
Scenario: Check whether system displays following on header from Left to Right for logged IN customer on any Page on Mobile device:
- Hamburger menu
- Mecca Logo
- Search loupe icon
- Deposit CTA
-My account icon + number of unread messages"

Given Invoke the mecca site on Mobile in LandScape Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
And Verify it displays following at Header of the Page from Left to Right:
|option|
|Hamburger menu|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Deposit CTA|
|My account icon + number of unread messages|

