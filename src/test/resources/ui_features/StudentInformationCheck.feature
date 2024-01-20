@US021_TC01
Feature: US021
  Scenario: Ogrenci Choose Lesson Management Bilgilerini Gormeli
    Given kullanici Management On Schools sayfasina gider
    When Login butonuna tiklarr
    And ogrenci kullanici adi ve password bilgileri ile login olur
    When Kullanici menu butonuna tiklar
    When kullanici acilan ekranda Choose Lesson butonuna tiklar
    Then kullanici Choose Lesson Management sayfasinin acildigini dogrular
    Then Ogrenci Choose Lesson listesinde: Teacher, Day.Start Time ve Stop Time bilgilerini gorebildigi dogrulanir

