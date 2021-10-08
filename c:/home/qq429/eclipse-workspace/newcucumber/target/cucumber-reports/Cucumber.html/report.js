$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "name": "Login cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login Functionality with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should select Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin@admin.com",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Functionality with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.userIsOnTheLearnwiseLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter valid \"admin@admin.com\" and \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.userShouldEnterValidAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.userShouldSelectLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify success message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.userShouldVerifySuccessMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "name": "User is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter invalid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should select Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify unsuccessful message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin@admin.com",
        "admi"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "name": "User is on the Learnwise Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.userIsOnTheLearnwiseLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter invalid \"admin@admin.com\" and \"admi\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.userShouldEnterInvalidAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.userShouldSelectLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify unsuccessful message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.userShouldVerifyUnsuccessfulMessage()"
});
formatter.result({
  "status": "passed"
});
});