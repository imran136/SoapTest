Feature: Need to test SOAP

  Scenario: Test Soap
    Given url is "http://wsf.cdyne.com/WeatherWS/Weather.asmx?WSDL"
    When we invoke the webservice
    Then we expect response