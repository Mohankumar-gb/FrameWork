Feature: Login cucumber
@SmokeTest

Scenario Outline: Login Functionality with valid credentials
Given User is on the Learnwise Login Page
When user should enter valid "<username>" and "<password>"
And user should select Login Button
Then user should verify success message
Examples:
|username|password|
|admin@admin.com|admin|
@SanityTest
Scenario Outline: Login with invalid credentials
Given User is on the Learnwise Login Page
When user should enter invalid "<username>" and "<password>"
And user should select Login Button
Then user should verify unsuccessful message
Examples:
|username|password|
|admin@admin.com|admi|
