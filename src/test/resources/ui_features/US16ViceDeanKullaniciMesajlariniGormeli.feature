
@US16

  Feature: Vice Dean, kullanıcıların gönderdiği mesajları görebilmelidir.
    Scenario: TC01 Vice Dean silme butonunu gorebilmelidir

    Given Verilen URL'e git
    When Login linkine tıkla
    And Username kısmına gecerli bir veri gir
    And Password kutusuna gecerli bir şifre gir
    And Vice Dean olarak uygulamaya giriş yap
    Then Vice Dean List sayfasının göründüğünü dogrula
    Then Silme Butonunun göründüğünü doğrula


      Scenario: TC02 Vice Dean, mesajları, yazarlarını, e-maillerini, gönderilme tarihi ve  subject bilgilerini görüntüleyebilmelidir
     Given Verilen URL'e git
     When Login linkine tıkla
     And Username kısmına gecerli bir veri gir
     And Password kutusuna gecerli bir şifre gir
     And Vice Dean olarak uygulamaya giriş yap
     When Menu butonuna tikla
     When Contact Get All secenegini tıkla
     Then Mesaj yazanının isminin göründügünü dogrula
     Then Mesaj yazanının Email inin göründügünü dogrula
     Then Mesaj tarihinin göründügünü dogrula
     Then Mesaj Subject acıklamasını dogrula
     Then Mesajın ne oldugunu dogrula

        Scenario: TC03 Vice Dean mesajları silebilmelidir.

       Given Verilen URL'e git
       When Login linkine tıkla
       And Username kısmına gecerli bir veri gir
       And Password kutusuna gecerli bir şifre gir
       And Vice Dean olarak uygulamaya giriş yap
       When Menu butonuna tikla
       When Contact Get All secenegini tıkla
       Then Mesaj silme butonu oldugunu dogrula