package team02.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import team02.pages.ViceDeanManagementSystemPage;
import team02.utilities.ConfigReader;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;

public class ViceDeanManagmentSystemStepDefs {
    ViceDeanManagementSystemPage mypage= new ViceDeanManagementSystemPage();

    @When("Verilen Url'ye git")
    public void verilenUrlYeGit() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().manage().window().maximize();

    }
    @Then("Login butonuna tikla")
    public void loginButonunaTikla() {
        mypage.sagustlogin.click();
        ReusableMethods.bekle(1);

    }
    @And("User name kutsuna kayitli veriyi gir")
    public void userNameKutsunaKayitliVeriyiGir() {
        mypage.username.sendKeys("AdminGurkay");
        ReusableMethods.bekle(1);
    }
    @And("Password kutusuna kayitli veriyi gir")
    public void passwordKutusunaKayitliVeriyiGir() {
        mypage.password.sendKeys("Gurkay123+");
        ReusableMethods.bekle(1);
    }

    @And("Login in butonuna tikla")
    public void loginInButonunaTikla()  {
        mypage.loginin.click();
        ReusableMethods.bekle(1);
    }
    @And("Acilan sayfada menu butonuna tikla")
    public void acilanSayfadaMenuButonunaTikla() {
       mypage.loginMenuButton.click();
        ReusableMethods.bekle(1);
    }

    @And("Teacher Management butonuna tikla")
    public void teacherManagementButonunaTikla() {
        mypage.teachermanagment.click();
        ReusableMethods.bekle(1);

    }

    @And("Teacher List'e ilk sayfaya git")
    public void teacherListESonSayfayaGit() {

    }


    @And("Eklenen Ogretmen'in biglilerini dogrula")
    public void eklenenOgretmenInBiglileriniDogrula() {
        Assert.assertTrue(mypage.teachermurat.isDisplayed());
        ReusableMethods.bekle(2);

    }


    @And("Eklenen Ogretmen'in uzerindeki edit butonuna tikla")
    public void eklenenOgretmenInUzerindekiEditButonunaTikla() {
        ReusableMethods.scroll(mypage.editButton);
        ReusableMethods.clickElementByJS(mypage.editButton);
        ReusableMethods.bekle(5);
       // mypage.editButton.click();
    }


    @And("Ogrenmenin bilgilerin guncellenebilir oldugunu dogrula")
    public void ogrenmeninBilgilerinGuncellenebilirOldugunuDogrula() {
        mypage.birthplace.sendKeys("Tekirdag");
    }


}
