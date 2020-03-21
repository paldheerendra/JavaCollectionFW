@EMC-27
Feature: EMC-27 : Footer - Useful links



@Desktop @Mecca @regression
Scenario: Check whether system displays folllowing URL under Useful Links block:
-Privacy Policy
-Terms and Conditions
-Our Mecca promise
-Affiliates
-Mecca Club Terms
-Play Online Casino
-Mecca Blog

Given Invoke the Mecca site on Desktop
Then Navigate to useful link block in footer
Then Verify following URLs are displaying under Useful Links block:
|option|
|Privacy Policy|
|Terms and Conditions|
|Our Mecca Promise|
|Affiliates|
|Mecca Club Terms|
|Play Online Casino|
|Mecca Blog|


@Desktop @Mecca @regression
Scenario: Check whether system navigate to "https://www.meccabingo.com/content/privacy-policy" on click of Privacy Policy link

Given Invoke the Mecca site on Desktop
Then Navigate to useful link block in footer
Then Click on Privacy Policy Link
Then Verify system navigates user to "https://www.meccabingo.com/content/privacy-policy"


@Desktop @Mecca @regression 
Scenario: Check whether system navigate to "https://www.meccabingo.com/content/terms-and-conditions" on click of Terms and Conditions link
Given Invoke the Mecca site on Desktop
Then Navigate to useful link block in footer
Then Click on Terms and Conditions Link
Then Verify system navigates user to "https://www.meccabingo.com/content/terms-and-conditions"


@Desktop @Mecca @regression 
Scenario: Check whether system navigate to "https://www.meccabingo.com/promise" on click of Our Mecca promise link

Given Invoke the Mecca site on Desktop
Then Navigate to useful link block in footer
Then Click on Our Mecca promise Link
Then Verify system navigates user to "https://www.meccabingo.com/promise"


@Desktop @Mecca @regression 
Scenario:  Check whether system navigate to "https://www.rankaffiliates.com/" on click of Affiliates link

Given Invoke the Mecca site on Desktop
Then Navigate to useful link block in footer
Then Click on Affiliates Link
Then Verify system navigates user to "https://www.rankaffiliates.com/"


@Desktop @Mecca @regression
Scenario: Check whether system navigate to "https://www.meccabingo.com/content/club-terms-and-conditions" on click of Mecca Club Terms link


Given Invoke the Mecca site on Desktop
Then Navigate to useful link block in footer
Then Click on Mecca Club Terms Link
Then Verify system navigates user to "https://www.meccabingo.com/content/club-terms-and-conditions"


@Desktop @Mecca @regression 
Scenario: Check whether system navigate to "https://www.grosvenorcasinos.com/" on click of Play Online Casino link

Given Invoke the Mecca site on Desktop
Then Navigate to useful link block in footer
Then Click on Play Online Casino Link
Then Verify system navigates user to "https://www.grosvenorcasinos.com/"


@Desktop @Mecca 
Scenario: Check whether system navigate to "https://blog.meccabingo.com/" on click of Mecca Blog link

Given Invoke the Mecca site on Desktop
Then Navigate to useful link block in footer
Then Click on Mecca Blog Link
Then Verify system navigates user to "https://blog.meccabingo.com/"


@Desktop @Mecca @deprecated
Scenario: Check whether text for each links remain unchanged when user resize browser

Given Invoke the Mecca site on Desktop
Then Resize browser window to Tablet view
Then Verify links in useful link block are:
|option|
|text of each link remains unchanged|
|whole word is always visible|
|space between links remain unchanged|
|links are distributed proportionally among the 2 rows|

Then Resize browser window to Mobile view
Then Verify links in useful link block are:
|option|
|text of each link remains unchanged|
|whole word is always visible|
|space between links remain unchanged|
|links are distributed proportionally among the 2 rows|


@Desktop @Mecca @deprecated
Scenario: Check whether system highlight link from text when user move mouse hover on it

