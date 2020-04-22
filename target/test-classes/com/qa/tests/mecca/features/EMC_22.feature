@EMC-22
Feature: EMC-22 : Footer - Social Media

@Desktop @CMS @deprecated
Scenario: Check whether user able to configure following things for social media block:
-Icon
-Text
-Name
-Background color
-Hover background color
-Link URL
-Link target
-Alt text (Optional)"

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Toggle Navigation Panel
Then Click on Content Configuration tab in Mecca Redesign
Then Click on Configuration
Then Navigate to social media
Then Verify following are configured
|option|
|Twitter|
|Facebook|
|YouTube|
|Instagram|
Then Verify following things are availble in configuration for social media block:
|option|
|Name|
|Background colour|
|Image|
|Title|
|Alt text|
|Header|
|Subheader|
|Link URL|
|Link target|



@Desktop @Mecca @regression
Scenario: Check whether system displays following Social media components:
-Facebook
-Twitter
-Instagram
-Youtube"

Given Invoke the Mecca site on Desktop
Then Navigate to Social media Block in footer
Then Verify system displays following Social media components:
|option|
|Twitter|
|Facebook|
|Youtube|
|Instagram|


@Desktop @Mecca @regression
Scenario: Check whether system displays Icon, Text and Name for each social media block

Given Invoke the Mecca site on Desktop
Then Navigate to Social media Block in footer
And Verify system displays Icon, Text and Name for each social media block


@Desktop @Mecca @regression
Scenario: Check whether system navigate user to "https://www.facebook.com/MeccaBingo" url when user clicks on facebook block

Given Invoke the Mecca site on Desktop
Then Navigate to Social media Block in footer
Then Click on Facebook block from footer
Then Verify system navigate user to "https://www.facebook.com/MeccaBingo" url


@Desktop @Mecca @regression
Scenario: Check whether system navigate user to "https://www.instagram.com/meccabingo/" url when user clicks on Instatgram block

Given Invoke the Mecca site on Desktop
Then Navigate to Social media Block in footer
Then Click on Instagram block from footer
Then Verify system navigate user to "https://www.instagram.com/meccabingo/" url


@Desktop @Mecca @regression
Scenario: Check whether system navigate user to "https://twitter.com/MeccaBingo" url when user clicks on Twitter block

Given Invoke the Mecca site on Desktop
Then Navigate to Social media Block in footer
Then Click on twitter block from  footer
Then Verify system navigate user to "https://twitter.com/MeccaBingo" url


@Desktop @Mecca @regression
Scenario: Check whether system navigate user to "https://www.youtube.com/user/MeccaBingoClubs" url when user clicks on Youtube block

Given Invoke the Mecca site on Desktop
Then Navigate to Social media Block in footer
Then Click on youtube block from  footer
Then Verify system navigate user to "https://www.youtube.com/user/MeccaBingoClubs" url


@Desktop @Mecca @deprecated
Scenario: Check whether system highlight block in "#455B8B" color when user mouse hover on facebook block

Given Invoke the Mecca site on Desktop
Then Navigate to Social media Block in footer
Then User mouse hover on Facebook block from footer
Then Verify system highlight "Facebook" block in "#FFFFFF" color


@Desktop @Mecca @deprecated
Scenario: Check whether system highlight block in "#5796C7" color when user mouse hover on Instatgram block

Given Invoke the Mecca site on Desktop
Then Navigate to Social media Block in footer
Then User mouse hover on Instagram block from footer
Then Verify system highlight "Instagram" block in "#5796C7" color

@Desktop @Mecca @deprecated
Scenario: Check whether system highlight block in "#96180D" color when user mouse hover on Twitter block

Given Invoke the Mecca site on Desktop
Then Navigate to Social media Block in footer
Then User mouse hover on Twitter block from footer
Then Verify system highlight "Twitter" block in "#96180D" color


@Desktop @Mecca @deprecated
Scenario: Check whether system highlight block in "#BC1E11" color when user mouse hover on Youtube block

Given Invoke the Mecca site on Desktop
Then Navigate to Social media Block in footer
Then User mouse hover on Youtube block from footer
Then Verify system highlight "Youtube" block in "#BC1E11" color


