
@US20_Api
Feature: Ogretmen toplantilari Api ile Test eder


  Scenario: Ogretmen toplantıları bilgilerini gorebilmeli
    Given Ogretmen toplanti bilgilerini Get request ile alir
    Then  Ogretmen Toplantı bilgilerini gunceller
    Then  Ogretmen Toplantı bilgilerini siler
