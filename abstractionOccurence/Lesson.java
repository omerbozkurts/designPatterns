public class Lesson {
    private String name;
    private String teacher;

    private String lectureCode;

    public Lesson(String name, String teacher, String lectureCode){

        this.name = name;
        this.teacher = teacher;
        this.lectureCode = lectureCode;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getLectureCode() {
        return lectureCode;
    }

    public void setLectureCode(String lectureCode) {
        this.lectureCode = lectureCode;
    }
}
