@US24
Feature: US24

  Background: US_24_Tekrar_Stepler
    Given Kullanici "anasayfaya"  gider*
    When Kullanici login butonuna tiklar*
    When Kullanici  User Name alanina Admin username girer*
    When Kullanici Password alanina  Admin password girer*
    When Kullanici login sekmesine tiklar*
    When Kullanici Admin-management sayfasini gorur*
    When Kullanici Menu tiklar*
    When Kullanici  Teacher Management tiklar*

  @TC_10
  Scenario: TC_10
    When Kullanici Choose Lessons bir ders secer*
    When Kullanici Name kismina isim girer*
    When Kullanici Surname kismina surname girer*
    When Kullanici Birth Place kismina  girer*
    When Kullanici Email kismina email girer*
    When Kullanici Phone kismina phone girer*
    When Kullanici Gender checkbox tan bir veri secer*
    When Kullanici Date Of Birth kismina tarih girer*
    When Kullanici Ssn kismina sss girer*
    When Kullanici User Name alanina username+ girer*
    When Kullanici Password alanina password girer*
    When Kullanici Teacher Submit butonuna tiklar*
    When Kullanici Teacher Saved Successfully mesajini gorur*
    And Kullanici Teacher List tablosunda eklemis oldugu Teacherin oldugunu gorur*


  @TC_11
  Scenario: TC_11
    When Kullanici Choose Lessons bir ders secer*
    When Kullanici Name kismina isim girer*
    When Kullanici Surname kismina surname girer*
    When Kullanici Birth Place kismina  girer*
    When Kullanici Email kismina email girer*
    When Kullanici Phone kismina phone girer*
    When Kullanici Gender checkbox tan bir veri secer*
    When Kullanici Date Of Birth kismina varolunan tarihten  ileri bir tarih girer*
    When Kullanici Ssn kismina sss girer*
    When Kullanici User Name alanina username+ girer*
    When Kullanici Password alanina password girer*
    When Kullanici Teacher Submit butonuna tiklar*
    And Kullanici teacher sayfasinda gecmis bir tarih olmali mesajini gorur*


  @TC_12
  Scenario: TC_12
    When Kullanici Choose Lessons bir ders secer*
    When Kullanici Name kismina isim girer*
    When Kullanici Surname kismina surname girer*
    When Kullanici Birth Place kismina  girer*
    When Kullanici Email kismina "monte" email girer*
    When Kullanici Phone kismina phone girer*
    When Kullanici Gender checkbox tan bir veri secer*
    When Kullanici Date Of Birth kismina tarih girer*
    When Kullanici Ssn kismina sss girer*
    When Kullanici User Name alanina username+ girer*
    When Kullanici Password alanina password girer*
    When Kullanici Teacher Submit butonuna tiklar*
    And Kullanici teacher sayfasinda Please enter valid email mesajini gorur*

  @TC_13
  Scenario: TC_13
    When Kullanici Choose Lessons bos birakir*
    When Kullanici Name kismina isim girer*
    When Kullanici Surname kismina surname girer*
    When Kullanici Birth Place kismina  girer*
    When Kullanici Email kismina email girer*
    When Kullanici Phone kismina phone girer*
    When Kullanici Gender checkbox tan bir veri secer*
    When Kullanici Date Of Birth kismina tarih girer*
    When Kullanici Ssn kismina sss girer*
    When Kullanici User Name alanina username+ girer*
    When Kullanici Password alanina password girer*
    When Kullanici Teacher Submit butonuna tiklar*
    And Kullanici teacher sayfasinda uyari mesajini gorur*