package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.transaction.Post;

public class TransactionSteps {
    @Steps
    Post post;

    @Given("user success auth using exiting user")
    public void usersuccessauthusingexitinguser(){
        post.usersuccsessauthusingexitinguser();


    }
    @When("user set endpoint for post transaction")
    public void Igotnotbariertokenauthenticationtest(){
        post.usersetendpointforposttransaction();

    }



    @And("user send post transaction endpoint")
    public void usersendposttransactionendpoint(){
        post.usersendPostTransactionEndpoint();

    }


    @Then("user received HTTP response {int}")
    public void userReceivedHTTPResponse(int arg0) {
    }
}
