@US15
Feature: US15
  Background: tekrar_eden_stepler
    Given Kullanici anasayfaya gider...
    When Kullanici login butonuna tiklar...
    When Kullanici Username alanina username girer...
    When Kullanici password alanini password girer...
    When Kullanici iclogine tiklar...
    When kullanici lesson sayfasini gorur...
    When Kullanici menu butonuna tiklar...
    When Kullanici Student Management butonuna tiklar...
    When Kullanici student sayfasina girer...



  @us15tc01
  Scenario: tc01_ogrenci_danisman_ogretmeni_secilmesi
    When Kullanici Choose Advisor Teacher checkboxdan ogretmeni secer...
    When Kullanici name alanina name girer...
    When Kullanici surname alanina surname girer...
    When Kullanici Birth Place alanina date girer...
    When Kullanici Email alanina email girer...
    When Kullanici Phone alanina phone girer...
    When Kullanici Gender checkbox ina tiklar...
    When Kullanici Date Of Birth alanina date girer...
    When Kullanici Ssn alanina ssn girer...
    When Kullanici User Name alanina username girer...
    When Kullanici Father Name alanina fathername girer...
    When Kullanici Mather Name alanina mathername girer...
    When Kullanici password alanina password girer...
    When Kullanici student submit butonuna tiklar...
    And Kullanici student list tablosunda olusturdugu student in oldugunu gorur...
    And Kullanici sayfayi kapatir...


    @us15tc02
    Scenario: tc02_ogrencinin_varolan_tarihten_ileri_tarih_secmesi_halinde_danisman_ogretmeni_secilememesi
    When Kullanici Choose Advisor Teacher checkboxdan ogretmeni secer...
    When Kullanici name alanina name girer...
    When Kullanici surname alanina surname girer...
    When Kullanici Birth Place alanina date girer...
    When Kullanici Email alanina email girer...
    When Kullanici Phone alanina phone girer...
    When Kullanici Gender checkbox ina tiklar...
    When Kullanici Date Of Birth alanina var olunan zamandan ileri bir tarih girer...
    When Kullanici Ssn alanina ssn girer...
    When Kullanici User Name alanina username girer...
    When Kullanici Father Name alanina fathername girer...
    When Kullanici Mather Name alanina mathername girer...
    When Kullanici password alanina password girer...
    When Kullanici student submit butonuna tiklar...
    And Kullanici gecmis bir tarih olmali  mesajini gorur...
      And Kullanici sayfayi kapatir...

  @us15tc03
  Scenario: tc03_ogrencinin_danisman_ogretmeni_secmemesi_ile_ilgili_negatif_test_case
    When Kullanici Choose Advisor Teacher checkboxdan ogretmeni secmez...
    When Kullanici name alanina name girer...
    When Kullanici surname alanina surname girer...
    When Kullanici Birth Place alanina date girer...
    When Kullanici Email alanina email girer...
    When Kullanici Phone alanina phone girer...
    When Kullanici Gender checkbox ina tiklar...
    When Kullanici Date Of Birth alanina date girer...
    When Kullanici Ssn alanina ssn girer...
    When Kullanici User Name alanina username girer...
    When Kullanici Father Name alanina fathername girer...
    When Kullanici Mather Name alanina mathername girer...
    When Kullanici password alanina password girer...
    When Kullanici student submit butonuna tiklar...
    And Kullanici please select advisor teacher mesajini gorur...
    And Kullanici sayfayi kapatir...

    @us15tc04
    Scenario: tc04_ogrencinin_invalid_email_girmesi_sonucunda_advisor_teacher_secememesi
      When Kullanici Choose Advisor Teacher checkboxdan ogretmeni secer...
      When Kullanici name alanina name girer...
      When Kullanici surname alanina surname girer...
      When Kullanici Birth Place alanina date girer...
      When Kullanici Email alanina invalid email girer...
      When Kullanici Phone alanina phone girer...
      When Kullanici Gender checkbox ina tiklar...
      When Kullanici Date Of Birth alanina date girer...
      When Kullanici Ssn alanina ssn girer...
      When Kullanici User Name alanina username girer...
      When Kullanici Father Name alanina fathername girer...
      When Kullanici Mather Name alanina mathername girer...
      When Kullanici password alanina password girer...
      When Kullanici student submit butonuna tiklar...
      And Kullanici invalid email uyarisini gorur...
      And Kullanici sayfayi kapatir...



