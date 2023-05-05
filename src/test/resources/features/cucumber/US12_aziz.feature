    @US12
    Feature: US12

      Background: US_12_Tekrar_Stepler
        Given Kullanici "anasayfaya"  gider*
        When Kullanici login butonuna tiklar*
        When Kullanici User Name alanina username girer*
        When Kullanici Password alanina password girer*
        When Kullanici login sekmesine tiklar*
        When Kullanici lesson sayfasini gorur*
        When Kullanici Menu tiklar*
        When Kullanici Main Menuden Lesson Management tiklar*

      @TC_01
      Scenario: TC_01
        When Kullanici Lesson Program butonuna tiklar*
        When Kullanici Choose Lessons tan bir ders secer*
        When Kullanici Choose Education Term donem secer*
        When Kullanici Choose Day bir gun secer*
        When Kullanici Start Time bir saat girer*
        When Kullanici Stop Time bir saat girer*
        When Kullanici Submit butonuna tiklar*
        And  Kullanici Created Lesson Program mesajini gorur*
        And  Kullanici Lesson Program List tablosunda olusturdugu Ders programini gorur*
        And Kullanici sayfayi kapatir*

      @TC_02
      Scenario: TC_02
        When Kullanici Lesson Program butonuna tiklar*
        When Kullanici Choose Lessons alanini bos birakir*
        When Kullanici Choose Education Term donem secer*
        When Kullanici Choose Day bir gun secer*
        When Kullanici Start Time bir saat girer*
        When Kullanici Stop Time bir saat girer*
        When Kullanici Submit butonuna tiklar*
        And  Kullanici Created Ekranda uyari mesajini gorur*
        And Kullanici sayfayi kapatir*

      @TC_03
      Scenario: TC_03
        When Kullanici Lessons butonuna tiklar*
        When Kullanici Lesson Name alanina isim girer*
        When Kullanici Credit Score alanina kredi notu girer*
        When Kullanici Lesson Submit butonuna tiklar*
        When Kullanici Lesson Created mesajini gorur*
        When Kullanici Lesson List tablosunda Olusturdugu dersi gorur*
        And Kullanici sayfayi kapatir*

      @TC_04
      Scenario: TC_04
        When Kullanici Lessons butonuna tiklar*
        When Kullanici Lesson Name alanina isim girer*
        When Kullanici Credit Score alanina String bir veri girer*
        When Kullanici Lesson Submit butonuna tiklar*
        And Kullanici Hata mesajini gorur*
        And Kullanici sayfayi kapatir*

      @TC_05
      Scenario: TC_05
        When Kullanici Lesson Program butonuna tiklar*
        When Kullanici Choose Lessons tan bir ders secer*
        When Kullanici Choose Education Term donem secer*
        When Kullanici Choose Day bir gun secer*
        When Kullanici Start Time bir saat girer*
        When Kullanici Stop Time bir saat girer*
        When Kullanici Submit butonuna tiklar*
        When  Kullanici Created Lesson Program mesajini gorur*
        When Kullanici Lesson Program Assignment tablosundaki Olusturdugu Ders Programinin bulundugu Checkbox tiklar*
        When Kullanici Choose Teacher Drapdowndan Sisteme Kayitli Teacheri secer*
        When Kullanici Lesson Submit Second butonuna tiklar*
        And Kullanici Lesson added to Teacher mesajini gorur*

