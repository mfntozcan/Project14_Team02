@US021_TC07
Feature: US021
  Scenario: Öğrenci, danışmanın kendisi için oluşturduğu toplantıları görebilmeli
    Given kullanici Management On Schools sayfasina gider
    When Login butonuna tiklarr
    And ogrenci kullanici adi ve password bilgileri ile login olur
    When Kullanici menu butonuna tiklar
    When kullanici acilan ekranda Grades and Announcements butonuna tiklar
    Then kullanici Student Info List sayfasinin acildigini dogrular
    Then kullanici danışmanın kendisi için oluşturduğu toplantıları görebildigi dogrulanir