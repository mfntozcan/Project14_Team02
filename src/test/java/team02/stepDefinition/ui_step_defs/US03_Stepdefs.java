package team02.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import team02.pages.HomePage;
import team02.utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US03_Stepdefs {
    HomePage page=new HomePage();
    Faker fakerAC=new Faker();
    @Then("Contact butonuna tiklar_AC")
    public void contactButonunaTiklar_AC() {
        ReusableMethods.click(page.contactLinki_AC);
        ReusableMethods.bekle(2);
    }

    @And("Your name alanina herhangi bir karakter iceren isim girer_AC")
    public void yourNameAlaninaHerhangiBirKarakterIcerenIsimGirer_AC() {
        page.yournameKutusu_AC.sendKeys(fakerAC.name().fullName());
        ReusableMethods.bekle(2);
    }

    @And("Your Email alanina icinde @ ve . karakterleri olan bir email adresi girer_AC")
    public void yourEmailAlaninaIcindeVeKarakterleriOlanBirEmailAdresiGirer_AC() {
        page.yourEmailKutusu_AC.sendKeys(fakerAC.internet().emailAddress());
        ReusableMethods.bekle(2);
    }

    @And("Subject alanina mesaj hakkinda bir konu basligi girer_AC")
    public void subjectAlaninaMesajHakkindaBirKonuBasligiGirer_AC() {
        page.subjectKutusu_AC.sendKeys(fakerAC.lorem().characters(5,10));
    }

    @And("Message alanina icinde harf,rakam ve ozel karakterler olan bir mesaj girer_AC")
    public void messageAlaninaIcindeHarfRakamVeOzelKarakterlerOlanBirMesajGirer_AC() {
        page.messageKutusu_AC.sendKeys(fakerAC.lorem().sentence(5));
        ReusableMethods.bekle(2);
    }

    @And("Send Message butonuna tiklar_AC")
    public void sendMessageButonunaTiklar_AC() {
        ReusableMethods.click(page.sendMessageButton_AC);
        ReusableMethods.bekle(2);
    }

    @And("Mesajin gonderilebildigini dogrular_AC")
    public void mesajinGonderilebildiginiDogrular_AC() {
        assertTrue(page.contactMessageCreated_AC.getText().contains("Contact Message Created Successfully"));
        ReusableMethods.bekle(2);
    }

    @And("Your Name alanini bos birakir_AC")
    public void yourNameAlaniniBosBirakir_AC() {
    }

    @And("YourName kutusu bos oldugu icin mesajin gonderilemedigini dogrular_AC")
    public void yournameKutusuBosOlduguIcinMesajinGonderilemediginiDogrular_AC() {
        assertTrue(page.yournameKutusuRequired_AC.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("Your Email alanina icinde @ ve . karakterleri olmayan bir email adresi girer_AC")
    public void yourEmailAlaninaIcindeVeKarakterleriOlmayanBirEmailAdresiGirer_AC() {
        page.yourEmailKutusu_AC.sendKeys("aaaaaaaaa");
    }

    @And("Youremail kutusuna gecersiz bir email girildigi  icin mesajin gonderilemedigini dogrular_AC")
    public void youremailKutusunaGecersizBirEmailGirildigiIcinMesajinGonderilemediginiDogrular_AC() {
        assertTrue(page.pleaseEnterValidEmailYazisi_AC.getText().contains("Please enter valid email"));
        ReusableMethods.bekle(2);
    }

    @And("Subject alanini bos birakir_SK")
    public void subjectAlaniniBosBirakir_SK() {
    }

    @And("Subject kutusu bos oldugu icin mesajin gonderilemedigini dogrular_AC")
    public void subjectKutusuBosOlduguIcinMesajinGonderilemediginiDogrular_AC() {
        ReusableMethods.bekle(2);
        assertTrue(page.subjectKutusuRequired_AC.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("Message alanini bos birakir_AC")
    public void messageAlaniniBosBirakir_AC() {
    }

    @And("Message alani bos oldugu icin mesajin gonderilemedigini dogrular_AC")
    public void messageAlaniBosOlduguIcinMesajinGonderilemediginiDogrular_AC() {
        assertTrue(page.messageKutusuRequired_AC.isDisplayed());
        ReusableMethods.bekle(2);
    }
}
