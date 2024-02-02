package team02.stepDefinition.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import team02.pojos.AdminController.DeanPostResponsePojo;
import team02.pojos.AdminController.RequestPojo;
import team02.utilities.Driver;


import static team02.baseUrl.BaseUrl.setUp;
import static team02.baseUrl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class AdminDeanEklemeAPIStepDefYK {

    RequestPojo payload;
    Response response;
    DeanPostResponsePojo actualData;



    public static int userId;


    @Given("Admin gerekli bilgiler ile giris yaparYK")
    public void yetkisiIleGirisYapilir(String string) {
        setUp("Yusuf1610", "Kagan1610");
        Driver.closeDriver();
    }


    @And("Dean Save icin URL duzenlenirYK")
    public void deanSaveIcinURLDuzenlenir() {
        spec.pathParams("first", "dean", "second", "save");
    }

    @And("Dean Save icin payload duzenlenirYK")
    public void deanSaveIcinPayloadDuzenlenir() {
        payload = new RequestPojo("1996-01-08", "Adana", "MALE", "Yusuf1610", "Kagan1610", "252-324-0918", "435-28-6435", "Ozer", "Yusuf_Ozer");
    }

    @When("Dean Save icin POST Request gonderilir ve Response alinirYK")
    public void deanSaveIcinPOSTRequestGonderilirVeResponseAlinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        actualData = response.as(DeanPostResponsePojo.class);
    }


    @Then("Status kodun {int} oldugu dogrulanirYK")
    public void statusCodunOlduguDogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @And("Dean Save icin gelen Response body dogrulanirYK")
    public void deanSaveIcinGelenResponseBodyDogrulanir() {

    }



    RequestPojo expectedData;


    @And("Kayıtlı Dean verisinin ID numarasını almaYK")
    public void kayıtlıDeanVerisininIDNumarasınıAlma() {
        spec.pathParams(  "first","dean","second","getAll");
        Response response=given(spec).when().get("{first}/{second}");
        JsonPath json=response.jsonPath();
        userId= json.getInt("find{it.username=='Arife-Koca'}.userId");
        System.out.println(userId);
    }

    @And("Dean GetManagerById icin URL düzenlenirYK")
    public void deanGetManagerByIdIcinURLDüzenlenir() {
        spec.pathParams("first","dean","second","getManagerById","third",userId);
    }

    @And("Dean GetManagerById beklenen veriler düzenlenirYK")
    public void deanGetManagerByIdBeklenenVerilerDüzenlenir() {
        expectedData=new RequestPojo(
                "1996-01-08",
                "Adana",
                "MALE",
                "Yusuf1610",
                "Kagan1610.",
                "653-071-9018",
                "462-58-8217",
                "Yusuf",
                "Yusuf-Ozer");
    }

    @When("Dean GetManagerById icin GET Request gönderilir ve Response alınırYK")
    public void deanGetManagerByIdIcinGETRequestGönderilirVeResponseAlınır() {
        response= given(spec).when().get("{first}/{second}/{third}");
        actualData=response.as(DeanPostResponsePojo.class);
    }

    @Then("Status kodun {int} oldugu dogrulanrYK")
    public void statusCodunOlduguDogrulanr(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }

    @And("Dean GetManagerById icin gelen Response Body dogrulanırYK")
    public void deanGetManagerByIdIcinGelenResponseBodyDogrulanır() {

    }

    @And("Dean Delete icin URL duzenlenirYK")
    public void deanDeleteIcinURLDuzenlenir() {
        spec.pathParams("first","dean","second","delete","third",userId);
    }

    @And("Dean delete icin beklenen veriler düzenlenirYK")
    public void deanDeleteIcinBeklenenVerilerDüzenlenir(){}


    @When("Dean Delete icin DELETE Request gönderilir Response alınırYK")
    public void deanDeleteIcinDELETERequestGönderilirResponseAlınır() {
        response= given(spec).when().delete("{first}/{second}/{third}");

    }

    @And("Dean Hesabının silindigi dogrulanirYK")
    public void deanHesabınınSilindigiDogrulanir() {

    }

}


