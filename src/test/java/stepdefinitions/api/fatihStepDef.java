package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.MeetPojo;
import pojos.MeetPutPojo;
import pojos.MeetStudentPojo;
import pojos.StudentPojo;

import java.util.ArrayList;
import java.util.List;

import static base_urls.ManagementOnSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class fatihStepDef {
    MeetPojo meetPojo;
    StudentPojo studentPojo = new StudentPojo(592, "FatihK", "111-22-3334", "Fatih", "Kupelii", "2000-06-01", "Ankara", "444-333-2222", "MALE", "Senem", "Sinan", 1588, "tartar1@gmail.com", true);


    ArrayList<StudentPojo> ogrenci = new ArrayList<>();

    ArrayList<Integer> studentid=new ArrayList<>();


    @Given("Ogretmen toplanti bilgilerini Get request ile alir")
    public void ogretmenToplantiBilgileriniGetRequestIleAlir() {
        //http://164.92.252.42:8080/meet/getMeetById/305
        spec.pathParams("first", "meet", "second", "getMeetById", "third", 305);
        Response response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();

        ogrenci.add(studentPojo);
        MeetStudentPojo meetStudentPojo = new MeetStudentPojo(305, "toplantı", "2023-06-01", "10:15:00", "10:45:00", 729, "Fatih", "333-25-9875", ogrenci);


        meetPojo = new MeetPojo(meetStudentPojo, "Meet successfully found", "CREATED");

        JsonPath actualData = response.jsonPath();

        assertEquals(meetStudentPojo.getDate(), actualData.getString("object.date"));
        assertEquals(meetStudentPojo.getStartTime(), actualData.getString("object.startTime"));
        assertEquals(meetStudentPojo.getStopTime(), actualData.getString("object.stopTime"));
        assertEquals(meetStudentPojo.getDescription(), actualData.getString("object.description"));

    }

    @Then("Ogretmen Toplantı bilgilerini gunceller")
    public void ogretmenToplantıBilgileriniGunceller() {
        //http://164.92.252.42:8080/meet/update/305
        spec.pathParams("first", "meet", "second", "update", "third", 305);
        Response response = given(spec).put("{first}/{second}/{third}");
        studentid.add(574,592);

        MeetPutPojo meetPutPojo=new MeetPutPojo("2023-06-02","MeetUpdate","10:30", )







//        {
//            "date": "2023-06-02",
//                "description": "MeetUpdate",
//                "startTime": "10:30",
//                "stopTime": "10:50",
//                "studentIds": [
//            574,592
//  ]
//        }

    }

    @Then("Ogretmen Toplantı bilgilerini siler")
    public void ogretmenToplantıBilgileriniSiler() {
    }
}
