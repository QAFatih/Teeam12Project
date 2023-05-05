@US10
Feature: US10_vice_dean_ders_programi_olusturabilmelidir


  Background: ders_program_sayfasi
  Given Kullanici anasayfaya "https://www.managementonschools.com/" gider..
  When Login butonuna tiklar..
  And Username "ilhanlar" girer..
  And Password "ilhanlar" girer..
  And Ikinci login butonuna tiklar..
  And Lesson Program a tiklar..


  @US10-TC01
  Scenario: tc01-bitis_saati_secilmedi
  And Ders "ilhanlilar tarihi" secer..
  And Ders icin donem "SPRING_SEMESTER" secer..
  And Ders icin gun "FRIDAY" secer..
  And Dersin baslama saatini "01:00PM" secer..
  And Submit tusuna basar..
  Then Bitis saatinin altindaki Required yazisini gorur..


  @US10-TC02
  Scenario: tc02-baslama_saati_secilmedi
  And Ders "Ilhanlilar tarihi" secer..
  And Ders icin donem "SPRING_SEMESTER" secer..
  And Ders icin gun "FRIDAY" secer..
  And Dersin bitis saatini "02:00PM" secer..
  And Submit tusuna basar..
  Then Baslama saatinin altindaki Required yazisini gorur..


  @US10-TC03
  Scenario: tc03-gun_secilmedi
  And Ders "Ilhanlilar tarihi" secer..
  And Ders icin donem "SPRING_SEMESTER" secer..
  And Dersin baslama saatini "01:00PM" secer..
  And Dersin bitis saatini "02:00PM" secer..
  And Submit tusuna basar..
  Then "Please select day" mesajini gorur..


  @US10-TC04
  Scenario: tc04-donem_secilmedi
  And Ders "Ilhanlilar tarihi" secer..
  And Ders icin gun "FRIDAY" secer..
  And Dersin baslama saatini "01:00PM" secer..
  And Dersin bitis saatini "02:00PM" secer..
  And Submit tusuna basar..
  Then "Please select education term" mesajini gorur..


  @US10-TC05
  Scenario: tc05-ders_secilmedi
  And Ders icin donem "SPRING_SEMESTER" secer..
  And Ders icin gun "FRIDAY" secer..
  And Dersin baslama saatini "01:00PM" secer..
  And Dersin bitis saatini "02:00PM" secer..
  And Submit tusuna basar..
  Then "Please select lesson" mesajini gorur..


  @US10-TC06
  Scenario: tc06-gece_saati_secildi
    And Ders "Ilhanlilar tarihi" secer..
    And Ders icin donem "SPRING_SEMESTER" secer..
    And Ders icin gun "FRIDAY" secer..
    And Dersin baslama saatini "01:00AM" secer..
    And Dersin bitis saatini "02:00AM" secer..
    And Submit tusuna basar..
    Then "Bu saatte ders mi olur?" mesajini gorur..

  @US10-TC07
  Scenario: tc07-birden_fazla_ders_secildi
    And Ders "Ilhanlilar tarihi" secer..
    And Ders "suc bilimi" secer..
    And Ders icin donem "SPRING_SEMESTER" secer..
    And Ders icin gun "FRIDAY" secer..
    And Dersin baslama saatini "01:00PM" secer..
    And Dersin bitis saatini "02:00PM" secer..
    And Submit tusuna basar..
    Then "Created Lesson Program" mesajini gorur..

  @US10-TC08
  Scenario: tc08-eksiksiz_bilgiler_girildi
    And Ders "suc bilimi" secer..
    And Ders icin donem "FALL_SEMESTER" secer..
    And Ders icin gun "WEDNESDAY" secer..
    And Dersin baslama saatini "10:00AM" secer..
    And Dersin bitis saatini "11:00AM" secer..
    And Submit tusuna basar..
    Then "Created Lesson Program" mesajini gorur..

  @US10-TC09
  Scenario: tc09-zaten_var_olan_ders_girildi
    And Ders "suc bilimi" secer..
    And Ders icin donem "FALL_SEMESTER" secer..
    And Ders icin gun "WEDNESDAY" secer..
    And Dersin baslama saatini "10:00AM" secer..
    And Dersin bitis saatini "11:00AM" secer..
    And Submit tusuna basar..
    Then "Bu ders zaten kayitli" mesajini gorur..

  @US10-TC10
  Scenario: tc10-baslama_bitis_saati_hatasi_alinmamali
    And Ders "suc bilimi" secer..
    And Ders "ilhanlilar tarihi" secer..
    And Ders "Math" secer..
    And Ders icin donem "FALL_SEMESTER" secer..
    And Ders icin gun "MONDAY" secer..
    And Dersin baslama saatini "11:00PM" secer..
    And Dersin bitis saatini "01:00AM" secer..
    And Submit tusuna basar..
    Then "Bu saatte ders mi olur?" mesajini gorur..
#    Error: start time must not be greater than or equal to stop time
#    11:00AM 01:00PM kabul ediyor o zaman bunu da kabul etmemeli



