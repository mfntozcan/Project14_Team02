@US55

Feature: Admin Deanleri Gorebilmeli ve Silebilmeli

  Scenario: Admin Web Sitesinde Dean Ekleyebilmeli
    Given Kullanici web sitesine girer
    When Kullanici login e tiklar
    And  Username kutusuna "Yusuf1610" girer
    And Password kutusuna "Kagan1610" girer
    And Login butonuna tiklar
    And Menu butonuna gider
    And Dean Management butonuna tiklar
    And Edit butonuna tiklar
    And Birth Place butonu bilgileri guncellenir
    And Male buttona tiklar
    And Password kutusuna password girilir
    And Guncelleme onayi icin submit butonuna tiklanir
    Then Dean Update Successfull yazisi gorulmeli

