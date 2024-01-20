package team02.stepDefinition.api_step_defs;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import team02.pojos.vicedean_controller.ViceDeanPostPojo;
import team02.pojos.vicedean_controller.ViceDeanPostResponsePojo;
import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;
import static team02.base_url.BaseUrl.setUp;
import static team02.base_url.BaseUrl.spec;

public class ViceDeanControllerApi {
    ViceDeanPostPojo payload;
    Response response;
    ViceDeanPostResponsePojo actualData;
    static int userId;
    ViceDeanPostPojo expectedData;

    @Given("{string} adminyetkisi ile giris yapilir")
    public void adminyetkisi_ile_giris_yapilir(String string) {setUp("celaltas", "Celal7186."); }

    @Given("{string} deanyetkisi ile giris yapilir")
    public void dean_yetkisi_ile_giris_yapilir(String string) {setUp("celaltas1", "Celal7186."); }

    @Given("Vice Dean Save icin URL duzenlenir")
    public void Vice_Dean_Save_icin_URL_duzenlenir() {
        spec.pathParams("first", "vicedean", "second", "save");
    }
    @Given("Vice Dean Save icin 1Payload duzenlenir")
    public void vice_dean_save_icin_1payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "manassas", "MALE", "celal", "Celal7186.", "571-267-5194", "323-45-7892", "tas", "celaltaskam");
    }
    @Given("Vice Dean Save icin 2Payload duzenlenir")
    public void vice_dean_save_icin_2payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "manassas", "MALE", "SELIM", "Celal7186.", "571-353-5194", "235-45-7890", "tas", "selimtas");
    }
    @Given("Vice Dean Save icin 3Payload duzenlenir")
    public void vice_dean_save_icin_3payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "adana", "MALE", "cihan", "Celal7186.", "571-385-5194", "235-45-2541", "TAS", "cihantas");
    }
    @Given("Vice Dean Save icin 4Payload duzenlenir")
    public void vice_dean_save_icin_4payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "ANTALYA", "MALE", "cihangir", "Celal7186.", "571-523-5194", "124-45-3741", "tas", "cihangirtas");
    }
    @Given("Vice Dean Save icin 5Payload duzenlenir")
    public void vice_dean_save_icin_5payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "adiyaman", "MALE", "sungur", "Celal7186.", "571-634-5194", "124-36-3741", "tas", "SUNGURTAS");
    }
    @Given("Vice Dean Save icin 6Payload duzenlenir")
    public void vice_dean_save_icin_6payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "SALIHLI", "MALE", "YAVUZ", "Celal7186.", "571-634-4521", "124-36-3321", "TAS", "YAVUZTAS");
    }
    @Given("Vice Dean Save icin 7Payload duzenlenir")
    public void vice_dean_save_icin_7payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "Merzifon", "MALE", "Selami", "Celal7186.", "571-634-6529", "124-36-3527", "Tas", "Selamitas");
    }
    @Given("Vice Dean Save icin 8Payload duzenlenir")
    public void vice_dean_save_icin_8payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "catalca", "MALE", "cevahir", "Celal7186.", "571-385-6529", "334-36-3527", "tas", "cevahirtas123");
    }
    @Given("Vice Dean Save icin 9Payload duzenlenir")
    public void vice_dean_save_icin_9payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "yesilli", "MALE", "salih", "Celal7186.", "323-38521254", "128-25-5324", "tas", "salihtas");
    }
    @Given("Vice Dean Save icin 10Payload duzenlenir")
    public void vice_dean_save_icin_10payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1985-01-01", "yesilli", "MALE", "salih", "Celal7186.", "323-385-1254", "128-2505324", "tas", "salihtas");
    }
    @Given("Vice Dean Save icin 11Payload duzenlenir")
    public void vice_dean_save_icin_11payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "manassas", "MALE", "12345", "Celal7186.", "123-321-1234", "123-22-7890", "tas", "celaltask");
    }
    @Given("Vice Dean Save icin 12Payload duzenlenir")
    public void vice_dean_save_icin_12payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "manassas", "MALE", "celal", "Celal7186.", "124-124-1241", "123-45-7892", "123", "celaltaskan");
    }
    @Given("Vice Dean Save icin 13Payload duzenlenir")
    public void vice_dean_save_icin_13payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "12345", "MALE", "celali", "Celal7186.", "555-528-2582", "223-45-7890", "tas", "celalitas");
    }
    @Given("Vice Dean Save icin 14Payload duzenlenir")
    public void vice_dean_save_icin_14payload_duzenlenir() {
        payload = new ViceDeanPostPojo("0003-01-01", "manassas", "MALE", "celali", "Celal7186.", "572-528-2582", "124-45-7192", "task", "celalitaskar");
    }
    @Given("Vice Dean Save icin 15Payload duzenlenir")
    public void vice_dean_save_icin_15payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "manassas", "MALE", "celalin", "Celal7186.", "555-828-2582", "128-45-7890", "taska", ".......");
    }
    @Given("Vice Dean Save icin 16Payload duzenlenir")
    public void vice_dean_save_icin_16payload_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "sivrihisar", "MALE", "serkan", "Celal7186.", "000-000-0000", "128-25-6290", "tan", "serkantan");
    }
    @Given("Vice Dean Save icin Payload1 duzenlenir")
    public void vice_dean_save_icin_payload1_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "bursa", "MALE", "mehmet", "Celal7186.", "123-412-7890", "123-65-9876", "tas", "mehmettas");
    }
    @Given("Vice Dean Save icin Payload2 duzenlenir")
    public void vice_dean_save_icin_payload2_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "ankara", "MALE", "AHMET", "Celal7186.", "123-512-7639", "123-25-3676", "tas", "ahmettas");
    }
    @Given("Vice Dean Save icin Payload3 duzenlenir")
    public void vice_dean_save_icin_payload3_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-08", "sivas", "MALE", "cemil", "Celal7186.", "123-252-7890", "123-96-9876", "TAS", "cemiltas");
    }

    @Given("Vice Dean Save icin Payload4 duzenlenir")
    public void vice_dean_save_icin_payload4_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-09", "ANKARA", "MALE", "selami", "Celal7186.", "252-312-6891", "242-32-9876", "tas", "selamitas");
    }
    @Given("Vice Dean Save icin Payload5 duzenlenir")
    public void vice_dean_save_icin_payload5_duzenlenir() {
        payload = new ViceDeanPostPojo("1991-11-11", "ardahan", "MALE", "salih", "Celal7186.", "123-354-6321", "145-25-3256", "taskan", "SALIHTASKAN");
    }
    @Given("Vice Dean Save icin Payload6 duzenlenir")
    public void vice_dean_save_icin_payload6_duzenlenir() {
        payload = new ViceDeanPostPojo("1991-11-12", "YOZGAT", "MALE", "DURSUN", "Celal7186.", "363-312-6931", "252-25-4125", "TAS", "DURSUNTAS");
    }
    @Given("Vice Dean Save icin Payload7 duzenlenir")
    public void vice_dean_save_icin_payload7_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "Ankara", "MALE", "Cemal", "Celal7186.", "283-312-7890", "224-25-3652", "Tas", "Cemaltas");
    }
    @Given("Vice Dean Save icin Payload8 duzenlenir")
    public void vice_dean_save_icin_payload8_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "ankara", "MALE", "cezmi", "Celal7186.", "123-312-7890", "123-25-9876", "tas", "cezmitas06");
    }
    @Given("Vice Dean Save icin Payload9 duzenlenir")
    public void vice_dean_save_icin_payload9_duzenlenir() {
        payload = new ViceDeanPostPojo("1985-01-01", "sivrihisar", "MALE", "erkan", "Celal7186.", "323-48521254", "128-25-6290", "tas", "serkantas");
    }
    @Given("Vice Dean Save icin Payload10 duzenlenir")
    public void vice_dean_save_icin_payload10_duzenlenir() {
        payload = new ViceDeanPostPojo("1984-01-01", "ortanca", "MALE", "vedat", "Celal7186.", "323-485-1254", "128-2526290", "tas", "serkantas");
    }
    @Given("Vice Dean Save icin Payload11 duzenlenir")
    public void vice_dean_save_icin_payload11_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "ankara", "MALE", "1251", "Celal7186.", "551-552-5566", "125-15-2523", "tas", "tasmehmet");
    }
    @Given("Vice Dean Save icin Payload12 duzenlenir")
    public void vice_dean_save_icin_payload12_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-02-02", "ankara", "MALE", "mehmet", "Celal7186.", "571-258-9869", "153-65-6890", "1235", "mehmetyas");
    }
    @Given("Vice Dean Save icin Payload13 duzenlenir")
    public void vice_dean_save_icin_payload13_duzenlenir() {
        payload = new ViceDeanPostPojo("1980-01-01", "12345", "MALE", "celan", "Celal7186.", "571-298-9865", "154-32-6898", "tas", "celantas");
    }
    @Given("Vice Dean Save icin Payload14 duzenlenir")
    public void vice_dean_save_icin_payload14_duzenlenir() {
        payload = new ViceDeanPostPojo("0009-01-01", "istanbul", "MALE", "mehmedi", "Celal7186.", "571-258-2113", "124-29-7890", "task", "mehmettastak");
    }
    @Given("Vice Dean Save icin Payload15 duzenlenir")
    public void vice_dean_save_icin_payload15_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "ankara", "MALE", "celalin", "Celal7186.", "571-285-6791", "128-45-7190", "taskan", "*****");
    }
    @Given("Vice Dean Save icin Payload16 duzenlenir")
    public void vice_dean_save_icin_payload16_duzenlenir() {
        payload = new ViceDeanPostPojo("1990-01-01", "sivrihisar", "MALE", "selcuk", "Celal7186.", "111-000-0001", "138-25-6886", "tas", "selcuktas");
    }

    @When("Vice Dean Save icin POST Request gonderilir ve Response alinir")
    public void Vice_Dean_Save_icin_POST_Request_gonderilir_ve_Response_alinir() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        actualData = response.as(ViceDeanPostResponsePojo.class);
    }
    @Then ("Vice Dean Status kodun {int} oldugu dogrulanir")
    public void vice_status_kodun_oldugu_dogrulanir(int statusCode) {
        assertEquals(statusCode, response.statusCode());
    }

    @Then("Vice Dean Save icin  Response Body dogrulanir")
    public void vice_dean_save_icin_response_body_dogrulanir(){
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }

    @Given("Kayitli Vice Dean verisinin ID numarasini alma")
    public void kayitli_dean_versinin_ıd_numarasini_alma() {
        spec.pathParams("first", "vicedean", "second", "getAll");
        Response response = given(spec).when().get("{first}/{second}");

        JsonPath json = response.jsonPath();
        userId = json.getInt("find{it.username=='celaltaskiran'}.userId");
    }
    @Given("Vice Dean GetManagerById icin URL duzenlenir")
    public void vicedean_get_manager_by_ıd_icin_url_duzenlenir() {
        spec.pathParams("first", "vicedean", "second", "getViceDeanById", "third", userId);
    }
    @Given("Vice Dean getViceDeanById icin beklenen veriler duzenlenir")
    public void vice_dean_get_vice_dean_by_ıd_icin_beklenen_veriler_duzenlenir() {
        expectedData = new ViceDeanPostPojo(
                "1975-05-05",
                "istanbul",
                "MALE",
                "Celal",
                "Celal7186.",
                "548-275-7695",
                "518-76-7867",
                "taskiran",
                "celaltaskiran");
    }
    @When("Vice Dean GetManagerById icin GET Request gonderilir ve response alinir")
    public void vice_dean_get_manager_by_ıd_icin_get_request_gonderilir_ve_response_alinir() {
        response = given(spec).when().get("{first}/{second}/{third}");
        actualData = response.as(ViceDeanPostResponsePojo.class);
    }
    @Then("Vice Dean GetManagerById icin gelen Response Body dogrulanir")
    public void vice_dean_get_manager_by_ıd_icin_gelen_response_body_dogrulanir() {
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
    }

    @Given("Vice Dean Delete icin URL duzenlenir")
    public void vice_dean_delete_icin_url_duzenlenir() {
        spec.pathParams("first", "vice_dean", "second", "delete", "third", userId);
    }
    @When("Vice Dean Delete icin DELETE Request gonderilir ve Response alinir")
    public void vice_dean_delete_icin_delete_request_gonderilir_ve_response_alinir() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

}
