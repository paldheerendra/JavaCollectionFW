@EMC-11
Feature: EMC-11: Game Title test feature for Mecca Desktop

@Desktop @Mecca
Scenario: Check whether no action triggered when user clicks on Image from any slot 

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
Then Click on Image from any slot
Then Verify No Action triggered

@Desktop @Mecca
Scenario: Check whether no action triggered when user clicks on Title of the any slot

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
Then Click on Title of any slot
Then Verify No Action triggered

@Desktop @Mecca
Scenario: Check whether system displays brief info overlay on top of the slot image when user hover over "I" flag of any game tile

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
Then Mouse hover to 'I' flag of any game tile
Then Verify system displays brief info overlay on top of the slot image


@Desktop @Mecca
Scenario: Check whether system navigate user to Game details page when user clicks on "I" flag of any game tile

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
Then Click on 'I' flag of any game tile
Then Verify system navigate user to Game details page

@Desktop @Mecca
Scenario: Check whether no action triggered when user clicks on Flags or Jackpots flag of any slot

Given Invoke the Mecca site on Desktop
When Login with valid credentials
Then Verify login Successful on Mecca
Then Clicks on Flags or Jackpot flags of any slot
Then Verify No Action triggered

@Mobile  @Tablet
Scenario: Check whether system loads game in game window when user clicks on Image from any slot 

Given Invoke the mecca site on Mobile in Portrait Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Click on Image from any slot
Then Verify system loads game in game window

Given Invoke the mecca site on Mobile in LandScape Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Click on Image from any slot
Then Verify system loads game in game window


@Mobile  @Tablet
Scenario: Check whether no action triggered when user clicks on Title of the any slot

Given Invoke the mecca site on Mobile in Portrait Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Click on Title of any slot
Then Verify No Action triggered on mobile

Given Invoke the mecca site on Mobile in LandScape Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Click on Title of any slot
Then Verify No Action triggered on mobile

@Mobile  @Tablet
Scenario: Check whether system navigate user to game details page when user clicks on Info CTA of any game tile

Given Invoke the mecca site on Mobile in Portrait Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Click on info CTA
Then Verify system navigate user to game details page 


Given Invoke the mecca site on Mobile in LandScape Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Click on info CTA
Then Verify system navigate user to game details page 


@Mobile @Tablet
Scenario: Check whether system loads game in game window when user clicks flags or jackpots flags from any slot

Given Invoke the mecca site on Mobile in Portrait Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Clicks on Flags or Jackpot flags of any slot
Then Verify system loads game in game window


Given Invoke the mecca site on Mobile in LandScape Mode
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
Then Clicks on Flags or Jackpot flags of any slot
Then Verify system loads game in game window

