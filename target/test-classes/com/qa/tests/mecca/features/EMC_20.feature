@EMC-20
Feature: EMC-20 : Header - Search icon

@Desktop @CMS
Scenario: Check whether able to select and add search block from header section.

Given CMS site should be accessed
When Login with valid user
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Navigate to Site Settings > Header
Then Verify System displays header section under site settings
When User select and add search block in header section
Then Verify system allows to add and select the search block in header section

@Desktop @Mecca
Scenario: Check whether system open search overlay in header of the  Page once selected in Logged out mode

Given Invoke the Mecca site on Desktop
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the system opens the search overlay box in Header of the Page


@Desktop @Mecca
Scenario: Check whether system open search overlay in header of the  Page once selected in Logged In mode

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the system opens the search overlay box in Header of the Page


@Desktop @Mecca
Scenario: Check whether once selected the loupe search icon background page gets greyed out in Logged Out mode

Given Invoke the Mecca site on Desktop
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the system opens the search overlay and the background is greyed out


@Desktop @Mecca
Scenario: Check whether once selected the loupe search icon background page gets greyed out in Logged In mode

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the system opens the search overlay and the background is greyed out

@Desktop @Mecca
Scenario: Check when resize the browser window from desktop to Tablet then the search icon resizes in Logged in State


Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
When Resize the window from browser window to Tablet view
Then Verify the search icon should be resized keeping the same aspect ratio at all times
When Resize from Tablet to Desktop
Then Verify the search icon should be resized keeping the same aspect ratio at all times


@Desktop @Mecca
Scenario: Check when resize the browser window from desktop to Tablet then the search icon resizes in Logged out State

Given Invoke the Mecca site on Desktop
When Resize the window from browser window to Tablet view
Then Verify the search icon should be resized keeping the same aspect ratio at all times
When Resize from Tablet to Desktop
Then Verify the search icon should be resized keeping the same aspect ratio at all times

@Desktop @Mecca
Scenario: Check when resize the browser window from desktop to Mobile then the search icon resizes in Logged in State

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
When Resize browser window from Desktop to Mobile
Then Verify the search icon should be resized keeping the same aspect ratio at all times
When Resize to Mobile to Desktop
Then Verify the search icon should be resized keeping the same aspect ratio at all times


@Desktop @Mecca
Scenario: Check when resize the browser window from desktop to Mobile then the search icon resizes in Logged out State

Given Invoke the Mecca site on Desktop
When Resize browser window from Desktop to Mobile
Then Verify the search icon should be resized keeping the same aspect ratio at all times
When Resize to Mobile to Desktop
Then Verify the search icon should be resized keeping the same aspect ratio at all times


@Desktop @Mecca
Scenario: Check when resize the browser window from desktop to Mobile breakpoint then page looses darker background in Logged in Mode

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
When Resize browser window till mobile Breakpoint
Then Verify page looses darker background

@Desktop @Mecca
Scenario: Check when resize the browser window from desktop to Mobile breakpoint then page looses darker background in Logged out Mode

Given Invoke the Mecca site on Desktop
When Resize browser window till mobile Breakpoint
Then Verify page looses darker background


@Mobile @Tablet
Scenario: Check whether system open search overlay below Header of the Page in Logged out Mode

Given Invoke the mecca site on Mobile in Portrait Mode
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the system opens the search overlay box below Header of the Page

Given Invoke the mecca site on Mobile in LandScape Mode
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the system opens the search overlay box below Header of the Page

@Mobile @Tablet
Scenario: Check whether system open search overlay below Header of the Page in Logged in Mode

Given Invoke the mecca site on Mobile in Portrait Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the system opens the search overlay box below Header of the Page

Given Invoke the mecca site on Mobile in LandScape Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the system opens the search overlay box below Header of the Page


@Mobile @Tablet
Scenario: Check whether once selected the loupe search icon background page gets greyed out

Given Invoke the mecca site on Mobile in Portrait Mode
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the systems opens the search overlay and the background is greyed out

Given Invoke the mecca site on Mobile in LandScape Mode
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the systems opens the search overlay and the background is greyed out


@Mobile @Tablet
Scenario: Check whether system open search overlay below Header of the Page in Logged in Mode

Given Invoke the mecca site on Mobile in Portrait Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the systems opens the search overlay and the background is greyed out

Given Invoke the mecca site on Mobile in LandScape Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Verify system displays Header which contains Search loupe icon
When Select the loupe search icon
Then Verify the systems opens the search overlay and the background is greyed out
