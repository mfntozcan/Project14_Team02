Feature: US03 Kullanicilar "Contact" sayfasindan mesaj gonderebilmeli
  Background:
    Given kullanici "https://managementonschools.com/" e gider_AC
    Then Contact butonuna tiklar_AC

  Scenario:  TC01 Kullanicilar "Contact" sayfasindan mesaj gonderebilmeli
    And Your name alanina herhangi bir karakter iceren isim girer_AC
    And Your Email alanina icinde @ ve . karakterleri olan bir email adresi girer_AC
    And Subject alanina mesaj hakkinda bir konu basligi girer_AC
    And Message alanina icinde harf,rakam ve ozel karakterler olan bir mesaj girer_AC
    And Send Message butonuna tiklar_AC
    And Mesajin gonderilebildigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC02 Your Name alani bos birakilarak mesaj gonderilmez
    And Your Name alanini bos birakir_AC
    And Your Email alanina icinde @ ve . karakterleri olan bir email adresi girer_AC
    And Subject alanina mesaj hakkinda bir konu basligi girer_AC
    And Message alanina icinde harf,rakam ve ozel karakterler olan bir mesaj girer_AC
    And Send Message butonuna tiklar_AC
    And YourName kutusu bos oldugu icin mesajin gonderilemedigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC03 "Your Email" alanina icinde "@" ve "." karakterleri olmayan bir email ile mesaj gonderilmez
    And Your name alanina herhangi bir karakter iceren isim girer_AC
    And Your Email alanina icinde @ ve . karakterleri olmayan bir email adresi girer_AC
    And Subject alanina mesaj hakkinda bir konu basligi girer_AC
    And Message alanina icinde harf,rakam ve ozel karakterler olan bir mesaj girer_AC
    And Send Message butonuna tiklar_AC
    And Youremail kutusuna gecersiz bir email girildigi  icin mesajin gonderilemedigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC04 "Subject " alani bos birakilarak mesaj gonderilemez
    And Your name alanina herhangi bir karakter iceren isim girer_AC
    And Your Email alanina icinde @ ve . karakterleri olan bir email adresi girer_AC
    And Subject alanini bos birakir_AC
    And Message alanina icinde harf,rakam ve ozel karakterler olan bir mesaj girer_AC
    And Send Message butonuna tiklar_AC
    And Subject kutusu bos oldugu icin mesajin gonderilemedigini dogrular_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC05 "Message " alani bos birakilarak mesaj gonderilmez
    And Your name alanina herhangi bir karakter iceren isim girer_AC
    And Your Email alanina icinde @ ve . karakterleri olan bir email adresi girer_AC
    And Subject alanina mesaj hakkinda bir konu basligi girer_AC
    And Message alanini bos birakir_AC
    And Send Message butonuna tiklar_AC
    And Message alani bos oldugu icin mesajin gonderilemedigini dogrular_AC
    And Kullanici sayfayi kapatir_AC
