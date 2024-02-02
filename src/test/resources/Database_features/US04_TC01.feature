@US_05_DB
Feature: Dean Bilgisi dogrulama
  Scenario: Kayitli Dean Bilgisi Dogrulama
    Given Database baglantisi kurulurYK
    And Kayıtlı Dean bilgisini almak için Qery gönderilirYK
    Then Kayıtlı Dean verisi dogrulanirYK