@US05_API
Feature: Dean Controlu
  Background: "Admin" yetkisiyle giris yapilir
    Given Admin gerekli bilgiler ile giris yaparYK

  Scenario: Admin Dean hesabı olusturabilmeli
    And Dean Save icin URL duzenlenirYK
    And Dean Save icin payload duzenlenirYK
    When Dean Save icin POST Request gonderilir ve Response alinirYK
    Then Status kodun 200 oldugu dogrulanirYK

  Scenario: Admin olusturulan Dean hesabini gorebilmeli
    And Dean GetManagerById icin URL düzenlenirYK
    And Dean GetManagerById icin GET Request gönderilir ve Response alınırYK
    Then Status kodun 200 oldugu dogrulanirYK
    And Dean GetManagerById icin gelen Response Body dogrulanırYK


  Scenario: Admin olusturulan Dean hesabini silebilmeli
    And Dean Delete icin URL duzenlenirYK
    And Dean Delete icin DELETE Request gönderilir Response alınırYK
    Then Status kodun 200 oldugu dogrulanirYK
    And Dean Hesabının silindigi dogrulanirYK












