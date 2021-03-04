$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/BCC.feature");
formatter.feature({
  "line": 1,
  "name": "Bcc Page",
  "description": "",
  "id": "bcc-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8102104501,
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
  "duration": 3109783601,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickSigninLink()"
});
formatter.result({
  "duration": 2716863400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterMyValidUserdetails()"
});
formatter.result({
  "duration": 498464800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLogin()"
});
formatter.result({
  "duration": 2355720200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmAbleToLoginSuccessfully()"
});
formatter.result({
  "duration": 52180801,
  "status": "passed"
});
formatter.match({
  "location": "BCCSteps.iClickOnSearch()"
});
formatter.result({
  "duration": 1699138800,
  "status": "passed"
});
formatter.match({
  "location": "MoreStep.iClickOnArts()"
});
formatter.result({
  "duration": 1622585501,
  "status": "passed"
});
formatter.after({
  "duration": 261998500,
  "status": "passed"
});
});