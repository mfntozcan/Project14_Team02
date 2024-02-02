package team02.stepDefinition.DBStepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team02.pojos.AdminController.RequestPojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class MessageDBYK {

    Connection connection;
    ResultSet resultSet;

    RequestPojo expectedData;

    Statement statement;

    @Given("Database baglantisı kurulurYK")
    public void databaseBaglantisıKurulur() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }

    @And("Beklenen ContactMessage Verisi hazırlanırYK")
    public void beklenenContactMessageVerisiHazırlanır() {
        expectedData=new RequestPojo("arife@hotmail.com","Team06-Project","Arife","Project");
    }

    @When("Kayıtlı ContactMessage bilgisini almak için Qery gönderilirYK")
    public void kayıtlıContactMessageBilgisiniAlmakIçinQeryGönderilir() throws SQLException {
        statement= connection.createStatement();
        resultSet= statement.executeQuery("select * from contact_message where message='Team06-Project'");
    }

    @Then("Kayıtlı ContactMessage verisi dogrulanirYK")
    public void kayıtlıContactMessageVerisiDogrulanir() throws SQLException {


    }


}
