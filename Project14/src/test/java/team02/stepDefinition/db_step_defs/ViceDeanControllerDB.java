package team02.stepDefinition.db_step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team02.pojos.vicedean_controller.ViceDeanPostPojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class ViceDeanControllerDB {
    Connection connection;
    ViceDeanPostPojo expectedData;
    ResultSet resultSet;
    @Given("Vice Dean Database baglantisi kurulur")
    public void Vice_Dean_Database_baglantisi_kurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }
    @Given("Beklenen Vice Dean verisi hazirlanir")
    public void beklenen_vice_dean_verisi_hazirlanir() throws SQLException {
        expectedData = new ViceDeanPostPojo(
                "1975-05-05",
                "istanbul",
                "MALE",
                "celal",
                "Celal7186.",
                "548-275-7695",
                "518-76-7867",
                "taskiran",
                "celaltaskiran");
    }
    @When("Kayitli Vice Dean bilgisini almak icin Query gonderilir")
    public void kayitli_vice_dean_bilgisini_almak_icin_query_gonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from vice_dean where username='celaltaskiran'");
    }
    @Then("Kayitli Vice Dean verisi dogrulanir")
    public void kayitli_vice_dean_verisi_dogrulanir() throws SQLException {
        resultSet.next();
        assertEquals(expectedData.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(expectedData.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(1, resultSet.getInt("gender"));
        assertEquals(expectedData.getName(), resultSet.getString("name"));
        assertEquals(expectedData.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(expectedData.getSsn(), resultSet.getString("ssn"));
        assertEquals(expectedData.getSurname(), resultSet.getString("surname"));
        assertEquals(expectedData.getUsername(), resultSet.getString("username"));

    }




}

