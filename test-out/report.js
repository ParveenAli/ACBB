$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/BCC.feature");
formatter.feature({
  "line": 1,
  "name": "Bcc Page",
  "description": "",
  "id": "bcc-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4444428000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login is successful",
  "description": "",
  "id": "bcc-page;login-is-successful",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@bcc"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I navigate to BBC page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click signin link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter my valid userdetails",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am able to login successfully",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on search",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Arts",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iNavigateToBBCPage()"
});
formatter.result({
  "duration": 3777330300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickSigninLink()"
});
formatter.result({
  "duration": 2951615400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterMyValidUserdetails()"
});
formatter.result({
  "duration": 538599600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLogin()"
});
formatter.result({
  "duration": 2947634800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmAbleToLoginSuccessfully()"
});
formatter.result({
  "duration": 59356500,
  "status": "passed"
});
formatter.match({
  "location": "BCCSteps.iClickOnSearch()"
});
formatter.result({
  "duration": 2154353900,
  "status": "passed"
});
formatter.match({
  "location": "MoreStep.iClickOnArts()"
});
formatter.result({
  "duration": 2049076300,
  "status": "passed"
});
formatter.after({
  "duration": 4234001200,
  "status": "passed"
});
});