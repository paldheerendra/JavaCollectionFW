@EMC-21
Feature: EMC-21: Logo Tests


@Desktop @CMS
Scenario: Check whether able to select mecca logo component

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Navigate to Site Settings > Header
Then Verify System displays header section under site settings
When Select the mecca logo component under header
Then Verify system allows to select mecca logo component

@Desktop @CMS
Scenario: Check to configure following options under mecca logo block:
the image
the title (alt text)
the link
the link target "

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Navigate to Site Settings > Header
When Select the mecca logo component under header
Then Configure logo image, title(alt text), link, link target (same window, separate window)
Then Verify sysytem should be able to make configurations


@Desktop @Mecca
Scenario: Check while clicking on mecca logo, it takes to homepage within the same window in logged out mode

Given Invoke the Mecca site on Desktop
When Navigate to any other page
Then Verify system navigate to user to respective page
Then Click on mecca logo image from header
Then Verify systems takes to the homepage within the same window


@Desktop @Mecca
Scenario: Check while clicking on mecca logo, it takes to homepage within the same window in logged in mode

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
When Navigate to any other page
Then Verify system navigate to user to respective page
Then Click on mecca logo image from header
Then Verify systems takes to the homepage within the same window


@Desktop @Mecca
Scenario: Check alt text is populated when hover on the mecca logo in logged out Mode

Given Invoke the Mecca site on Desktop
When Hover on the Mecca logo
Then Verify system should show the alt text (the title) to user


@Desktop @Mecca
Scenario: Check alt text is populated when hover on the mecca logo in logged in Mode

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
When Hover on the Mecca logo
Then Verify system should show the alt text (the title) to user


@Desktop @Mecca
Scenario: Check when resize the browser window then the logo resizes keeping same aspect ratio at all times in logged out mode

Given Invoke the Mecca site on Desktop
Then Check customer is logged out
Then Verify no customer is logged in(i.e login is displayed)
When Resize browser window
Then Verify the logo should be resized keeping the same aspect ratio at all


@Desktop @Mecca
Scenario: Check when resize the browser window then the logo resizes keeping same aspect ratio at all times in logged in mode

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
When Resize browser window
Then Verify the logo should be resized keeping the same aspect ratio at all


@Mobile @Tablet
Scenario: Check while clicking on mecca logo, it takes to homepage within the same window in logged out mode

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to any other page
Then Verify system navigate to user to respective page
Then Click on mecca logo image from header
Then Verify systems takes to the homepage within the same window


Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to any other page
Then Verify system navigate to user to respective page
Then Click on mecca logo image from header
Then Verify systems takes to the homepage within the same window


@Mobile @Tablet
Scenario: Check while clicking on mecca logo, it takes to homepage within the same window in logged in mode

Given Invoke the mecca site on Mobile in Portrait Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
When Navigate to any other page
Then Verify system navigate to user to respective page
Then Click on mecca logo image from header
Then Verify systems takes to the homepage within the same window


Given Invoke the mecca site on Mobile in LandScape Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
When Navigate to any other page
Then Verify system navigate to user to respective page
Then Click on mecca logo image from header
Then Verify systems takes to the homepage within the same window

