package starter.categories;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
        protected static String url = "https://be-qa.alta.id/api";
        @Step("I set get api to endpoints")
        public String setapiendpoints(){
            return  url + "/categories122";
        }
        @Step("I send get request HTTP")
        public void sendgetHTTPrequest(){
            SerenityRest.given().get(setapiendpoints());
        }

        @Step("I recaive with invalid HTTP responce code 404")
        public void validateHTTPresponcecode404(){
            restAssuredThat(response -> response.statusCode(404));

        }
}

