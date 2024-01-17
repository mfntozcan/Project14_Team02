@UI @US13
Feature: Vice Dean öğretmen oluşturabilmelidir.
  Scenario:TC01 -Vice Dean olarak basarili bir sekilde giris yapabilmeli ve ogretmen olusturma sayfasina gidilebilmelidir.
    Given Verilen Url'ye gidin
    Then User name kutsuna kayitli veriyi girin
    When Password kutusuna kayitli veriyi girin
    Then Login butonuna tiklayin
    And Ana menüden "Teacher Management" seçeneğini tiklayin
    And "Add Teacher" sayfasina gidin
    And Choose Lessons kutusuna bir ders secin
    And Name ve Surname kutusuna bir isim ve soyisim girin
    And Birth Place kutusuna bir yer adi girin
    And Email adresi kutusuna  bir Eposta adresi  girin
    And Is Advisor Teacher seçeneğini işaretleyin
    And Gender  secenegi altinda bir kutucugu isaretleyin
    And Birth Date kutusuna bir tarih girin
    And Ssn numarasi girin
    And Username ktusuna bir kullanici adi girin
    Then Password kutusuna bir sifre girin
    When Submit butonuna tiklayin
    But Basarili bir sekilde ogretmen olusturuldugunu dogrula



















