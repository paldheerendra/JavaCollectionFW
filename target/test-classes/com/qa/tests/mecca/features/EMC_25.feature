@EMC-25
Feature: EMC-25 : Footer - Awards


@Desktop @CMS
Scenario: Check whether user able to configure following sections for Logos block
-Image
-Link (Optional)
-Link target (Optional)
-Alt text (Optional)

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Content Configuration tab
Then Click on Configuration
Then Navigate to Main Footer
Then Navigate to Trusted Partner Block
Then Configure following sections for each logo
|option|
|Image|
|Link (Optional)|
|Link target (Optional)|
|Alt text (Optional)|

Then Verify user able to configure following sections for each logo
|option|
|Image|
|Link (Optional)|
|Link target (Optional)|
|Alt text (Optional)|


@Desktop @Mecca
Scenario: Check whether user able to view all the awards Mecca has won in the past 1-2 years

Given Invoke the Mecca site on Desktop
When Navigate to footer 
Then Navigate to Awards block
Then Verify user able to view all the awards Mecca has won in the past 1-2 years
|option|
|block currently contains 4 awards :|
|EGR innovation in bingo|
|Best playtech bingo site|
|Best customer Service Mecca Bingo|
|Most socially responsible operator|


@Desktop @Mecca
Scenario: Check whether system displays alt text for Award images when user mouse hover on Images

Given Invoke the Mecca site on Desktop
When Navigate to footer
Then Navigate to Awards block
Then Move mouse hover Award images
Then Verify system displays alt text as below:
|option|
|EGR innovation in bingo:  “EGR innovation in bingo“|
|Best playtech bingo site:  “Best playtech bingo site“|
|Best customer Service Mecca Bingo: “Best customer Service Mecca Bingo“|
|Most socially responsible operator: “Most socially responsible operator“|



@Desktop @Mecca
Scenario: Check whether no action trigger when user clicks on any awards image

Given Invoke the Mecca site on Desktop
When Navigate to footer
Then Navigate to Awards block
Then User clicks on any award image
Then Verify No action triggered


@Desktop @Mecca
Scenario: Check whether when user resize bowser window ratio of the awards remain unchanged

Given Invoke the Mecca site on Desktop
Then Resize browser window
When Navigate to footer
Then Navigate to Awards block
Then Verify Awards block resizes to fit the screen such that
|option|
|the space between awards remain unchanged|
|the logos section will be divided in the rows needed to fit all the awards included|



@Mobile @Tablet
Scenario: Check whether user able to view all the awards Mecca has won in the past 1-2 years

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile 
Then Navigate to Awards block on Mobile
Then Verify user able to view all the awards Mecca has won in the past 1-2 years
|option|
|block currently contains 4 awards :|
|EGR innovation in bingo|
|Best playtech bingo site|
|Best customer Service Mecca Bingo|
|Most socially responsible operator|


Given Invoke the mecca site on Mobile in Landscape Mode
When Navigate to footer on Mobile 
Then Navigate to Awards block on Mobile
Then Verify user able to view all the awards Mecca has won in the past 1-2 years
|option|
|block currently contains 4 awards :|
|EGR innovation in bingo|
|Best playtech bingo site|
|Best customer Service Mecca Bingo|
|Most socially responsible operator|


@Mobile @Tablet
Scenario: Check whether no action trigger when user clicks on any awards image

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile 
Then Navigate to Awards block on Mobile
Then Move mouse hover Award images
Then Verify system displays alt text as below:
|option|
|EGR innovation in bingo:  “EGR innovation in bingo“|
|Best playtech bingo site:  “Best playtech bingo site“|
|Best customer Service Mecca Bingo: “Best customer Service Mecca Bingo“|
|Most socially responsible operator: “Most socially responsible operator“|


Given Invoke the mecca site on Mobile in Landscape Mode
When Navigate to footer on Mobile 
Then Navigate to Awards block on Mobile
Then Move mouse hover Award images
Then Verify system displays alt text as below:
|option|
|EGR innovation in bingo:  “EGR innovation in bingo“|
|Best playtech bingo site:  “Best playtech bingo site“|
|Best customer Service Mecca Bingo: “Best customer Service Mecca Bingo“|
|Most socially responsible operator: “Most socially responsible operator“|



 