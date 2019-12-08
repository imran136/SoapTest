$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SoapTest.feature");
formatter.feature({
  "line": 1,
  "name": "Need to test SOAP",
  "description": "",
  "id": "need-to-test-soap",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test Soap",
  "description": "",
  "id": "need-to-test-soap;test-soap",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "url is \"http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "we invoke the webservice",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "we expect response",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL",
      "offset": 8
    }
  ],
  "location": "Steps.url_is(String)"
});
formatter.result({
  "duration": 1105436900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.we_invoke_the_webservice()"
});
formatter.result({
  "duration": 61609000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.we_expect_response()"
});
formatter.result({
  "duration": 3841700,
  "status": "passed"
});
});