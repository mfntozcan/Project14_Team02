package team02.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import team02.pages.GuestUserPage;
import team02.pages.HomePage;
import team02.utilities.ConfigReader;
import team02.utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US02_Stepdefs {
    HomePage page=new HomePage();
    Faker fakerAC=new Faker();
    GuestUserPage guestUser=new GuestUserPage();
    @Then("Admin olarak Login ikonunu tiklar_AC")
    public void adminOlarakLoginIkonunuTiklar_AC() {
        page.loginButonu.click();
        ReusableMethods.bekle(2);
    }

    @And("Admin olarak username kutusununa {string} girer_AC")
    public void adminOlarakUsernameKutusununaGirer_AC(String username) {
        guestUser.adminUserName_AC.sendKeys(username);
    }

    @And("Admin olarak password kutusuna {string} girer_AC")
    public void adminOlarakPasswordKutusunaGirer_AC(String password) {
        ReusableMethods.bekle(2);
        guestUser.adminPasswoord_AC.sendKeys(password, Keys.TAB,Keys.ENTER);
    }

    @And("Admin olarak Login butonunu tiklar_AC")
    public void adminOlarakLoginButonunuTiklar_AC() {
    }

    @And("Admin olarak Menu butonuna basar_AC")
    public void adminOlarakMenuButonunaBasar_AC() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(page.menu);
    }

    @And("Admin olarak Guest User linkini tiklar_AC")
    public void adminOlarakGuestUserLinkiniTiklar_AC() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(guestUser.mainMenuGuestUser_AC);
    }

    @Given("Admin Guest_User List'i gorur_AC")
    public void adminGuest_UserListIGorur_AC() {
        ReusableMethods.bekle(2);
        assertTrue(guestUser.guestUserListYazisi_AC.isDisplayed());
    }

    @And("Admin Guest_User Name bilgilerini gorur_AC")
    public void adminGuest_UserNameBilgileriniGorur_AC() {
        ReusableMethods.bekle(2);

        List<WebElement> namesList=guestUser.names_AC;
        for (WebElement webElement : namesList) {
            System.out.println("namesList.get(i) = " + webElement.getText());
            assertTrue(webElement.isDisplayed());
        }
    }

    @And("Admin Guest_User Phone Number bilgilerini gorur_AC")
    public void adminGuest_UserPhoneNumberBilgileriniGorur_AC() {

        ReusableMethods.bekle(2);
        List<WebElement> phoneNumberList=guestUser.phoneNumbers_AC;
        for (WebElement webElement : phoneNumberList) {
            System.out.println("phoneNumberList = " + webElement.getText());
            assertTrue(webElement.isDisplayed());
        }
    }

    @And("Admin Guest_User SSN bilgilerini gorur_AC")
    public void adminGuest_UserSSNBilgileriniGorur_AC() {
        ReusableMethods.bekle(2);
        List<WebElement> SsnList=guestUser.Ssn_AC;
        for (WebElement webElement : SsnList) {
            System.out.println("SsnList = " + webElement.getText());
            assertTrue(webElement.isDisplayed());
        }
    }

    @And("Admin Guest_User User Name bilgilerini gorur_AC")
    public void adminGuest_UserUserNameBilgileriniGorur_AC() {
        ReusableMethods.bekle(2);
        List<WebElement> userNamesList=guestUser.userNames_AC;
        for (WebElement webElement : userNamesList) {
            System.out.println("usernamesList = " + webElement.getText());
            assertTrue(webElement.isDisplayed());
        }
    }

    @Then("Admin Guest_User Delete butonunu gorur_AC")
    public void adminGuest_UserDeleteButonunuGorur_AC() {
        ReusableMethods.bekle(2);
        assertTrue(guestUser.deleteButton_AC.isDisplayed());
    }

    @And("Admin uyari mesajini gorerek silme isleminin tamamlandigini gorur_AC")
    public void adminUyariMesajiniGorerekSilmeIslemininTamamlandiginiGorur_AC() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(guestUser.deleteButton_AC);
        ReusableMethods.bekle(2);
        assertTrue(guestUser.deletesuccesfullYazisi_AC.getText().contains("Guest User deleted Successful"));
    }
}
