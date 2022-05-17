package starter.register;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set Post Api Endpoint")
    public String setPostApiEndpoint(){
        return url + "/auth/register";
    }
    @Step("I Send Post Http request with body text Without email and password")
    public void sendPostHttprequestwithbodytextwithoutemailandpassword(){
        JSONObject requestbody = new JSONObject();
        requestbody.put("fullname", "revaldi");
        requestbody.put("email", "");
        requestbody.put("password", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestbody.toJSONString()).post(setPostApiEndpoint());
    }
    @Step("I recaive invalid Http response code 400")
    public void recaiveinvlaidHttpresponsecode400(){
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("I do not register account")
    public void notregisteraccount(){
        restAssuredThat(response -> response.body("'error'", equalTo("nvalid character '}' looking for beginning of object key string")));

    }
}
