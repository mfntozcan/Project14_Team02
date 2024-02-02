@US01
Feature: Admin Dean Ekleyebilmeli

  Scenario: Admin Web Sitesinde Dean Ekleyebilmeli
    Given Kullanici web sitesine girer
    When Kullanici login e tiklar
    And  Username kutusuna "Yusuf1610" girer
    And Password kutusuna "Kagan1610" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Dean Management butonuna tiklar
    And DeanName kutusuna "Yusuf" girer
    And DeanSurName kutusuna "Ozer" girer
    And DeanBirthPlace kutusuna "Adana" girer
    And DeanGender "Male" secenegini girer
    And DeanDateOfBirth kutusuna "01081996" girer
    And DeanPhone kutusuna "bir telefon numarasi" girer
    And DeanSSN kutusuna "bir ssn numarasi" girer
    And DeanUserName kutusuna "bir kullanici adi" girer
    And DeanPassword kutusuna sifre girer
    And DeanSubmit butonuna tiklar
    Then Dean kaydi yapildigi dogrulanir