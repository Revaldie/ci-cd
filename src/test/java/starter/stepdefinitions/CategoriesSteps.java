package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.categories.Get;


public class CategoriesSteps {
    @Steps
    Get get;

    @Given("I set get api to endpoints")
    public void setgetapiendpoints() {
        get.setapiendpoints();
    }
    @When("I send get request HTTP")
    public void sendgetrequestHTTP() {
        get.sendgetHTTPrequest();
    }

    @Then("I recaive with invalid HTTP responce code 404")
    public void receiveinvalidHTTPresponse(){
        get.validateHTTPresponcecode404();
    }

    @And("I not revaice all categories")
    public void  notrecaivevaliddataallcategories(){

    }
}
