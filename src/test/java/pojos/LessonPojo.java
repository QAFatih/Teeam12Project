package pojos;

public class LessonPojo {

    private boolean compulsory;
    private int creditScore;
    private int lessonId;
    private String lessonName;

    public LessonPojo() {
    }

    public LessonPojo(boolean compulsory, int creditScore, int lessonId, String lessonName) {
        this.compulsory = compulsory;
        this.creditScore = creditScore;
        this.lessonId = lessonId;
        this.lessonName = lessonName;
    }

    public boolean isCompulsory() {
        return compulsory;
    }

    public void setCompulsory(boolean compulsory) {
        this.compulsory = compulsory;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "LessonPojo{" +
                "compulsory=" + compulsory +
                ", creditScore=" + creditScore +
                ", lessonId=" + lessonId +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }
}
