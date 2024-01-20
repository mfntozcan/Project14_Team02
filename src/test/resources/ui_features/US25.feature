@UI25
Feature: US25-Admin Student oluşturabilmeli


  Scenario:TC01 Öğrecinin danışman öğretmeni seçilmelidir.
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login in butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And Choose Tecaher kutusundan bir ogretmen sec
    And danışman öğretmeni seçilebilir oldugunu dogrula

  Scenario: TC02 "Name" girilmelidir. Boş bırakılamaz.
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login in butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And  name kutusuna isim gir
    And  name kutusuna isim girdigini dogrula

  Scenario: TC03 "Surname" girilmelidir. Boş bırakılamaz.
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And Surname kutusuna soyisim gir
    And Soyisim kutusuna Soyisim girdigini dogrula


  Scenario: TC04 "Birth Place" girilmelidir. Boş bırakılamaz.
    Given Verilen Url'ye git
    When  Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And Birth Place kutusuna dogrum yeri gir gir
    And dogum yeri kutusuna dogum yer girdigini dogrula

  Scenario: TC05 E-mail girilmelidir. Boş bırakılamaz.
    Given Verilen Url'ye git
    When  Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And   Login butonuna tikla
    And   Acilan sayfada menu butonuna tikla
    And   Student Management butonuna tikla
    And   E-mail kutusuna mail gir
    And   E-mail kutusuna mail girdigini dogrula

  Scenario: TC06 Telefon numarasi girilmelidir. Boş bırakılamaz.
    Given Verilen Url'ye git
    When  Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And   Login butonuna tikla
    And   Acilan sayfada menu butonuna tikla
    And   Student Management butonuna tikla
    And   Telefon numarasi kutusuna telefon numarasi gir
    And   Telefon numarasi kutusuna telefon numarasi girdigini dogrula


  Scenario: TC07
    Given  Verilen Url'ye git
    When   Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And    Login butonuna tikla
    And    Acilan sayfada menu butonuna tikla
    And    Student Management butonuna tikla
    And    Cinsiyet kutusuna cinsiyet seciniz
    And    Cinsiyet kutusuna Cinsiyet sectigini dogrula


  Scenario: TC08
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And Doğum tarihi kutusuna tarih gir
    And Doğum tarihi kutusuna tarih girdigini dogrula

  Scenario: TC09
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And SSN kutusuna ssn gir
    And SSN kutusuna ssn girdigini dogrula


  Scenario:TC10
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And Username kutusuna kullinici adi gir
    And Username kutusuna kullanici adi girdigini dogrula


  Scenario:TC11
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And Father name kutusuna baba isimi gir
    And Father name kutusuna baba isimi girdigini dogrula


  Scenario: TC12
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And Mother name kutusuna anne isimi gir
    And Mother name kutusuna anne isimi girdigini dogrula


  Scenario: TC13
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And Student number otomatik olarak geldigin dogrula




  Scenario: TC14
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And Student number otomatik olarak geldigin dogrula
    And Verilen Url'ye git


  Scenario:TC15
    Given Verilen Url'ye git
    When Login butonuna tikla
    Then Admin Username kutsuna kayitli veriyi gir
    Then Admin Password kutusuna kayitli veriyi gir
    And Login butonuna tikla
    And Acilan sayfada menu butonuna tikla
    And Student Management butonuna tikla
    And password kutusuna buyuk kucuk ve bir rakam icerdigini dogrula






















