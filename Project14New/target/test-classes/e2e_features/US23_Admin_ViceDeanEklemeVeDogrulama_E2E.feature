@E2E
Feature: Admin ViceDeani Ekleme, Dogrulama ve Silme

  @UI
  Scenario: Admin Web Sitesinde Vice Dean Ekleyebilmeli (UI)
    Given Kullanici Web sitesine gider
    When Kullanici Logine tiklar
    And  Username Kutusuna "celaltas" girer
    And Password Kutusuna "Celal7186." girer
    And Login Butonuna tiklar
    And Menu Butonuna tiklar
    And Vice Dean Management butonuna tiklar
    And ViceDeanName kutusuna "celal" girer
    And Vice DeanSurName kutusuna "taskirdi" girer
    And Vice DeanBirthPlace kutusuna "ankara" girer
    And Vice DeanGender "MALE" secenegini girer
    And Vice DeanDateOfBirth kutusuna "01011990" girer
    And Vice DeanPhone kutusuna "585-532-7695" girer
    And Vice DeanSSN kutusuna "568-36-7896" girer
    And Vice DeanUserName kutusuna "celaltaskirdi" girer
    And Vice DeanPassword kutusuna sifre girer
    And Vice DeanSubmit butonuna tiklar
    Then Vice Dean kaydi yapildigi dogrulanir

  Scenario: Olusturulan Vice Dean hesap bilgisini alma testi (API)
    Given "Admin" adminyetkisi ile giris yapilir
    And Kayitli Vice Dean verisinin ID numarasini alma
    And Vice Dean getViceDeanById icin URL duzenlenir
    And Vice Dean getViceDeanById icin beklenen veriler duzenlenir
    When Vice Dean getViceDeanById icin GET Request gonderilir ve response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And Vice Dean getViceDeanById icin gelen Response Body dogrulanir


  Scenario: Kayitli Vice Dean Bilgisi Dogrulama Testi (DB)
    Given Vice Dean Database baglantisi kurulur
    And Beklenen Vice Dean verisi hazirlanir
    When Kayitli Vice Dean bilgisini almak icin Query gonderilir
    Then Kayitli Vice Dean verisi dogrulanir

  Scenario: Kayitli Vice dean hesabini silme testi (API)
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Delete icin URL duzenlenir
    When Vice Dean Delete icin DELETE Request gonderilir ve Response alinir
    Then Status Kodun 200 oldugu dogrulanir