Given Invoke the Mecca site on Desktop
When Navigate to useful link block in footer
Then Move mouse hover any Link available within block
And Verify system highlight link from text when selected


@Mobile @Tablet @regression
Scenario: Check whether system displays folllowing URL under Useful Links block:
-Privacy Policy
-Terms and Conditions
-Our Mecca promise
-Affiliates
-Mecca Club Terms
-Play Online Casino
-Mecca Blog"

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to useful link block in footer on Mobile
Then Verify folllowing URLs are displaying under useful links block on mobile:
|option|
|Privacy Policy|
|Terms and Conditions|
|Our Mecca promise|
|Affiliates|
|Mecca Club Terms|
|Play Online Casino|
|Mecca Blog|


@Mobile @Tablet @regression
Scenario: Check whether system navigate to "https://www.meccabingo.com/content/privacy-policy" on click of Privacy Policy link

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to useful link block in footer on Mobile
Then Click on Privacy Policy Link
Then Verify system navigates user to "https://www.meccabingo.com/content/privacy-policy"


@Mobile @Tablet
Scenario: Check whether system navigate to "https://www.meccabingo.com/content/terms-and-conditions" on click of Terms and Conditions link

Given Invoke the mecca site on Mobile in Portrait Mode.
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
When Navigate to footer on Mobile
Then Navigate to useful link block on Mobile
Then Click on Terms and Conditions Link
Then Verify system navigates user to "https://www.meccabingo.com/content/terms-and-conditions"


@Mobile @Tablet
Scenario: Check whether system navigate to "https://www.meccabingo.com/promise" on click of Our Mecca promise link

Given Invoke the mecca site on Mobile in Portrait Mode.
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
When Navigate to footer on Mobile
Then Navigate to useful link block on Mobile
Then Click on Our Mecca promise Link
Then Verify system navigates user to "https://www.meccabingo.com/promise"


@Mobile @Tablet
Scenario: Check whether system navigate to "https://www.rankaffiliates.com/" on click of Affiliates link

Given Invoke the mecca site on Mobile in Portrait Mode.
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
When Navigate to footer on Mobile
Then Navigate to useful link block on Mobile
Then Click on Affiliates Link
Then Verify system navigates user to "https://www.rankaffiliates.com/"


@Mobile @Tablet
Scenario: Check whether system navigate to "https://www.meccabingo.com/content/club-terms-and-conditions" on click of Mecca Club Terms link

Given Invoke the mecca site on Mobile in Portrait Mode.
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
When Navigate to footer on Mobile
Then Navigate to useful link block on Mobile
Then Click on Mecca Club Terms Link
Then Verify system navigates user to "https://www.meccabingo.com/content/club-terms-and-conditions"


@Mobile @Tablet
Scenario: Check whether system navigate to "https://www.grosvenorcasinos.com/" on click of Play Online Casino link

Given Invoke the mecca site on Mobile in Portrait Mode.
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
When Navigate to footer on Mobile
Then Navigate to useful link block on Mobile
Then Click on Play Online Casino Link
Then Verify system navigate user to "https://www.grosvenorcasinos.com/"

@Mobile @Tablet
Scenario: Check whether system navigate to "https://blog.meccabingo.com/" on click of Mecca Blog link

Given Invoke the mecca site on Mobile in Portrait Mode.
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
When Navigate to footer on Mobile
Then Navigate to useful link block on Mobile
Then Click on Mecca Blog Link
Then Verify system navigates user to "https://blog.meccabingo.com/"


@Mobile @Tablet
Scenario: Check whether links are distributed proportionally among the 2 columns

Given Invoke the mecca site on Mobile in Portrait Mode.
When Login with valid credentials on mobile
Then Verify login Successful on Mecca
When Navigate to footer on Mobile
Then Navigate to useful link block on Mobile
Then Verify links are distributed proportionally among the 2 columns




