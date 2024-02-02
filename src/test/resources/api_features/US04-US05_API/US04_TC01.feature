@API-US04
Feature: US04 Dean Controller
  Scenario: : Admin Dean Ekleyebilmeli
    Given Admin gerekli bilgiler ile giris yaparYK
    And Dean Save icin URL duzenlenirYK
    And Dean Save icin payload duzenlenirYK
    When Dean Save icin POST Request gonderilir ve Response alinirYK
    Then Status kodun 200 oldugu dogrulanirYK
    And Dean Save icin gelen Response body dogrulanirYK



