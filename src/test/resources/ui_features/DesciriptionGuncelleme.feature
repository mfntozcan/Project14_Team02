@US020_TC06
Feature: US020
  Scenario: TC02 Toplantınin desciription bilgisini güncelleyebilmeli
    Given kullanici Management On Schools sayfasina gider
    When Login butonuna tiklarr
    And ogretmen kullanici adi ve password bilgileri ile login olur
    When Kullanici menu butonuna tiklar
    When kullanici meetManagemet butonuna tiklar
    Then Meet Managemet ekraninin acildigi dogrulanir
    When kullanici Meet List alaninda bulunan edit butonuna tiklar
    Then Edit Meet ekraninin acildigi dogrulanir
    When Guncellenmek desciription bilgisi girilir
    When Submit Butonuna tiklanir
    Then Guncelleme basarili bir sekilde yapilir