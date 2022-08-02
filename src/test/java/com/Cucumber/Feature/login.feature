Feature: login


Scenario: user check the login functionality	
Given launch page
When user e­­­nter the user name
And User enter password
Then user click the login button

Scenario Outline: user login using the multiple username and password­­­
Given launch the page
When user enter the "<username>" in the username field
And  user enter the "<password>" in the password field
Then user click on the login button
Example
|username|password|
|AAA     | 6546546|
|BAU			|8789748|








