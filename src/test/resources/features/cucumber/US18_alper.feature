
@US18
Feature: US18_Teacher_Verdigi_Notlari_Görebilme

  Background: Teacher_Sayfaya_giris_yapabilmeli
    Given Kullanici anasayfaya "https://www.managementonschools.com/" gider..
    When Login butonuna tiklar..
    And Username "MarieLE" girer..
    And Password "Marie.95" girer..
    Then Ikinci login butonuna tiklar..
    And Student Managment sayfasinda oldugunu dogrular.







  @US18_TC01
  Scenario: TC01_Ögrenci_bilgisi_girebilmeli
    When Teacher Choose Lesson butonundan "Kedi Ahlaki" secer
    When Teacher Choose Student butonundan "Silme haram" secer
    When Teacher Choose Education Term butonundan "SPRING_SEMESTER" secer
    When Teacher Absentee butonuna "5" girer
    When Teacher Midterm Exam butonuna "65" girer
    When Teacher Final Exam butonuna "85" girer
    When Teacher Info Note butonuna "92" girer
    When Teacher submit butona tiklar
    Then "Student Info saved Successfully" dogrulama mesajini görür


  @US18_TC02
  Scenario: TC02_Ögrenci_bilgisi_görünürlügü
    When Teacher "Silme haram" Name Surname görür
    And  Teacher "Kedi Ahlaki" Lesson name görür
    And Teacher "5" Absentee görür
    And Teacher "65" Midterm Exam görür
    And Teacher "85" Final Exam görür
    And Teacher "BA" Note görür
    And Teacher "92" Info Note görür
    And Teacher "77" Average görür










