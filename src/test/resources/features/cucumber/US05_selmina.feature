@US05
Feature: US05_Admin_Dean_Ekleyebilmeli

  Background: Dean_sayfasina_gitme

    Given Kullanici anasayfaya "https://www.managementonschools.com/" gider..
    When Login butonuna tiklar..
    And Username "AdminGezi" girer..
    And Password "admingezi" girer..
    And Ikinci login butonuna tiklar..
    And Kullanici menu butonuna tiklar...
    Then Kullanici Dean Management butonuna tiklar

    @US5-TC01
    Scenario: Deanlist_gorunurlugu
      When Admin Dean listteki name sutununda bulunan bilgileri gormelidir
      And Admin Dean listteki gender sutununda bulunan bilgileri gormelidir
      And Admin Dean listteki phone number sutununda bulunan bilgileri gormelidir
      And Admin Dean listteki ssn sutununda bulunan bilgileri gormelidir
      And Admin Dean listteki username sutununda bulunan bilgileri gormelidir

  @US5-TC02
  Scenario: Admin_deanlist_editleyebilmeli
    When Admin Dean listteki istedigi bilgileri editleyebilmeli