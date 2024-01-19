@US021_TC06
Feature: US021
  Scenario: Öğrenci sınav notlarını görebilmeli
    Given kullanici Management On Schools sayfasina gider
    When Login butonuna tiklarr
    And ogrenci kullanici adi ve password bilgileri ile login olur
    When Kullanici menu butonuna tiklar
    When kullanici acilan ekranda Grades and Announcements butonuna tiklar
    Then kullanici Student Info List sayfasinin acildigini dogrular
    Then kullanici sinav notlarini gorebildigini dogrular