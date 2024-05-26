public class ClassSession {

    private String date;
    private String time;
    private Lesson lesson;

    public ClassSession(String date, String time, Lesson lesson){
        this.date = date;
        this.time = time;
        this.lesson = lesson;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
}
