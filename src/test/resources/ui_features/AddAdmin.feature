@US022_TC01
Feature: US022
  Scenario: Admin kullanicisi olusturulur
    Given kullanici Management On Schools sayfasina gider
    When Login butonuna tiklarr
    And Admin kullanici adi ve password bilgileri ile login olur
    When Kullanici menu butonuna tiklar
    When kullanici acilan ekranda Admin Management butonuna tiklar
    Then kullanici Add Admin sayfasinin acildigini dogrular

    Then Name Bos birakilamadigi dogrulanir
    Then Surname Bos birakilamadigi dogrulanir
    Then Birt Place bos birakilamadigi dogrulanir
    Then Dogum tarihinin bos birakilamadigi dogrulanir
    Then phone alaninin bos birakilamadigi dogrulanir
    Then Ssn alaninin bos birakilamadigi dogrulanir
    Then Username alaninin bos birakilamadigi dogrulanir
    Then Password bilgisinin bos birakilamadigi dogrulanir

    When Name alanina tikla ve Name girilir

    When Surname alanina tikla ve Surname girilmeli

    When Birth Place alanina tikla ve Birth Place girilmeli
   # Then Gender Bos birakilamadigi dogrulanir
    When Gender alanindan Cinsivet secilmeli

    When Dogum tarihi alanina tiklanir ve tarih girilir

    When Phone alanina (xxx-xxx-xxxx) formatinada no girilir

    When Ssn alanina (xxx-xx-xxxx) formatinda ssn girilir

    When Username alanina Name bilgisi girilir

    When Password alanina Password bilgisi girilir
    And submit butonuna tiklanir
    Then Admin List alaninda admin olusturuldugu dogrulanir