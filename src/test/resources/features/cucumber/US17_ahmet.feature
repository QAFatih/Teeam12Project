@US17
Feature: US17_Teacher, ogrencilere not verebilmelidir

  Scenario: Teacher, ogrencilere not verebilmelidir....
    Given Teacher "page_url" gider....
    When Teacherin page'de oldugu dogrulanir.
    When Teacher login tiklar....
    When Teacher Teacher_user_name girer....
    When Teacher "Teacher_password" yazar.....
    When Teacher'in girisi yaptigi dogrulanir....
    When Teacher mavi logini tiklar....
    When Teacher Choose Lesson butonunu acar "Math" secer....
    When Teacher Choose Student butonunu acar ilk ogrenciyi secer....
    When Teacher Choose Education Term butonu acar ilk donemi secer....
    When Teacher Absentee kutusunu tiklar "2" girer.....
    When Teacher Midterm Exam kutusunu tiklar "12" girer....
    When Teacher Final Exam kutusunu tiklar "22" girer....
    When Teacher Info Note kutusunu tiklar "yanlis yaptigin bir seyler var" yazar....
    When Teacher Submit butonuna tiklar....




