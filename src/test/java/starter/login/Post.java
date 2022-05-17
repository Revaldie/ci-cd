package starter.login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Post {
    protected static String url = "https://be-qa.alta.id/api";

    @Step("I set POST api endpoint")
    public String setPostapiendpoint() {
        return url + "/auth/login";
    }

    @Step("I send POST Http request")
    public void sendPostHttprequest() {
        JSONObject requestbody = new JSONObject();
        requestbody.put("email", "revaldi132@gmail.com");
        requestbody.put("password", "aldi1312");

        SerenityRest.given().header("Content-Type", "application/json").body(requestbody.toJSONString()).post(setPostapiendpoint());
    }

    @Step("I recaive valid Http response code 200")
    public void revaivevalidHttpresponcecode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I recaive valid login for new user")
    public void recaivevalidloginfornewuser() {
        restAssuredThat(response -> response.body("'data'", equalTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6InJldmFsZGkiLCJFbWFpbCI6InJldmFsZGkxMzJAZ21haWwuY29tIn0.f0-UPHjxFbucDIL74BzyyvBMDRvdLRV8odFtUm_3FBo")));
    }

}

