@API
Feature: US 23 Admin Vice Dean hesabi olusturabilmeli
  Scenario: TC 01 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload1 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 02 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload2 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 03 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload3 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 04 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload4 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 05 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload5 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 06 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload6 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 07 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload7 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 08 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload8 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 09 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload9 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 400 oldugu dogrulanir


  Scenario: TC 10 Admin yetkisi ile Vice Dean hesabi olusturamama testi
    Heap olusturulamamz
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload10 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 400 oldugu dogrulanir



  Scenario: TC 11 Admin yetkisi ile Vice Dean hesabi olusturamama testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload11 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir


  Scenario: TC 12 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload12 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 13 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload13 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 14 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload14 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 15 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload15 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir

  Scenario: TC 16 Admin yetkisi ile Vice Dean hesabi olusturma testi
    Given "Admin" adminyetkisi ile giris yapilir
    And Vice Dean Save icin URL duzenlenir
    And Vice Dean Save icin Payload16 duzenlenir
    When Vice Dean Save icin POST Request gonderilir ve Response alinir
    Then Vice Dean Status kodun 200 oldugu dogrulanir
    And  Vice Dean Save icin  Response Body dogrulanir



