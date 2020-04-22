@EMC-19
Feature: EMC-19: Header - Primary Navigation menu [Desktop]

@Desktop @CMS
Scenario: Check whether user able to configure visibility per menu Item 

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Bingo Tab
Then Verify System navigate user to Bingo Page and Bingo tab gets highlighted once selected


@Desktop @CMS
Scenario: Check whether user able to configure menu item in terms of :
- Icon
- Title
- link
- Link target (New window, same window)"

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Menu Item
Then Verify user able to configure menu item in terms of :
|option|
|Icon|
|Title|
|link|
|Link target (New window, same window)|


@Desktop @Mecca
Scenario: Check whether user able to navigate to Bingo Page on click of Bingo tab from Header

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify Bingo Option is available at Navigation Panel in  header section
When Clicks on Bingo Tab
Then Verify system navigates user to Bingo Page and Bingo tab gets highlighted once selected



@Desktop @Mecca
Scenario: Check whether user able to navigate to Slots Page on click of Slots tab from Header

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify Slots Option is available at Navigation Panel in header section
When Clicks on Slots Tab
Then Verify System navigates user to Slots Page and Slots tab gets highlighted once selected

@Desktop @Mecca
Scenario: Check whether user able to navigate to Casino Page on click of Casino tab from Header

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify Casino Option is available at Navigation Panel in header section
When Clicks on Casino Tab
Then Verify System navigates user to Casino Page and Casino tab gets highlighted once selected


@Desktop @Mecca
Scenario: Check whether user able to navigate to Jackpots Page on click of Jackpots tab from Header

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify Jackpots Option is available at Navigation Panel in header section
When Clicks on Jackpots Tab
Then Verify System navigates user to Jackpots Page and Jackpots tab gets highlighted once selected


@Desktop @Mecca
Scenario: Check whether user able to navigate to VIP Page on click of VIP tab from Header

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify VIP Option is available at Navigation Panel in header section
When Clicks on VIP Tab
Then Verify System navigates user to VIP Page and VIP tab gets highlighted once selected


@Desktop @Mecca
Scenario: Check whether user able to navigate to Clubs Page on click of Clubs tab from Header

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify Clubs Option is available at Navigation Panel in header section
When Clicks on Clubs Tab
Then Verify System navigates user to Clubs Page and Clubs tab gets highlighted once selected

@Desktop @Mecca
Scenario: Check whether user able to navigate to Help Page on click of Help tab from Header

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify Help Option is available at Navigation Panel in header section
When Clicks on Help Tab
Then Verify System opens Help Page in new window and Help tab gets highlighted once selected



@Desktop @Mecca
Scenario:  Check whether system do not display Community option in Navigation Panel at header

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify Community Option is not available at Navigation Panel in header section


@Desktop @Mecca
Scenario: Check whether Tab gets highlighted in yellow color when user mouse hover on option

Given Invoke the Mecca site on Desktop
When Navigate to Header section
Then Verify different tabs are available at navigation panel in header section
When Mouse hover on any option
Then Verify Tab gets highlighted in yellow color


@Desktop @Mecca
Scenario: Check whether while resizing from Desktop to Tablet menu changes to hamburger icon

Given Invoke the Mecca site on Desktop
When Resize window from desktop to Tablet view
Then Verify menu changes to Hemberger icon
When Resize from Tablet to Desktop
Then Verify Menu restore from hamburger to menu list

