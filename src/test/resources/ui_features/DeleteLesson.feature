@US021_TC04
Feature: US021
  Scenario: Ogrenci Ayni gun ve saate gelen dersleri secememeli
    Given kullanici Management On Schools sayfasina gider
    When Login butonuna tiklarr
    And ogrenci kullanici adi ve password bilgileri ile login olur
    When Kullanici menu butonuna tiklar
    When kullanici acilan ekranda Choose Lesson butonuna tiklar
    Then kullanici Choose Lesson Management sayfasinin acildigini dogrular
    When kullanici Choose Lesson Listte silinmesi isdedigi dersi siler
    Then dersin silindigi dogrulanir