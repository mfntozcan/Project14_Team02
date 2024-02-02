package team02.stepDefinition.database_stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team02.pojos.AdminController.RequestPojo;
import team02.utilities.Driver;


import java.sql.*;

import static org.junit.Assert.assertEquals;

public class AdminDeanEklemeDBYusuf {
    Connection connection;
    Statement statement;

    RequestPojo expectedData;

    ResultSet resultSet;
    @Given("Database baglantisi kurulurYK")
    public void databaseBaglantisiKurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        Driver.closeDriver();
    }

    @And("Beklenen Dean Verisi hazırlanırYK")
    public void beklenenDeanVerisiHazırlanır() {
        expectedData = new RequestPojo(
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

    @When("Kayıtlı Dean bilgisini almak için Qery gönderilirYK")
    public void kayıtlıDeanBilgisiniAlmakIçinQeryGönderilir() throws SQLException {
        statement= connection.createStatement();
        resultSet= statement.executeQuery("select * from dean where username = 'Yusuf-Ozer'");

    }

    @Then("Kayıtlı Dean verisi dogrulanirYK")
    public void kayıtlıDeanVerisiDogrulanir() throws SQLException {

        resultSet.next(); //pg admin deki tabloda bir satır aşağıya inmek için kullanıldı
        assertEquals(expectedData.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(expectedData.getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(1,resultSet.getInt("gender"));
        assertEquals(expectedData.getName(),resultSet.getString("name"));
        assertEquals(expectedData.getPhoneNumber(),resultSet.getString("phone_number"));
        assertEquals(expectedData.getSsn(),resultSet.getString("ssn"));
        assertEquals(expectedData.getSurname(),resultSet.getString("surname"));
        assertEquals(expectedData.getUsername(),resultSet.getString("username"));
    }
}
