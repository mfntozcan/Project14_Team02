@US021_TC05
Feature: US021
  Scenario: Ogrenci Choose Lesson Management sayfasinda sectigi derslerin List'e eklendigini dogrular
    Given kullanici Management On Schools sayfasina gider
    When Login butonuna tiklarr
    And ogrenci kullanici adi ve password bilgileri ile login olur
    When Kullanici menu butonuna tiklar
    When kullanici acilan ekranda Choose Lesson butonuna tiklar
    Then kullanici Choose Lesson Management sayfasinin acildigini dogrular
    When kullanici Choose Lesson basligin altindaki secilmek istenilen ders veya dersler ikonuna tiklar
    And kullanici submit butonuna tiklar
    Then kullanci derslerin secildigini dogrular
    Then kullanici secilen dersin Lesson Program List'e eklendigini dorular