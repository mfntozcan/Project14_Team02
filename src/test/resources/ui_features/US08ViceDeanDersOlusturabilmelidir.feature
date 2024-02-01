
@US08
  Feature: Vice Dean olarak Lesson eklenebilmelidir
    Scenario: TC01 Vice Dean Web Sitesinden Lesson ekleyebilmeli

      Given Verilen URL'e git
      When Login linkine tıkla
      And Username kısmına gecerli bir veri gir
      And Password kutusuna gecerli bir şifre gir
      And Vice Dean olarak uygulamaya giriş yap
     When Menu butonuna tikla
     When Lesson Management a tikla
      When Cıkan ekrandan Lesson butonuna tıkla
      Then Add Lesson sayfası görüdüğünü dogrula
      And  Lesson Name kısmına ders  ismi girin
      And  Compulsory kutucugunu işretleyin
      And  Credit Score kısmına bir Score girin
      When  Submit butonu tıklayın
      Then Lesson created mesajı görüldüğünü dogrula

      And sayfayi kapatir



    Scenario: TC02 Vice Dean Lesson Name kutusunu bos birakarak yada tek bir harf yazarak Ders kaydını  olusturamamalidir.

      Given Verilen URL'e git
      When Login linkine tıkla
      And  Username kısmına gecerli bir veri gir
      And Password kutusuna gecerli bir şifre gir
      And Vice Dean olarak uygulamaya giriş yap
      When Menu butonuna tikla
      When Lesson Management a tikla
      When Cıkan ekrandan Lesson butonuna tıkla
      Then Add Lesson sayfası görüdüğünü dogrula
      And Lesson Name kısmını bos bırakın yada tek bir harf yazın
      And Compulsory kutucugunu işretleyin
      And Credit Score kısmına bir Score girin
      When Submit butonu tıklayın
      Then Lesson name required mesajını dogrula


      And sayfayi kapatir



    Scenario:TC03 Vice Dean Dersin (Compulsory) zorunlu olmadıgını işaretlemeden ders kaydı yapabilmelidir

      Given Verilen URL'e git
      When Login linkine tıkla
      And  Username kısmına gecerli bir veri gir
      And  Password kutusuna gecerli bir şifre gir
      And  Vice Dean olarak uygulamaya giriş yap
      When Cıkan ekrandan Lesson butonuna tıkla
      When Add Lesson sayfası görülmeli
      When Lesson Name kısmına ders  ismi girin
      Then Compulsory kutucugunu işretlemeyin
      And  Credit Score kısmına bir Score girin
      When  Submit butonu tıklayın
      Then Lesson created mesajı görüldüğünü dogrula


      And sayfayi kapatir