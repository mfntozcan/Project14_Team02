@US020_TC07
Feature: US020
  Scenario: TC02 Toplantınin tarihini güncelleyebilmeli
    Given kullanici Management On Schools sayfasina gider
    When Login butonuna tiklarr
    And ogretmen kullanici adi ve password bilgileri ile login olur
    When Kullanici menu butonuna tiklar
    When kullanici meetManagemet butonuna tiklar
    Then Meet Managemet ekraninin acildigi dogrulanir
    When Silinmesi istenilen toplanti silinir
    Then Toplantini silindigini dogrula