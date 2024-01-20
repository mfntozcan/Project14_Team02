@DB
Feature: Dean Bilgisi Dogrulama
  Scenario: Kayitli Dean Bilgisi Dogrulama Testi
    Given Vice Dean Database baglantisi kurulur
    And Beklenen Vice Dean verisi hazirlanir
    When Kayitli Vice Dean bilgisini almak icin Query gonderilir
    Then Kayitli Vice Dean verisi dogrulanir