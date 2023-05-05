@US04
Feature: US04_Admin_Dean_Ekleyebilmeli

  Background: Dean_sayfasina_gitme

    Given Kullanici anasayfaya "https://www.managementonschools.com/" gider..
    When Login butonuna tiklar..
    And Username "AdminGezi" girer..
    And Password "admingezi" girer..
    And Ikinci login butonuna tiklar..
    And Kullanici menu butonuna tiklar...
    Then Kullanici Dean Management butonuna tiklar

  @US4-TC01
  Scenario: butun_degerlerin_valid_girilmesi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC02
  Scenario: name_alaninin_bos_birakilmasi
    When Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar


  @US4-TC03
  Scenario: surname_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC04
  Scenario: birthplace_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC05
  Scenario: dateofbirth_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC06
  Scenario: phone_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC07
  Scenario: ssn_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC08
  Scenario: username_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC09
  Scenario: password_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar






  @US4-TC02
  Scenario: name_alaninin_bos_birakilmasi
    When Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar


  @US4-TC03
  Scenario: surname_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC04
  Scenario: birthplace_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC05
  Scenario: dateofbirth_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC06
  Scenario: phone_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC07
  Scenario: ssn_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC08
  Scenario: username_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Password "admingezi" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar

  @US4-TC09
  Scenario: password_alaninin_bos_birakilmasi
    When Admin Name "Ali" alanina valid bir deger girer
    And  Admin Surname "Can" alanina valid bir deger girer
    And Admin Birth Place "Istanbul" alanina valid bir deger girer
    And Admin Gender alaninda secim yapar
    And Admin Date Of Birth "01.01.1995" alanina valid bir deger girer
    And Admin Phone "555-002-0001" alanina belirtilen formatta valid bir deger girer
    And Admin SSN "155-55-5555" alanina belirtilen formatta valid bir deger girer
    And Admin Username "alican1" alanina valid bir deger girer
    Then Admin Submit butonuna tiklar




