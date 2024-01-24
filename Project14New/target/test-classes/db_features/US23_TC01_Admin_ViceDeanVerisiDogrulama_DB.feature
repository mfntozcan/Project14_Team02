@DB
Feature: Admin Yetkisi Girisi Ile Vice Dean Bilgisi Dogrulama
  Scenario: Kayitli Vice Dean Bilgisi Dogrulama Testi
    Given Vice Dean Database baglantisi kurulur
    And Beklenen Vice Dean verisi hazirlanir
    When Kayitli Vice Dean bilgisini almak icin Query gonderilir
    Then Kayitli Vice Dean verisi dogrulanir