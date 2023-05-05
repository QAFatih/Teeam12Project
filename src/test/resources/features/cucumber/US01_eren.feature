@US01
Feature: US01_aday_ogrenciler_sisteme_kayıt_olabilmelidir

  Background:
    Given Kullanici anasayfaya gider...

  @US01_TC01
  Scenario: TC01
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanici "Guest User registered." popup'inin goruntulendigini dogrular.

  @US01_TC02
  Scenario: TC02
    When Kullanici Register butonuna tıklar.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı Name textbox'ının altında "Required" uyarısını görür

  @US01_TC03
  Scenario: TC03
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı Surname textbox'ının altında "Required" uyarısını görür

  @US01_TC04
  Scenario: TC04
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı birthplace textbox'ının altında "Required" uyarısını görür

  @US01_TC05

  Scenario: TC05
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı phone number textbox'ının altında "Required" uyarısını görür

  @US01_TC06
  Scenario: TC06
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanıcı Phone textbox'ını yanlış formatta doldurur
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı Phone textbox'ının altında "Minimum 12 character (XXX-XXX-XXXX)" uyarısını görür

  @US01_TC07
  Scenario: TC07
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanıcı Phone textbox'ına sayı dışında bir şey girer
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı "Please enter valid phone number" popup'ını görür



#    -------------------------------US08 BUGGED---------------------------------


  @US01_TC09
  Scenario: TC09
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı Date of Birth'ün altında "Required" uyarısını görür

  @US01_TC10
  Scenario: TC10
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanıcı güncel veya ileri tarihte bir doğum yılı girer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    And Kullanıcı birthday icin "geçmiş bir tarih olmalı" popup'ını görür

  @US01_TC11
  Scenario: TC11

    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı SSN'in altında "Required" uyarısını görür

  @US01_TC12
  Scenario: TC12
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanıcı SSN textbox'ını yanlış formatta doldurur
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı SSN'in altında "Minimum 11 character (XXX-XX-XXXX)" uyarısını görür

  @US01_TC13
  Scenario: TC13
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanıcı SSN textbox'ına sayı dışında bir şey girer
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı SSN icin "Please enter valid SSN number" popup'ını görür

  @US01_TC14
  Scenario: TC14
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Password textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı Username'in altında "Required" uyarısını görür

  @US01_TC15
  Scenario: TC15
    When Kullanici Register butonuna tıklar.
    And Kullanıcı name textbox'ına gecerli bir deger girer.
    And Kullanici surname textbox'ına gecerli bir deger girer.
    And Kullanici birth place textbox'ına gecerli bir deger girer.
    And Kullanici phone textbox'ına gecerli bir deger girer.
    And Kullanici bir gender secer
    And Kullanici gecerli bir dogum yili girer
    And Kullanici SSN textbox'ına gecerli bir deger girer.
    And Kullanici Username textbox'ına gecerli bir deger girer.
    And Kullanici kayıt olmak için Register butonuna tıklar.
    Then Kullanıcı Password'ün altında "Required" uyarısını görür

    @US01_TC16
    Scenario: TC16
      When Kullanici Register butonuna tıklar.
      And Kullanıcı name textbox'ına gecerli bir deger girer.
      And Kullanici surname textbox'ına gecerli bir deger girer.
      And Kullanici birth place textbox'ına gecerli bir deger girer.
      And Kullanici phone textbox'ına gecerli bir deger girer.
      And Kullanici bir gender secer
      And Kullanici gecerli bir dogum yili girer
      And Kullanici SSN textbox'ına gecerli bir deger girer.
      And Kullanici Username textbox'ına gecerli bir deger girer.
      And Kullanıcı Password textbox'ına 8 karakterden az bir şifre girer.
      And Kullanici kayıt olmak için Register butonuna tıklar.
      Then Kullanıcı Password'un altında "Minimum 8 character" uyarısını görür




