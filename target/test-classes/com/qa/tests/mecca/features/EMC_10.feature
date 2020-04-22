@EMC-10
Feature: EMC-10: Footer test feature for CMS and Mecca Desktop

@Desktop @CMS
Scenario: Check whether Text section is available for "Rank Group" block
Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Content Configuration tab
Then Click on Configuration
Then Navigate to Main Footer
And Navigate to 'Rank Group' block
Then Verify text section is available for 'Rank Group' block

@Desktop @CMS
Scenario: Check whether Text section contains hyperlinks having following sections:
-Link
-Link Target
-alt Text"

Given CMS site should be accessed
When Login with valid user
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Click on Content Configuration tab
Then Click on Configuration
Then Navigate to Main Footer
And Navigate to 'Rank Group' block
Then Verify Text section should have hyper links with following sections:
|option|
|Link|
|Link Target|
|alt Text|


@Desktop @Mecca
Scenario: Check whether user navigate to https://www.gamblingcontrol.org/ link on clik of "The Alderney Gambling Control Commission"
Given Invoke the Mecca site on Desktop
When Navigate to footer 
Then navigate to Rank Group block
And Click on The Alderney Gambling Control Commission
Then Verify User navigate to "https://www.gamblingcontrol.org/ link"


@Desktop @Mecca
Scenario: Check whether user navigate to https://secure.gamblingcommission.gov.uk/PublicRegister/Search/Detail/38750 link on clik of "The UK Gambling Commission"
Given Invoke the Mecca site on Desktop
When Navigate to footer 
Then navigate to Rank Group block
And Click on The UK Gambling Commission
Then Verify User navigate to "https://secure.gamblingcommission.gov.uk/PublicRegister/Search/Detail/38750 link"



@Desktop @Mecca
Scenario: Check whether user navigate to https://www.begambleaware.org/ link on clik of "BeGambleAware"
Given Invoke the Mecca site on Desktop
When Navigate to footer 
Then navigate to Rank Group block
And Click on BeGambleAware
Then Verify User navigate to "https://www.begambleaware.org/ link"



@Desktop @Mecca
Scenario: Check whether system navigate user to http://www.rank.com/en/index.html url when user clicks on "Rank Group"
Given Invoke the Mecca site on Desktop
When Navigate to footer
Then Verify Text and Image block of Rank Group is available
Then Click on Text and Image block of "Rank Group"
Then Verify system navigate user to "http://www.rank.com/en/index.html"



@Desktop @Mecca
Scenario: Check whether Desktop_Check whether correct Text content is displayed for Rank Block

Given Invoke the Mecca site on Desktop
When Navigate to footer
Then Navigate to Text and Image block of Rank Group Block
And Verify the below text
|option|
|Licenses and regulated by The alderney Gambling Control Commision. Also licensed by The uk Gambling Commision for UK customers playing on our online sites or in our land based casinos/bingo clubs. Please visit BeGambleAware for advice. Mecca Bingo is part of the Rank Group. MECCA ad the MECCA logos are registered trade marks of Rank Leisure Holding Ltd.“ Text available for Rank Block|



@Desktop @Mecca
Scenario: Check whether text font remain unchanged when user resize browser

Given Invoke the Mecca site on Desktop
When Resize browser window to Tablet view and observe Rank Block
Then Verify text font remain unchanged
And Verify text shrinks and wraps to fit within the height and the width of the block
And Verify text size diminish

Then Resize browser window to Mobile view and observe Rank Block
Then Verify text font remain unchanged
And Verify text shrinks and wraps to fit within the height and the width of the block
And Verify text size diminish


@Desktop @Mecca
Scenario: Check whether system highlight link from text when user move mouse hover on it
Given Invoke the Mecca site on Desktop
When Navigate to footer
Then Navigate to Text and Image block of Rank Group Block
And Move mouse hover any Link available within text content"
Then Verify system highlights link from text when selected




@Mobile @Tablet
Scenario: Check whether user navigate to https://www.gamblingcontrol.org/ link on clik of "The Alderney Gambling Control Commission"
Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer 
Then navigate to Rank Group block
And Click on The Alderney Gambling Control Commission
Then Verify User navigate to "https://www.gamblingcontrol.org/ link"

Then Click on The UK Gambling Commission
And Verify User navigate to "https://secure.gamblingcommission.gov.uk/PublicRegister/Search/Detail/38750 link"

Then Click on BeGambleAware
And Verify User navigate to "https://www.begambleaware.org/ link"


Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer 
Then navigate to Rank Group block
And Click on The Alderney Gambling Control Commission
Then Verify User navigate to "https://www.gamblingcontrol.org/ link"

Then Click on The UK Gambling Commission
And Verify User navigate to "https://secure.gamblingcommission.gov.uk/PublicRegister/Search/Detail/38750 link"

Then Click on BeGambleAware
And Verify User navigate to "https://www.begambleaware.org/ link"


@Mobile @Tablet
Scenario: Check whether system navigate user to http://www.rank.com/en/index.html url when user clicks on "Rank Group"
Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer
Then Verify Text and Image block of Rank Group is available
Then Click on Text and Image block of "Rank Group"
Then Verify system navigate user to "http://www.rank.com/en/index.html"

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer
Then Verify Text and Image block of Rank Group is available
Then Click on Text and Image block of "Rank Group"
Then Verify system navigate user to "http://www.rank.com/en/index.html"


@Mobile @Tablet
Scenario: Check whether Desktop_Check whether correct Text content is displayed for Rank Block

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer
Then Navigate to Text and Image block of Rank Group Block
And Verify the below text
|option|
|Licenses and regulated by The alderney Gambling Control Commision. Also licensed by The uk Gambling Commision for UK customers playing on our online sites or in our land based casinos/bingo clubs. Please visit BeGambleAware for advice. Mecca Bingo is part of the Rank Group. MECCA ad the MECCA logos are registered trade marks of Rank Leisure Holding Ltd.“ Text available for Rank Block|

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer
Then Navigate to Text and Image block of Rank Group Block
And Verify the below text
|option|
|Licenses and regulated by The alderney Gambling Control Commision. Also licensed by The uk Gambling Commision for UK customers playing on our online sites or in our land based casinos/bingo clubs. Please visit BeGambleAware for advice. Mecca Bingo is part of the Rank Group. MECCA ad the MECCA logos are registered trade marks of Rank Leisure Holding Ltd.“ Text available for Rank Block|


@Mobile @Tablet
Scenario: Check whether system highlight link from text when user move mouse hover on it

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer
Then Navigate to Text and Image block of Rank Group Block
And Move mouse hover any Link available within text content"
Then Verify system highlights link from text when selected

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer
Then Navigate to Text and Image block of Rank Group Block
And Move mouse hover any Link available within text content"
Then Verify system highlights link from text when selected
