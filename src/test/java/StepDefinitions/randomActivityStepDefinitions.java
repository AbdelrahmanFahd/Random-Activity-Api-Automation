package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;


public class randomActivityStepDefinitions {

    private Response response;

    @Given("^Call \"(.*)\" Api$")
    public void callRandomActivityApi(String urlApi) {

        response = given().when().get(urlApi);

    }

    @Then("^Assert Status code is \"(.*)\" and Response Schema have \"(.*)\" and \"(.*)\" Keys$")
    public void assertResponse(String statusCode, String key1, String key2) {

        response.then()
                .assertThat()
                .statusCode(Integer.parseInt(statusCode))
                .body("", hasKey(key1))
                .body("", hasKey(key2));

    }
}
