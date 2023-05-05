package pojos;

public class MeetPojo {
    private Object MeetStudentPojo;
    private String message;
    private String httpStatus;

    public MeetPojo() {
    }

    public MeetPojo(Object meetStudentPojo, String message, String httpStatus) {
        MeetStudentPojo = meetStudentPojo;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public Object getMeetPojo() {
        return MeetStudentPojo;
    }

    public void setMeetPojo(Object meetStudentPojo) {
        MeetStudentPojo = meetStudentPojo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "MeetPojo{" +
                "MeetStudentPojo=" + MeetStudentPojo +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
