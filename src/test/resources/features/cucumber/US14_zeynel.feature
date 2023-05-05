@US14
Feature: US14
  @us14tc01
  Scenario: teacher_listin_goruntulenmesi
    Given Kullanici anasayfaya gider...
    When Kullanici login butonuna tiklar...
    When Kullanici Username alanina username girer...
    When Kullanici password alanini password girer...
    When Kullanici iclogine tiklar...
    When kullanici lesson sayfasini gorur...
    When Kullanici menu butonuna tiklar...
    When Kullanici Teacher Management butonuna tiklar...
    When Kullanici teacher sayfasini girer...
    When Kullanici teacher list tablosunda name surname,phone number,ssn,username verilerini gorur...
    And Kullanici sayfayi kapatir...

    @us14tc02
    Scenario: pozitif_test_teacher_listin_update_edilmesi
      Given Kullanici anasayfaya gider...
      When Kullanici login butonuna tiklar...
      When Kullanici Username alanina username girer...
      When Kullanici password alanini password girer...
      When Kullanici iclogine tiklar...
      When kullanici lesson sayfasini gorur...
      When Kullanici menu butonuna tiklar...
      When Kullanici Teacher Management butonuna tiklar...
      When Kullanici teacher sayfasini girer...
      When Kullanici kayitli teacher gitmek icin sayfalari tiklar...
      When Kullanici Teacher List deki edit butonuna tiklar...
      When Kullanici choose lesson dan bir ders secer...
      When Kullanici email adresini gunceller...
      When Kullanici gender check boxindaki male tiklar...
      When Kulanici password alanina passwordunu girer...
      When Kullanici submit butonuna tiklar...
      And Kullanici Teacher update Succesfull mesajini gorur...
      And Kullanici sayfayi kapatir...


      @us14tc03
      Scenario: negatif_test_choose_lesson_bos_birakilmasi
        Given Kullanici anasayfaya gider...
        When Kullanici login butonuna tiklar...
        When Kullanici Username alanina username girer...
        When Kullanici password alanini password girer...
        When Kullanici iclogine tiklar...
        When kullanici lesson sayfasini gorur...
        When Kullanici menu butonuna tiklar...
        When Kullanici Teacher Management butonuna tiklar...
        When Kullanici teacher sayfasini girer...
        When Kullanici kayitli teacher gitmek icin sayfalari tiklar...
        When Kullanici Teacher List deki edit butonuna tiklar...
        When Kullanici choose lesson alanini bos birakir...
        When Kullanici email adresini gunceller...
        When Kullanici gender check boxindaki male tiklar...
        When Kulanici password alanina passwordunu girer...
        When Kullanici submit butonuna tiklar...
        And Kullanici guncelleme yapilamadigi ile ilgili bir mesaj gorur...
        And Kullanici sayfayi kapatir...



        @us14tc04
        Scenario: negatif_test_gender_bos_birakilmasi
          Given Kullanici anasayfaya gider...
          When Kullanici login butonuna tiklar...
          When Kullanici Username alanina username girer...
          When Kullanici password alanini password girer...
          When Kullanici iclogine tiklar...
          When kullanici lesson sayfasini gorur...
          When Kullanici menu butonuna tiklar...
          When Kullanici Teacher Management butonuna tiklar...
          When Kullanici teacher sayfasini girer...
          When Kullanici kayitli teacher gitmek icin sayfalari tiklar...
          When Kullanici Teacher List deki edit butonuna tiklar...
          When Kullanici choose lesson dan bir ders secer...
          When Kullanici email adresini gunceller...
          When Kullanici gender checkboxindaki male alanini bos birakir...
          When Kulanici password alanina passwordunu girer...
          When Kullanici submit butonuna tiklar...
          And Kullanici guncelleme yapilamadigi ile ilgili bir mesaj gorur...
          And Kullanici sayfayi kapatir...


          @us14tc05
          Scenario: negatif_test_invalid_mail_girilmesi
            Given Kullanici anasayfaya gider...
            When Kullanici login butonuna tiklar...
            When Kullanici Username alanina username girer...
            When Kullanici password alanini password girer...
            When Kullanici iclogine tiklar...
            When kullanici lesson sayfasini gorur...
            When Kullanici menu butonuna tiklar...
            When Kullanici Teacher Management butonuna tiklar...
            When Kullanici teacher sayfasini girer...
            When Kullanici kayitli teacher gitmek icin sayfalari tiklar...
            When Kullanici Teacher List deki edit butonuna tiklar...
            When Kullanici choose lesson dan bir ders secer...
            When Kullanici invalid bir email girer...
            When Kullanici gender check boxindaki male tiklar...
            When Kulanici password alanina passwordunu girer...
            When Kullanici submit butonuna tiklar...
            And Kullanici guncelleme yapilamadigi ile ilgili bir mesaj gorur...
            And Kullanici sayfayi kapatir...


