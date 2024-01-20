@US020_TC01
Feature: US020
  Scenario: TC01 Toplantıların, Date, Start Time, Stop Time ve Description görülmeli
    Given kullanici Management On Schools sayfasina gider
    When Login butonuna tiklarr
    And ogretmen kullanici adi ve password bilgileri ile login olur
    When Kullanici menu butonuna tiklarr
    When kullanici meetManagemet butonuna tiklar
    Then MeetList Ekraninda Date,Start Time,Stop Time ve Description kisimlarinin oldugu dogrulanir.
    And Sayfayi kapatir

