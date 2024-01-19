Feature: Vice Dean ders programi olusturabilmeli

 @UI @US10 @TC01
 Scenario: Vice Dean ders programi olusturabilmeli
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
   And Sayfayi kapat ht

 @UI @US10 @TC02
 Scenario: Vice Dean ders programi olusturabilmeli
   Given Kullanici web sitesine girer ht
   When Kullanici login e tiklar ht
   And Username kutusuna "ahmethamza" girer ht
   And Password kutusuna "Project14+" girer ht
   And Login butonuna tiklar ht
   And Lesson Program butonuna tiklar ht
   And Choose Lessons boxunu bos birakir ht
   And Choose  Education Term dropdownunu bos birakir ht
   And Choose Day dropdownunu bos birakir ht
   And Start Time boxundan ders icin baslama saati "1713" girer ht
   And Stop Time boxundan ders icin bitis saati "2321" girer ht
   And Submit butonuna tiklar ht
   Then Ders programinin olusmadigi dogrulanir ht
   And Sayfayi kapat ht


 @UI @US10 @TC03
 Scenario: Vice Dean ders programi olusturabilmeli
   Given Kullanici web sitesine girer ht
   When Kullanici login e tiklar ht
   And Username kutusuna "ahmethamza" girer ht
   And Password kutusuna "Project14+" girer ht
   And Login butonuna tiklar ht
   And Lesson Program butonuna tiklar ht
   And Choose Lessons boxundan birden fazla ders secer ht
   And Choose  Education Term dropdownundan egitim donemi secer ht
   And Choose Day dropdownundan ders icin gun secer ht
   And Start Time boxundan ders icin baslama saati "1713" girer ht
   And Stop Time boxundan ders icin bitis saati "2321" girer ht
   And Submit butonuna tiklar ht
   Then Ders programinin hepsinin olustugu dogrulanir ht
   And Sayfayi kapat ht


 @UI @US10 @TC04
 Scenario: Vice Dean ders programi olusturabilmeli
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
   And Dolu olan box'lar disindaki Start Time ve Stop Time alanlarini "1918" ve "2128" olarak doldur ht
   And Submit butonuna tiklar ht
   Then Ders programinin olustugu dogrulanir ht
   And Sayfayi kapat ht



