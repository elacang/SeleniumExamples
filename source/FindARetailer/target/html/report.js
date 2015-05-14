$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Find A Retailer",
  "description": "",
  "id": "find-a-retailer",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "A user wants to search using a postal code",
  "description": "",
  "id": "find-a-retailer;a-user-wants-to-search-using-a-postal-code",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the user is in the Find a Retailer landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a user enters \"3000\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "result should be shown",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefintion.the_user_is_in_the_Find_a_Retailer_landing_page()"
});
formatter.result({
  "duration": 17946751812,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3000",
      "offset": 15
    }
  ],
  "location": "StepsDefintion.a_user_enters_$(String)"
});
formatter.result({
  "duration": 207962175,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefintion.clicks_on_search_button()"
});
formatter.result({
  "duration": 3157062053,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefintion.result_should_be_shown()"
});
formatter.result({
  "duration": 736506,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefintion.the_user_closes_the_browser()"
});
formatter.result({
  "duration": 7416073764,
  "status": "passed"
});
});