@EMC-23
Feature: EMC-23 : Footer - Social Media

@Desktop @CMS
Scenario: Check whether user able to add logos for payment providers block

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Toggle Navigation Panel
Then Click on Content Configuration tab in Mecca Redesign
Then Click on Configuration
Then Navigate to Payment providers
And Add logos in Payment providers
Then Verify user able to add logos for Payment providers


@Desktop @CMS
Scenario: Check whether user able to remove logos for payment providers block

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Toggle Navigation Panel
Then Click on Content Configuration tab in Mecca Redesign
Then Click on Configuration
Then Navigate to Payment providers
And remove logos from Payment providers Block
Then Verify user able to remove logos for Payment providers


@Desktop @CMS
Scenario: Check whether user able to configure following sections for each logo
-Image
-Link (Optional)
-Link target (Optional)
-Alt text (Optional)


Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Toggle Navigation Panel
Then Click on Content Configuration tab in Mecca Redesign
Then Click on Configuration
Then Navigate to Payment providers
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


@Desktop @CMS
Scenario: Check whether user able to edit description for Trusted partners block

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Toggle Navigation Panel
Then Click on Content Configuration tab in Mecca Redesign
Then Click on Configuration
Then Navigate to Payment providers
Then Edit description for Payment providers block
Then Verify user able to edit description for Payment providers


@Desktop @CMS
Scenario: Check whether user able to edit Title for Trusted partners block

Given CMS site should be accessed
When Login with valid userName "editor@sqs.com" and valid password "jUKayuK4"
Then Verify login Successful
Then Click on Toggle Navigation Panel
Then Click on Content Configuration tab in Mecca Redesign
Then Click on Configuration
Then Navigate to Payment providers
Then Edit  Title for Payment providers block
Then Verify user able to edit Title for Payment providers block



@Desktop @Mecca
Scenario: Check whether system displays following section for Trusted partners components:
-Title
-Description 
-Logos

Given Invoke the Mecca site on Desktop
When Navigate to footer 
Then Navigate to Social media Block
Then Navigate to Trusted Partner block
Then Verify system displays following section for Trusted partners components:
|option|
|Title|
|Description|
|Logos|


@Desktop @Mecca
Scenario: Check whether system displays tool tip "Mastercard" when user mouse hover Mastercard logo

Given Invoke the Mecca site on Desktop
When Navigate to footer 
Then Navigate to Social media Block
Then Move mouse hover to Master Card logo
Then Verify system displays tool tip "Mastercard"


@Desktop @Mecca
Scenario: Check whether system displays tool tip "Paypal" when user mouse hover Paypal logo

Given Invoke the Mecca site on Desktop
When Navigate to footer 
Then Navigate to Social media Block
Then Move mouse hover to Master Card logo
Then Verify system displays tool tip "Paypal"


@Desktop @Mecca
Scenario: Check whether system displays tool tip "Visa" when user mouse hover Visa logo

Given Invoke the Mecca site on Desktop
When Navigate to footer 
Then Navigate to Social media Block
Then Move mouse hover to Master Card logo
Then Verify system displays tool tip "Visa"


@Desktop @Mecca
Scenario: Check whether system displays tool tip "Paysafe" when user mouse hover Paysafe logo

Given Invoke the Mecca site on Desktop
When Navigate to footer 
Then Navigate to Social media Block
Then Move mouse hover to Master Card logo
Then Verify system displays tool tip "Paysafe"


@Desktop @Mecca
Scenario: Check when user resize bowser window then Trusted partners block resizes to fit the screen

Given Invoke the Mecca site on Desktop
Then Resize browser window
When Navigate to footer 
Then Navigate to Social media Block
Then Navigate to Trusted Partner block
Then Verify Trusted partners block resizes to fit the screen such that
|option|
|the title font size diminish|
|the description font size diminish and it wraps to a second line|
|the logos will resize keeping the aspect ratio|
|if logos don't fit in one line, they will be distributed in several rows|


@Mobile @Tablet
Scenario: Check whether system displays following section for Trusted partners components:
-Title
-Description 
-Logos


Given Invoke the mecca site on Mobile in Portrait Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Navigate to Trusted Partner block on Mobile
Then Verify system displays following section for Trusted partners components:
|option|
|Title|
|Description|
|Logos|

Given Invoke the mecca site on Mobile in LandScape Mode
When Navigate to footer on Mobile
Then Navigate to Social media Block
Then Navigate to Trusted Partner block on Mobile
Then Verify system displays following section for Trusted partners components:
|option|
|Title|
|Description|
|Logos|


