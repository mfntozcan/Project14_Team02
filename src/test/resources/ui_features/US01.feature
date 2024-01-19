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


  Scenario: TC02 Name Kutusu bos birakilarak sisteme kayit olunmaz
    Then kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And Name kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC03 SurName Kutusu bos birakilarak sisteme kayit olunmaz_SK
    Then kullanici name alanina isim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And Surname kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC04 "Birth Place" alani bos birakilarak sisteme kayit olunamamali_AC
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanini bos birakir_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And Birth Place kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC05 "Phone Number" alani bos birakilarak sisteme kayit olunamamali
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanini bos birak_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And phone Number kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC06 "Phone Number" alanina patterne uygun olmayan bir numara girerek kayit olunamamali
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina patterne uygun olmayan bir numara girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And Phone Number alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC07 "SSN" alanina patterne uygun olmayan bir numara girerek kayit olunamamali_AC
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina patterne uygun olmayan bir numara girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And SSN alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC08 "SSN" alanina bos birakilarak kayit olunamamali_AC
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanini bos birakir_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And  ssn kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC09 "Birth Date" alani bos birakilarak kayit olunamaz
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanini bos birakir_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And Birth Date alanini bos birakinca kayit olunamadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC10 "User Name" alani bos birakilarak kayit olunamamali
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanini bos birakir_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And User Name alani bos birakilarak kayit olunamadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC11 "Password" alani bos birakilarak kayit olunamamali
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanini bos birakir_AC
    And kullanici Register dugmesine tiklar_AC
    And Password alani bos birakilarak kayit olunamadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC12 Kullanici 8 karakterden az sifre ile kayit olamaz
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina yedi karakterli bir  "password" girer_AC
    And kullanici Register dugmesine tiklar_AC
    And Sekiz karakterden daha az karakterli bir sifre ile kayit olunamadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC


  Scenario: TC13 Kullanici sadece rakamlardan olusan bir sifre ile kayit olamaz
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina sadece rakamlardan olusan bir sifre girer_AC
    And kullanici Register dugmesine tiklar_AC
    And Kayit isleminin tamamlanmadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC14 Kullanici sadece kucuk harflerden olusan bir sifre ile kayit olamaz
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina sadece kucuk harflerden olusan bir sifre girer_AC
    And kullanici Register dugmesine tiklar_AC
    And kullanici sadece kucuk harflerden olusan bir sifre ile kayit olamaz_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC15 Kullanici sadece buyuk harflerden olusan bir sifre ile kayit olamaz
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina sadece buyuk harflerden olusan bir sifre girer_AC
    And kullanici Register dugmesine tiklar_AC
    And kullanici sadece buyuk harflerden olusan bir sifre ile kayit olamaz_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC16 Kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile kayit olamaz
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina sadece buyuk ve kucuk harflerden olusan bir sifre girer_AC
    And kullanici Register dugmesine tiklar_AC
    And kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile kayit olamaz_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC17 Kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile kayit olamaz
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina sadece rakam ve buyuk harflerden olusan bir sifre girer_AC
    And kullanici Register dugmesine tiklar_AC
    And kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile kayit olamaz_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC18 Daha once kayitli bir SSN number ile kayit olunamamali
    Then kullanici name alanina isim girer_AC
    And kullanici surname alanina soyisim girer_AC
    And kullanici Birth Place alanina dogum yeri girer_AC
    And kullanici Phone Number alanina telefonnumarasi girer_AC
    And kullanici Gender alanindan cinsiyet secer_AC
    And kullanici Birth Date alanina dogum gunu girer_AC
    And kullanici SSN alanina kayitli bir ssn girer_AC
    And kullanici User Name alanina username girer_AC
    And kullanici Password alanina password girer_AC
    And kullanici Register dugmesine tiklar_AC
    And Daha once kayitli bir SSN ile kayit olunamadigini dogrular_AC
    And Kullanici sayfayi kapatir_AC
