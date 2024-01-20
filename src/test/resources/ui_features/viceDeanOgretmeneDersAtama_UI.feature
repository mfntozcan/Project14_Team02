Feature: Vice Dean öğretmene ders atayabilmeli

  @UI @US12 @TC01
  Scenario: Vice Dean öğretmene ders atayabilmeli
    Given Kullanici web sitesine girer ht
    When Kullanici login e tiklar ht
    And  Username kutusuna "ahmethamza" girer ht
    And Password kutusuna "Project14+" girer ht
    And Login butonuna tiklar ht
    And Lesson Program butonuna tiklar ht
    And Choose Lessons boxuna ders girer ht
    And Choose  Education Term dropdownundan egitim donemi secer ht
    And Choose Day dropdownundan ders icin gun secer ht
    And Start Time boxundan ders icin baslama saati "1713" girer ht
    And Stop Time boxundan ders icin bitis saati "2321" girer ht
    And Submit butonuna tiklar ht
    Then Ders programinin olustugu dogrulanir ht
    When Ders secer ht
    And Choose Teacher dropdownundan ders icin ogretmen secer ht
    And Submit butonuna tiklarr ht
    Then Ogretmene ders atayabildigi dogrulanir ht
    And Sayfayi kapat ht


 @UI @US12 @TC02
 Scenario: Vice Dean öğretmene ders atayabilmeli
    Given Kullanici web sitesine girer ht
    When Kullanici login e tiklar ht
    And  Username kutusuna "ahmethamza" girer ht
    And Password kutusuna "Project14+" girer ht
    And Login butonuna tiklar ht
    And Lesson Program butonuna tiklar ht
    And Choose Lessons boxuna ders girer ht
    And Choose  Education Term dropdownundan egitim donemi secer ht
    And Choose Day dropdownundan ders icin gun secer ht
    And Start Time boxundan ders icin baslama saati "1713" girer ht
    And Stop Time boxundan ders icin bitis saati "2321" girer ht
    And Submit butonuna tiklar ht
    When Birden fazla ders secer ht
    And Choose Teacher dropdownundan ders icin ogretmen secer ht
    And Submit butonuna tiklarr ht
    Then Ogretmene ders atayabildigi dogrulanir ht
    And Sayfayi kapat ht
