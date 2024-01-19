@UI @US13
Feature: Vice Dean öğretmen oluşturabilmelidir.
  Background: Vice Dean Login olur
    Given Verilen Url'ye gidilir
    Then  Giris sayfasinda sag ust kosede logine tiklanir
    Then User name kutsuna ViceDeanSevgi girilir
    Then Password kutusuna "1234567890Su" girilir
    When Login butonuna tiklanir
    And Vice Dean hesabiyla login olunur
    And Ana menüden Teacher Management seçeneğini tiklanir
    And Add Teacher sayfasina gidilir




  Scenario Outline: TC01  Vice Dean Ogretmen Olusturabilmeli
    And Choose Lessons kutusuna bir ders secilir
    And "<Name>" ve "<Surname>" kutusuna bir isim ve soyisim girilir
    And "<BirthPlace>"kutusuna bir yer adi girilir
    And "<email>" kutusuna  bir Eposta adresi  girilir
    And "<PhoneNumber>" kutusuna  bir tel no   girilir
    And Is Advisor Teacher seçeneğini işaretlenir
    And "<Gender>"  secenegi altinda bir kutucugu isaretlenir
    And "<Birth Date>" kutusuna bir tarih girilir
    And "<Ssn numarasi>" girilir
    And "<Username>" ktusuna bir kullanici adi girilir
    Then "<Password>" kutusuna bir sifre girilir
    When Submit butonuna tiklanir
    Then Basarili bir sekilde ogretmen olusturuldugunu dogrulanir
    And sayfayi kapatilir
    Examples:
      | Name |Surname | BirthPlace | email | PhoneNumber | Gender | Birth Date | Ssn numarasi | Username | Password |
      |Sumeyra  |unlu    |Ankara  |smyr@gmail.com|222-333-1239|Female|28.01.1987  |123-34-1907   |TeacherSumeyra|123456789Su|






  Scenario: TC02 ViceDean  name kutusunu bos birakarak ogretmen olusturamaz(-)
    Given ViceDeanKullanici olarak name kutusu haric diger alanlari doldurun
    Then ViceDeanKullanici name  required uyarisini gorur
    Then Ogretmen olusturulamadigi dogrulanilir
    And Kullanici  tarafindan sayfa kapatilir



  Scenario: TC02 ViceDean  email  kutusuna "gmailcom" formatina . koymadan  yazarak ogretmen olusturabilir(bug)
    Given ViceDeanKullanici olarak email kutusuna "smyr@gmailcom" grilir
    Then Basarili bir sekilde ogretmen olusturuldugunu dogrulanir
    And Kullanici  tarafindan sayfa kapatilir


  Scenario: TC02 ViceDean  email  kutusuna "gmail.com" formatini "gxmail" yazarak ogretmen olusturabilir(bug)
    Given ViceDeanKullanici olarak email kutusuna "smyr@gxmail.com" grilir
    Then Basarili bir sekilde ogretmen olusturuldugunu dogrulanir
    And Kullanici  tarafindan sayfa kapatilir












