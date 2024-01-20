@E2E
Feature: Dean Ekleme, Dogrulama ve Silme

  @UI
  Scenario: Admin Web Sitesinde Vice Dean Ekleyebilmeli
    Given Kullanici web sitesine gider
    When Kullanici login e tiklar
    And  Username kutusuna "celaltas" girer
    And Password kutusuna "Celal7186." girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Vice Dean Management butonuna tiklar
    And ViceDeanName kutusuna "Ayşe" girer
    And Vice DeanSurName kutusuna "Yılmaz" girer
    And Vice DeanBirthPlace kutusuna "İstanbul" girer
    And Vice DeanGender "Female" secenegini girer
    And Vice DeanDateOfBirth kutusuna "05051975" girer
    And Vice DeanPhone kutusuna "555-532-7695" girer
    And Vice DeanSSN kutusuna "528-36-7896" girer
    And Vice DeanUserName kutusuna "ayseyilmaz" girer
    And Vice DeanPassword kutusuna sifre girer
    And Vice DeanSubmit butonuna tiklar
    Then Vice Dean kaydi yapildigi dogrulanir

  Scenario: Olusturulan Dean hesap bilgisini alma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Kayitli Vice Dean verisinin ID numarasini alma
    And Vice Dean GetManagerById icin URL duzenlenir
    And Vice Dean GetManagerById icin URL duzenlenir
    When Vice Dean GetManagerById icin GET Request gonderilir ve response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And Vice Dean GetManagerById icin gelen Response Body dogrulanir


  Scenario: Kayitli Vice Dean Bilgisi Dogrulama Testi
    Given Vice Dean Database baglantisi kurulur
    And Beklenen Vice Dean verisi hazirlanir
    When Kayitli Vice Dean bilgisini almak icin Query gonderilir
    Then Kayitli Vice Dean verisi dogrulanir

  Scenario: Kayitli Vice dean hesabini silme testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Delete icin URL duzenlenir
    When Vice Dean Delete icin DELETE Request gonderilir ve Response alinir
    Then Status kodun 200 oldugu dogrulanir
