
@US07

Feature: Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
  Scenario: TC01 Dean silme butonunu gorebilmelidir

      Given Verilen URL'e git
      When Login linkine tıkla
      And Username kısmına gecerli bir veri gir
      And Password kutusuna gecerli bir şifre gir
      And  Dean olarak uygulamaya giriş yap
      And  Menu butonuna tikla
      And ViceDean Management a tikla
      Then Vice Dean List sayfasının göründüğünü dogrula
      Then Silme Butonunun göründüğünü doğrula

      And sayfayi kapatir



    Scenario: TC02 Dean, mesajları, yazarlarını(Isim), e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir

        Given Verilen URL'e git
        When Menu butonuna tikla
        When Main Menu den Contact Get All linkine tıkla
        Then Name bilgilerinin göründüğünü dogrula
        Then Email  bilgilerinin göründüğünü dogrula
        Then Date  bilgilerinin göründüğünü dogrula
        Then Subject  bilgilerinin göründüğünü dogrula
        Then Message  bilgilerinin göründüğünü dogrula


    Scenario: TC03 Dean mesajları silebilmelidir

        Given Verilen URL'e git
        When Menu butonuna tikla
        When Main Menu den Contact Get All linkine tıkla
        Then  Contact Message sayfasının göründüğünü dogrula
        Then Message sütunundan mesaj silinebildigini doğrula




