@US06
Feature: US06_Name_Bilgisi

  @US06_TC01
  Scenario:US06_Pozitif_Test
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini dogrular

  @US06_TC02
  Scenario: TC02_Name_Karakter_Bilgisi_Sorgulama
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisini karakter olacak sekilde girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC03
  Scenario: TC03_Name_Bos_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici name bilgisini bos birakir
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC04
  Scenario: TC04_Name_Space_Bosluk_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici name bilgisini space tusu ile bosluk birakir
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC06
  Scenario: TC06_Surname_Karakter_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisini karakter olacak sekilde girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC07
  Scenario: TC07_Surname_Bos_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisini bos birakir
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC08
  Scenario: TC08_Surname_Space_Bosluk_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisini space ile bosluk birakir
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC10
  Scenario: TC10_BirtPlace_Bos_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisini bos birakir
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC11
  Scenario: TC11_BirtPlace_Space_Bosluk_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisini space ile bosluk birakir
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC12
  Scenario: TC12_BirtPlace_Karakter_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisini karakter olarak girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC13
  Scenario: TC13_BirtPlace_Rakam_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisini rakam olarak girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC15
  Scenario: TC15_Gender_Male_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Male secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC16
  Scenario: TC16_Gender_Bos_Birakilma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender bolumunde secim yapilmaz
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC18
  Scenario: TC18_DateOfBirth_17Yas_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisini onyedi  yasinda olacak sekilde girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC19
  Scenario: TC19_DateOfBirth_18Yas_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisini onsekiz  yasinda olacak sekilde girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC20
  Scenario: TC20_DateOfBirth_19Yas_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisini ondokuz yasinda olacak sekilde girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC21
  Scenario: TC21_DateOfBirth_119Yas_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisini yuzOnDokuz yasinda olacak sekilde girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC22
  Scenario: TC22_DateOfBirth_120Yas_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisini yuzYirmi yasinda olacak sekilde girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC23
  Scenario: TC23_DateOfBirth_121Yas_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisini yuzYirmiBir yasinda olacak sekilde girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC24
  Scenario: TC24_DateOfBirth_Bos_Birakilma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisini bos birakir
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC26
  Scenario: TC26_TelefonNumarasi_Ilk_Index_Sifir_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" ilk index sifir olacak sekilde girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC27
  Scenario: TC27_TelefonNumarasi_Bos_Birakilma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi bilgisini bos birakir
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC28
  Scenario: TC28_TelefonNumarasi_Space_Bosluk_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasini space ile bosluk birakir
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC29
  Scenario: TC29_TelefonNumarasin_Kullanilan_Numara_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasini daha once kayit olunmus bir numara girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici kullanilan phone number hata mesaji alir

  @US06_TC30
  Scenario: TC30_TelefonNumarasinin_12Karakterden_Fazla_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasini oniki karakterden fazla girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC31
  Scenario: TC31_TelefonNumarasinin_12Karakterden_Az_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasini oniki karakterden az girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC32
  Scenario: TC32_TelefonNumarasinin_12Ardisik_Rakam_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasini oniki ardisik rakam olarak girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC33
  Scenario: TC33_TelefonNumarasinin_RakamVeHarfDisinda__Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasini karakter icerecek sekilde girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC34
  Scenario: TC33_TelefonNumarasinin_Harf_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasini haraf olacak sekilde girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC35
  Scenario: TC35_TelefonNumarasinin_"-"_YerininFarkli_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasinda tirenin yerini farkli olacak sekilde girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC37
  Scenario: TC37_SSN_TelefonNumarasi_Ilk_Index_Sifir_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  ilk index sifir olacak sekilde girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini goremez

  @US06_TC38
  Scenario: TC38_SSN_Bos_Birakilma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini bos birakir
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC39
  Scenario: TC39_SSN_Space_Bosluk_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini space ile bosluk birakir
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC40
  Scenario: TC40_SSN_Kullanilan_Numara_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini daha once kayit olunmus bir numara girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici kullanilan ssn numarasi hata mesaji alir

  @US06_TC41
  Scenario: TC41_SSN_9Karakterden_Fazla_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN" dokuz karakterden fazla girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC42
  Scenario: TC42_SSN_9Karakterden_Az_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini dokuz karakterden az girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC43
  Scenario: TC43_SSN_9Ardisik_Rakam_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini dokuz ardisik rakam olarak girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC44
  Scenario: TC44_SSN_RakamVeHarfDisinda_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini karakter icerecek sekilde girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC45
  Scenario: TC45_SSN_Harf_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini haraf olacak sekilde girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC46
  Scenario: TC46_SSN_"-"_YerininFarkli_Olmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisinde tire isaretini ucunde ve altinci index disinda olacak sekilde girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Full authentication is required to access this resource uyarisini gormelidir



  @US06_TC48
  Scenario: TC48_UserName_Bilgisinin_Bos_Birakilmasi_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" bilgisini bos birakir
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
#    Then kullanici Vice dean Saved onayini goremez

  @US06_TC49
  Scenario: TC49_UserName_Kullanilmis_Isim_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" bilgisini kullanilmis bir isim girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Error: User with username clint.hamilla already register uyarisini gormelidir

  @US06_TC50
  Scenario: TC50_UserName_SpaceTusu_Bosluk_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username bilgisini space tusu ile bosluk birakacak sekilde girer
    Then kullanici yeni kayit icin password "password" bilgisi girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Error: User with username already registeruyarisini gormelidir

  @US06_TC52
  Scenario: TC52_Password_Bos_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password bilgisini bos birakir
    Then kullanici Submit butonuna tiklar

  @US06_TC53
  Scenario: TC53_Password_7Karakter_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password bilgisini sekiz karakterden az girer
    Then kullanici Submit butonuna tiklar


  @US06_TC54
  Scenario: TC54_Password_9Karakter_Olma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password bilgisini sekiz karakterden fazla girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini dogrular

  @US06_TC55
  Scenario: TC55_Password_Space_Bosluk_Birakma_Sorgusu
    Given kullanici url sayfasina gider
    When kullanici Login butonuna tiklar
    Then Login giris sayfasi acildigini dogrular
    Then kullanici User Name butonuna tiklar
    Then kullanici User Name "username" bilgisi girer
    Then kullanici Password butonuna tiklar
    Then kullanici password "password" bilgisi girer
    Then kullanici Giris icin Login butonuna tiklar
    Then kullanici Vice Dean Management sayfasinda olundugu dogrular
    Then kullanici Name "Name" bilgisi girer
    Then kullanici Surname "Surname" bilgisi girer
    Then kullanici Birt Place "Birth Place" bilgisi girer
    Then kullanici Gender Female secenegine tiklar
    Then kullanici dogum tarihi bilgisi girer
    Then kullanici telefon numarasi "Telefon numarasi" bilgisini uniqe girer
    Then kullanici SSN "SSN"  bilgisini uniqe girer
    Then kullanici username "username" uniqe olacak sekilde girer
    Then kullanici yeni kayit icin password bilgisini space ilke bosluk birakacak sekilde girer
    Then kullanici Submit butonuna tiklar
    Then kullanici Vice dean Saved onayini dogrular