@EMC-18
Feature: EMC-18: Header- Logged out tests


@Desktop @CMS
Scenario: Check whether system displays following menu when user create header block first time for site :
Navigation menu
Mecca Logo
Search 
Deposit CTA
Balance block
My account icon 
“Log In” CTA
“Join Now“ CTA"

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

@Desktop @Mecca
Scenario: Check whether system displays following at Header of the Page from Left to Right:

Description: Following
- Mecca Logo
- Navigation menu
- Search loupe icon
- “Log In” CTA
- “Join Now“ CTA

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify System displays following at Header of the Page from Left to Right:
|Option|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Log In CTA|
|Join Now CTA|

@Desktop @Mecca
Scenario: Check whether header have responsive behavior when user resize window from Desktop design to tablet design

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify System displays following at Header of the Page from Left to Right:
|Option|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Log In CTA|
|Join Now CTA|

Then Resize the window from Desktop to Tablet
Then Verify window should be resized to tablet view
And Verify it displays following at Header of the Page from Left to Right:
|option|
|Hamburger menu|
|Mecca Logo|
|Search loupe icon|
|Log In CTA|
|Join Now CTA|

Then Resize the window from Tablet view to Desktop view
Then Verify window should be resized to desktop view
And Verify system displays following options at Header of the Page:
|option|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Log In CTA|
|Join Now CTA|


@Desktop @Mecca
Scenario: Check whether header have responsive behavior when user resize window from Desktop design to mobile design

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify System displays following at Header of the Page from Left to Right:
|Option|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Log In CTA|
|Join Now CTA|

Then Resize the window from Desktop to Mobile
Then Verify window should be resized to Mobile view
And Verify it displays following at Header of the Page from Left to Right:
|option|
|Hamburger menu|
|Mecca Logo|
|Search loupe icon|
|Log In CTA|
|Join Now CTA|

Then Resize the window from Mobile view to Desktop view
Then Verify window should be resized to desktop view
And Verify system displays following options at Header of the Page:
|option|
|Mecca Logo|
|Navigation menu|
|Search loupe icon|
|Log In CTA|
|Join Now CTA|

 
@Mobile  @Tablet
Scenario: Check whether system displays following at Header of the Page from Left to Right:

Description: Following
- Hamburger menu
- Mecca Logo
- Search loupe icon
- “Log In” CTA
- “Join Now“ CTA"

Given Invoke the mecca site on Mobile in Portrait Mode
And Verify it displays following at Header of the Page from Left to Right:
|option|
|Hamburger menu|
|Mecca Logo|
|Search loupe icon|
|Log In CTA|
|Join Now CTA|

Given Invoke the mecca site on Mobile in LandScape Mode
And Verify it displays following at Header of the Page from Left to Right:
|option|
|Hamburger menu|
|Mecca Logo|
|Search loupe icon|
|Log In CTA|
|Join Now CTA|


