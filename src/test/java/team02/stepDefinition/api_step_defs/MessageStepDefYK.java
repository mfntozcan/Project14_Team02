package team02.stepDefinition.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import team02.pojos.AdminController.ContactMessagePostResponsePojo;
import team02.pojos.AdminController.RequestPojo;



import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;
import static team02.baseUrl.BaseUrl.spec;

public class ConcatMessageStepDefYK {

    RequestPojo payload;
    ContactMessagePostResponsePojo actualData;

    Response response;


    @And("Contact Message icin URL duzenlenirYK")
    public void contactMessageIcinURLDuzenlenir() {
        spec.pathParams("first","contactMessages","second","save");
    }


    @And("Contact Mesage icin payload duzenlenirYK")
    public void contactMesageIcinPayloadDuzenlenir() {
        payload=new RequestPojo("yusuf1610@hotmail.com","team02 project","Yusuf","Kagan");

    }

    @When("Contact Message icin POST Request dogrulanir ve Response alinirYK")
    public void contactMessageIcinPOSTRequestDogrulanirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        actualData = response.as(ContactMessagePostResponsePojo.class);
    }

    @And("Contact Message icin gelen Response body dogrulanirYK")
    public void contactMessageIcinGelenResponseBodyDogrulanir() {
        assertEquals(payload.getName(),actualData.getObject().getClass());
        assertEquals(payload.getSsn(),actualData.getObject().getClass());
        assertEquals(payload.getName(),actualData.getObject().getClass());
    }


    @Then("Status kodun {int} oldugu dogrulanir.YK")
    public void statusKodunOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }
}
