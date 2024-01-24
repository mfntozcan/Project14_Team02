package team02.stepDefinition.api_step_defs;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import team02.pojos.dean_controller.DeanPostPojo;
import team02.pojos.dean_controller.DeanPostResponsePojo;
import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;
import static team02.base_url.BaseUrl.setUp;
import static team02.base_url.BaseUrl.spec;

public class DeanControllerApi {
    DeanPostPojo payload;
    Response response;
    DeanPostResponsePojo actualData;
    static int userId;
    DeanPostPojo expectedData;

    @Given("{string} yetkisi ile giris yapilir")
    public void yetkisi_ile_giris_yapilir(String string) {
        setUp("celaltas", "Celal7186.");
    }

    @Given("Dean Save icin URL duzenlenir")
    public void dean_save_icin_url_duzenlenir() {
        spec.pathParams("first", "dean", "second", "save");
    }
    @Given("Dean Save icin Payload duzenlenir")
    public void dean_save_icin_payload_duzenlenir() {
        payload = new DeanPostPojo("1975-05-05", "istanbul", "FEMALE", "Ayse", "12345678Aa", "355-275-7695", "538-76-7867", "Yılmaz", "ayseyilmaz5");
    }
    @When("Dean Save icin POST Request gonderilir ve Response alinir")
    public void dean_save_icin_post_request_gonderilir_ve_response_alinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        actualData = response.as(DeanPostResponsePojo.class);
    }
    @Then("Status kodun {int} oldugu dogrulanir")
    public void status_kodun_oldugu_dogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }
    @Then("Dean Save icin Response Body dogrulanir")
    public void dean_save_icin_response_body_dogrulanir() {
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }

    @Given("Kayitli Dean versinin ID numarasini alma")
    public void kayitli_dean_versinin_ıd_numarasini_alma() {
        spec.pathParams("first", "dean", "second", "getAll");
        Response response = given(spec).when().get("{first}/{second}");

        JsonPath json = response.jsonPath();
        userId = json.getInt("find{it.username=='ayseyilmaz5'}.userId");
    }
    @Given("Dean GetManagerById icin URL duzenlenir")
    public void dean_get_manager_by_ıd_icin_url_duzenlenir() {
        spec.pathParams("first", "dean", "second", "getManagerById", "third", userId);
    }
    @Given("Dean GetManagerById icin beklenen veriler duzenlenir")
    public void dean_get_manager_by_ıd_icin_beklenen_veriler_duzenlenir() {
        expectedData = new DeanPostPojo(
                "1975-05-05",
                "istanbul",
                "FEMALE",
                "Ayse",
                "12345678Aa",
                "355-275-7695",
                "538-76-7867",
                "Yılmaz",
                "ayseyilmaz5");
    }
    @When("Dean GetManagerById icin GET Request gonderilir ve response alinir")
    public void dean_get_manager_by_ıd_icin_get_request_gonderilir_ve_response_alinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData = response.as(DeanPostResponsePojo.class);
    }
    @Then("Dean GetManagerById icin gelen Response Body dogrulanir")
    public void dean_get_manager_by_ıd_icin_gelen_response_body_dogrulanir() {
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
    }

    @Given("Dean Delete icin URL duzenlenir")
    public void dean_delete_icin_url_duzenlenir() {
        spec.pathParams("first", "dean", "second", "delete", "third", userId);
    }
    @When("Dean Delete icin DELETE Request gonderilir ve Response alinir")
    public void dean_delete_icin_delete_request_gonderilir_ve_response_alinir() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

}
