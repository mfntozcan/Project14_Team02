Feature: US01 Aday öğrenciler sisteme kayıt olabilmelidir.

  Background:
    Given kullanici "https://managementonschools.com/" e gider_AC
    And kullanici Register butonuna tiklar_AC
@a
  Scenario: TC01 Web sitesine yeni bir kullanıcı kaydi yapma
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And Kayit islemi basariyla tamamlanir_AC
    And Kullanici sayfayi kapatir_AC