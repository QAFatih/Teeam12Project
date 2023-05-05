@US02
Feature: US02_admin_guest_user_list

  Background:
    Given Kullanici anasayfaya gider...

  @US02_TC01
  Scenario: TC01
    When Kullanıcı Login butonuna tıklar
    And Kullanıcı User Name textbox'ına Admin girişi için geçerli bir Username girer
    And Kullanıcı password textbox'ına Admin girişi için geçerli bir password girer
    And Kullanıcı giris yapmak icin Login butonuna tıklar
    And Kullanıcı Menu butonuna tıklar
    And Kullanıcı açılan Main Menu"de bulunan Guest User a tıklar
    Then Kullanıcı Guest User'ların Name-Surname sütununda bulunan bilgilerini görebilmelidir.
    And Kullanıcı Guest User'ların Phone Number sütununda bulunan bilgilerini görebilmelidir.
    And Kullanıcı Guest User'ların Ssn sütununda bulunan bilgilerini görebilmelidir.
    And Kullanıcı Guest User'ların User Name sütununda bulunan bilgilerini görebilmelidir.


  @US02_TC02
  Scenario: TC02
    When Kullanıcı Login butonuna tıklar
    And Kullanıcı User Name textbox'ına Admin girişi için geçerli bir Username girer
    And Kullanıcı password textbox'ına Admin girişi için geçerli bir password girer
    And Kullanıcı giris yapmak icin Login butonuna tıklar
    And Kullanıcı Menu butonuna tıklar
    And Kullanıcı açılan Main Menu"de bulunan Guest User a tıklar
    When Kullanıcı silmek istediği Guest User'in bilgilerinin sağında yer alan çöp kutusu butonuna tıklar
    Then Kullanıcı "Guest User deleted Successful" popup'ını görebilmelidir