@Desktop @Mecca @deprecated
Scenario: Check whether each social media block resizes to fit the screen when user resize browser window

Given Invoke the Mecca site on Desktop
When Resize browser window
Then Navigate to Social media Block in footer
Then Verify social media block resizes to fit the screen
And Verify following fonts are diminish for name, description, logo
|option|
|Twitter|
|Facebook|
|Youtube|
|Instagram|

@Desktop @Mecca @deprecated
Scenario: Check whether the social media sections gets divided in 2 rows when user resize browser window to reach mobile breakpoint

Given Invoke the Mecca site on Desktop
When Resize browser window to reach mobile breakpoint
Then Navigate to Social media Block in footer
Then Verify social media block resizes to fit the screen
And Verify following fonts are diminish for name, description, logo
|option|
|Twitter|
|Facebook|
|Youtube|
|Instagram|
And Verify following
|option|
|Social media sections gets divided in 2 rows|
|Each row has two social media blocks|

@Mobile @Tablet
Scenario: Check whether system displays following Social media components:
-Facebook
-Twitter
-Instagram
-YouTube"

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify system displays following Social media components:
|option|
|Facebook|
|Twitter|
|Instagram|
|YouTube|

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify system displays following Social media components:
|option|
|Facebook|
|Twitter|
|Instagram|
|YouTube|


@Mobile @Tablet
Scenario: Check whether system displays Icon, Text and Name for each social media block

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify system displays Icon, Text and Name for each social media block

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify system displays Icon, Text and Name for each social media block



@Mobile @Tablet
Scenario: Check whether system navigate user to "https://www.facebook.com/MeccaBingo" url when user clicks on facebook block

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Click on Facebook block from  footer
Then Verify system navigate user to "https://www.facebook.com/MeccaBingo" url

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Click on Facebook block from  footer
Then Verify system navigate user to "https://www.facebook.com/MeccaBingo" url


@Mobile @Tablet
Scenario: Check whether system navigate user to "https://www.instagram.com/meccabingo/" url when user clicks on Instagram block

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Click on Instagram block from  footer
Then Verify system navigate user to "https://www.instagram.com/meccabingo/" url

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Click on Instagram block from  footer
Then Verify system navigate user to "https://www.instagram.com/meccabingo/" url


@Mobile @Tablet
Scenario: Check whether system navigate user to "https://twitter.com/MeccaBingo" url when user clicks on Twitter block

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Click on Twitter block from  footer
Then Verify system navigate user to "https://twitter.com/MeccaBingo" url

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Click on Twitter block from  footer
Then Verify system navigate user to "https://twitter.com/MeccaBingo" url


@Mobile @Tablet
Scenario: Check whether system navigate user to "https://www.youtube.com/user/MeccaBingoClubs" url when user clicks on YouTube block

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Click on Youtube block from  footer
Then Verify  system navigate user to "https://www.youtube.com/user/MeccaBingoClubs" url

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Click on Youtube block from  footer
Then Verify  system navigate user to "https://www.youtube.com/user/MeccaBingoClubs" url


@Mobile
Scenario: Check whether the social media sections displays in 2 rows  with 2 social media blocks each

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify the social media section displays in 2 rows with 2 social media blocks each


Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify the social media section displays in 2 rows with 2 social media blocks each


@Mobile
Scenario: Check whether the social media sections displays font size for title as 18px

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify font size for title of social media section from footer is 18px


Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify font size for title of social media section from footer is 18px


@Mobile
Scenario: Check whether the social media sections displays font size for text as 14px

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify font size for text of social media section from footer is 14px

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify font size for text of social media section from footer is 14px


@Tablet
Scenario: Check whether the social media sections displays font size for title as 20px

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify font size for title of social media section from footer is 20px

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify font size for title of social media section from footer is 20px


@Tablet
Scenario: Check whether the social media sections displays font size for text as 16px

Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify font size for text of social media section from footer is 16px

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Verify font size for text of social media section from footer is 16px


