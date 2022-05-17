package starter.product;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set GET api endpoints")
    public String setApiEndpoint() {
        return url + "/products";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail product")
    public void validateDataDetailUser() {
        Response response = SerenityRest.lastResponse();

        String name = response.getBody().jsonPath().get("data.Name[0]");
        Assert.assertEquals(name, "Tensi Darah Elektrik");

    int ID = response.getBody().jsonPath().get("data.ID[0]");
        Assert.assertEquals(ID, 1468);


    }
}

