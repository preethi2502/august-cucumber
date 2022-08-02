$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/Cucumber/Feature/login.feature");
formatter.feature({
  "name": "login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user check the login functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "launch page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepdefenition.com.StepDefenition.launch_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the user name",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefenition.com.StepDefenition.user_enter_the_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter password",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepdefenition.com.StepDefenition.user_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefenition.com.StepDefenition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
});