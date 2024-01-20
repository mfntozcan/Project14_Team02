package team02.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import team02.pages.ViceDeanAddTeacherPage;
import team02.utilities.ConfigReader;
import team02.utilities.Driver;






public class ViceDeanTeacherAddStepDefs {


    ViceDeanAddTeacherPage viceDeanAddTeacherPage =new ViceDeanAddTeacherPage();


    @Given("Verilen Url'ye gidilir")
    public void verilenUrlYeGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));

    }


    @Then("Giris sayfasinda sag ust kosede logine tiklanir")
    public void girisSayfasindaSagUstKosedeLogineTiklanir() {

     viceDeanAddTeacherPage.loginLink.click();
    }

    @Then("User name kutsuna ViceDeanSevgi girilir")
    public void userNameKutsunaViceDeanSevgiGirilir() {

    }

    @Then("Password kutusuna {string} girilir")
    public void passwordKutusunaGirilir(String arg0) {
    }

    @When("Login butonuna tiklanir")
    public void loginButonunaTiklanir() {
    }

    @And("Vice Dean hesabiyla login olunur")
    public void viceDeanHesabiylaLoginOlunur() {
    }

    @And("Ana menüden Teacher Management seçeneğini tiklanir")
    public void anaMenüdenTeacherManagementSeçeneğiniTiklanir() {
    }

    @And("Add Teacher sayfasina gidilir")
    public void addTeacherSayfasinaGidilir() {
    }

    @And("Choose Lessons kutusuna bir ders secilir")
    public void chooseLessonsKutusunaBirDersSecilir() {
    }

    @And("{string} ve {string} kutusuna bir isim ve soyisim girilir")
    public void veKutusunaBirIsimVeSoyisimGirilir(String arg0, String arg1) {
    }

    @And("{string}kutusuna bir yer adi girilir")
    public void kutusunaBirYerAdiGirilir(String arg0) {
    }

    @And("{string} kutusuna  bir Eposta adresi  girilir")
    public void kutusunaBirEpostaAdresiGirilir(String arg0) {
    }

    @And("{string} kutusuna  bir tel no   girilir")
    public void kutusunaBirTelNoGirilir(String arg0) {
    }

    @And("Is Advisor Teacher seçeneğini işaretlenir")
    public void isAdvisorTeacherSeçeneğiniIşaretlenir() {
    }

    @And("{string}  secenegi altinda bir kutucugu isaretlenir")
    public void secenegiAltindaBirKutucuguIsaretlenir(String arg0) {
    }

    @And("{string} kutusuna bir tarih girilir")
    public void kutusunaBirTarihGirilir(String arg0) {
    }

    @And("{string} girilir")
    public void girilir(String arg0) {
    }

    @And("{string} ktusuna bir kullanici adi girilir")
    public void ktusunaBirKullaniciAdiGirilir(String arg0) {
    }

    @Then("{string} kutusuna bir sifre girilir")
    public void kutusunaBirSifreGirilir(String arg0) {
    }

    @When("Submit butonuna tiklanir")
    public void submitButonunaTiklanir() {
    }

    @Then("Basarili bir sekilde ogretmen olusturuldugunu dogrulanir")
    public void basariliBirSekildeOgretmenOlusturuldugunuDogrulanir() {
    }

    @And("sayfayi kapatilir")
    public void sayfayiKapatilir() {
    }

    @Given("ViceDeanKullanici olarak name kutusu haric diger alanlari doldurun")
    public void vicedeankullaniciOlarakNameKutusuHaricDigerAlanlariDoldurun() {
    }

    @Then("ViceDeanKullanici name  required uyarisini gorur")
    public void vicedeankullaniciNameRequiredUyarisiniGorur() {
    }

    @Then("Ogretmen olusturulamadigi dogrulanilir")
    public void ogretmenOlusturulamadigiDogrulanilir() {
    }

    @And("Kullanici  tarafindan sayfa kapatilir")
    public void kullaniciTarafindanSayfaKapatilir() {
    }


    @Given("ViceDeanKullanici olarak email kutusuna {string} grilir")
    public void vicedeankullaniciOlarakEmailKutusunaGrilir(String arg0) {
    }


}
