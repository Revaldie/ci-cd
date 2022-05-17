package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Post;

public class Loginsteps {
    @Steps
    Post post;

    @Given("I set POST api endpoint")
    public void setPostapiendpoint(){
        post.setPostapiendpoint();
    }
    @When("I send POST Http request")
    public void sendPostHttprequest(){
        post.sendPostHttprequest();
    }
    @Then("I recaive valid Http response code 200")
    public void recaivevalidHttpresponsecode200(){
        post.revaivevalidHttpresponcecode200();
    }
    @And("I recaive valid login for new user")
    public void iRecaiveValidLoginForNewUser() {
        post.recaivevalidloginfornewuser();
    }
}
