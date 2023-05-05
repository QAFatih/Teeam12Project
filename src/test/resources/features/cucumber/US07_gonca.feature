@US07
Feature: US07_Dean_Contact_Message
  @US07_TC01
  Scenario: US07_Pozitif_Test
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Menu butonuna tiklar
    Then kullanici acilan pencerede Contact Get All sekmesine tiklar
    Then kullanici Contact Message sayfasinda oldugunu dogrular
    Then kullanici Name bilgisini goruntuler
    Then kullanici Email bilgisini goruntuler
    Then kullanici Date bilgisini goruntuler
    Then kullanici Subject bilgisini goruntuler
    Then kullanici Message bilgisini goruntuler



