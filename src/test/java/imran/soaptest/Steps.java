package imran.soaptest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

import static org.junit.Assert.assertEquals;

public class Steps {

    private CountryInfoService countryInfoService = null;
    private CountryInfoServiceSoapType countryInfoServiceSoapType = null;
    private String strActualResponse;
    private String strExpectedResponse;


    @Given("^url is \"([^\"]*)\"$")
    public void url_is(String arg1) throws Throwable {
        countryInfoService = new CountryInfoService();
        countryInfoServiceSoapType = countryInfoService.getCountryInfoServiceSoap();
    }

    @When("^we invoke the webservice$")
    public void we_invoke_the_webservice() throws Throwable {
        strActualResponse = countryInfoServiceSoapType.capitalCity("IN");
    }

    @Then("^we expect response$")
    public void we_expect_response() throws Throwable {
        System.out.println(strActualResponse);
        strExpectedResponse = "New Delhi";
        assertEquals(strActualResponse, strExpectedResponse);
    }
}
