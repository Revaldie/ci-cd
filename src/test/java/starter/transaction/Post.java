package starter.transaction;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Post {
    protected static String token = "";
    protected static String url = "https://be-qa.alta.id/api/";

    @Step("user success auth using exiting user")
    public void usersuccsessauthusingexitinguser(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","revaldi132@gmail.com");
        requestBody.put("password","aldi1312");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post("https://be-qa.alta.id/api/auth/login");
        Response resp = SerenityRest.lastResponse();
        token = resp.getBody().jsonPath().get("data");

    }

    @Step("user set endpoint for post transaction")
    public String usersetendpointforposttransaction(){
        return url + "orders";
    }

    @Step("user send post transaction endpoint")
    public void usersendPostTransactionEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 1);
        requestBody.put("quantity", 3);

        JSONArray bodyArray = new JSONArray();
        bodyArray.add(requestBody);

        SerenityRest.given().header("Authorization", "Bearer "+ token).body(bodyArray.toJSONString()).post(usersetendpointforposttransaction());
    }

}
