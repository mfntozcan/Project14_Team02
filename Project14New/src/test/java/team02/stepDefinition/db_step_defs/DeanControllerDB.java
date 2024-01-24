package team02.stepDefinition.db_step_defs;

import io.cucumber.java.en.*;
import team02.pojos.dean_controller.DeanPostPojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class DeanControllerDB {
    Connection connection;
    DeanPostPojo expectedData;
    ResultSet resultSet;
    @Given("Database baglantisi kurulur")
    public void database_baglantisi_kurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }
    @Given("Beklenen Dean verisi hazirlanir")
    public void beklenen_dean_verisi_hazirlanir() throws SQLException {
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
    @When("Kayitli Dean bilgisini almak icin Query gonderilir")
    public void kayitli_dean_bilgisini_almak_icin_query_gonderilir() throws SQLException {
        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from dean where username='ayseyilmaz5'");
    }
    @Then("Kayitli Dean verisi dogrulanir")
    public void kayitli_dean_verisi_dogrulanir() throws SQLException {
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
