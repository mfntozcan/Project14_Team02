@UI14
Feature: US14-Vice Dean öğretmenleri görebilmeli ve güncelleme yapabilmelidir.

  Background: Ortak Test Caseler
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then User name kutsuna kayitli veriyi gir
    And Password kutusuna kayitli veriyi gir
    And Login in butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Teacher Management butonuna tikla
    And Teacher List'e ilk sayfaya git


  Scenario:TC01 Oluşturulan öğretmenin Name, Phone Number, SSN, User Name bilgileri görülebilmeli
 And Eklenen Ogretmen'in biglilerini dogrula

Scenario: TC2 Teacher List deki öğretmen bilgileri güncellenebilmeli
  And Eklenen Ogretmen'in uzerindeki edit butonuna tikla
  And Ogrenmenin bilgilerin guncellenebilir oldugunu dogrula
