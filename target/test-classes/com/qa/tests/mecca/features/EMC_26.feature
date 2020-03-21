@EMC-26
Feature: EMC-26 : Footer - Privacy / Keep it fun


@Desktop @CMS
Scenario: Check whether user able to configure Image and Text for "Text and Image" block for footer

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Content Configuration tab
Then Click on Configuration
Then Navigate to Main Footer
And Navigate to  'Text and Image' block
Then Verify Check system displays image section to upload image and text section to write text for Text an Image block


@Desktop @CMS
Scenario: Check whether user not able to write text beyond maximum length in Text section for 'Text and Image' block 

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Content Configuration tab
Then Click on Configuration
Then Navigate to Main Footer
And Navigate to  'Text and Image' block
Then Verify User should not be able to write text beyond maximum length in Text section for 'Text and Image' block 


@Desktop @CMS
Scenario: Check whether user able to provide hyperlink to text in Text section for "Text and Image" block 

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Content Configuration tab
Then Click on Configuration
Then Navigate to Main Footer
And Navigate to  'Text and Image' block
Then Verify user should be able to provide hyperlink to text in Text section for 'Text and Image' block 



@Desktop @Mecca
Scenario: Check whether user able to view two text and one Image block at footer

Given Invoke the Mecca site on Desktop
When Navigate to footer
Then Navigate to Text and Image block
Then Verify user able to view two text and one Image block at footer


@Desktop @Mecca
Scenario: Check whether system navigate user to https://keepitfun.rank.com/" url when user clicks on "Keep it fun" logo or the "keepitfun.rank.com" website link

Given Invoke the Mecca site on Desktop
When Navigate to footer
Then Navigate to Text and Image block
Then Click on 'Keep it fun' logo or the 'keepitfun.rank.com" website link'
And Verify system navigate user to https://keepitfun.rank.com/" url


@Desktop @Mecca
Scenario: Check whether user able to view correct Text content for privacy and security block

Given Invoke the Mecca site on Desktop
When Navigate to footer
Given Invoke the Mecca site on Desktop
When Navigate to footer
Then Navigate to Text and Image block
Then Verify below text from privacy and security bolck:
|option|
|Your privacy and security is our number one priority here at Mecca|
|Bingo. We protect your account with market-leading security|
|technology so we're one of the safest bingo sites to play on. We never|
|sell or rent customer details|


@Desktop @Mecca
Scenario: Check whether user able to view correct Text content for keep it fun block

Given Invoke the Mecca site on Desktop
When Navigate to footer
Then Navigate to Text and Image block
Then Verify below text from keep it fun bolck:
|option|
|Whether you play with Mecca Bingo or Grosvenor Casinos, and|
|whether you play online, via mobile or in one of our land-based bingo|
|clubs or casinos, we believe that gambling is|
|something…|



@Desktop @Mecca
Scenario: Check whether aspect ratio of the of all logos remain unchanged when user resize window

Given Invoke the Mecca site on Desktop
Then Resize browser window to Tablet view
When Navigate to footer
Then Navigate to Text and Image block
And Verify logo and images are:
|option|
|the aspect ratio of the logo/image remain unchanged|
|the space between logo  and the text remain unchanged|
|the text font remain unchanged (default font size for tablet = 14pt)|
|the text shrinks and wraps to fit within the height and the width of the block|
|the text size diminish to fit the height of the logo/image|


Then Resize browser window to Mobile view
And Verify logo and images are:
|option|
|the aspect ratio of the logo/image remain unchanged|
|the space between logo  and the text remain unchanged|
|the text font remain unchanged (default 11pt Mobile - 14pt desktop)|
|the text shrinks and wraps to fit within the height and the width of the block|
|the text size diminish to fit the height of the logo/image|


@Desktop @Mecca
Scenario: Check whether system highlight link from text when selected


Given Invoke the Mecca site on Desktop
When Navigate to footer
Then Navigate to Text and Image block
And Mouse hover on Link available within text content
Then Verify system highlights link from text


@Mobile @Tablet
Scenario: Check whether user able to view two text and one Image block at footer

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Text and Image block on Mobile
Then Verify user able to view two text and one Image block at footer


@Mobile @Tablet
Scenario: Check whether system navigate user to https://keepitfun.rank.com/" url when user clicks on "Keep it fun" logo or the "keepitfun.rank.com" website link

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Text and Image block on Mobile
Then Click on 'Keep it fun' logo or the 'keepitfun.rank.com' website link
And Verify system navigate user to https://keepitfun.rank.com/" url



@Mobile @Tablet
Scenario: Check whether user able to view Text for privacy and security block

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Text and Image block on Mobile
Then Verify below text from privacy and security bolck:
|option|
|Your privacy and security is our number one priority here at Mecca|
|Bingo. We protect your account with market-leading security|
|technology so we're one of the safest bingo sites to play on. We never|
|sell or rent customer details|


@Mobile @Tablet
Scenario: Check whether user able to view Text for keep it fun block

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to keep it fun block on Mobile
Then Verify below text from keep it fun bolck:
|option|
|Whether you play with Mecca Bingo or Grosvenor Casinos, and|
|whether you play online, via mobile or in one of our land-based bingo|
|clubs or casinos, we believe that gambling is|
|something…|


