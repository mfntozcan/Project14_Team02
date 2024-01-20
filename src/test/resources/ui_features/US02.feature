Feature: US02 Admin Guest User List Bilgilerini Gorebilmeli_Silebilmeli
  Background:
    Given kullanici "https://managementonschools.com/" e gider_AC
    Then Admin olarak Login ikonunu tiklar_AC
    And Admin olarak username kutusununa "Admince" girer_AC
    And Admin olarak password kutusuna "Test.123" girer_AC
    And Admin olarak Login butonunu tiklar_AC
    And Admin olarak Menu butonuna basar_AC
    And Admin olarak Guest User linkini tiklar_AC

@A
  Scenario: TC01 Admin, Guest User List bilgilerini gorebilmeli
    Given Admin Guest_User List'i gorur_AC
    And Admin Guest_User Name bilgilerini gorur_AC
    And Admin Guest_User Phone Number bilgilerini gorur_AC
    And Admin Guest_User SSN bilgilerini gorur_AC
    And Admin Guest_User User Name bilgilerini gorur_AC
    And Kullanici sayfayi kapatir_AC

  Scenario: TC02 Admin, Guest User List bilgilerini silebilmeli
    Given Admin Guest_User List'i gorur_AC
    Then Admin Guest_User Delete butonunu gorur_AC
    And Admin uyari mesajini gorerek silme isleminin tamamlandigini gorur_AC
