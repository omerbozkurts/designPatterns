public class Student {
    private String name;
    int attendanceNum;
    private Attendance attendanceRole;
    private double gpa;
    private EducationLevel educationLevel;

    public Student(String name, Attendance attendanceRole, EducationLevel educationLevel){
        this.name= name;
        this.attendanceRole = attendanceRole;
        this.educationLevel = educationLevel;
    }

    public void setName( String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAttendanceRole(Attendance attendanceRole){
        this.attendanceRole = attendanceRole;
    }

    public Attendance getAttendanceRole(){
        return this.attendanceRole;
    }

    public void setAttendanceNum(int num){
        this.attendanceNum = num;
    }
    public int getAttendanceNum(){
        return this.attendanceNum;
    }
    public double getGpa(){
        return this.gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public EducationLevel educationLevel(){
        return this.educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel){
        this.educationLevel = educationLevel;
    }

    public String attendanceSituation(){
        if (!attendanceRole.isAttendance(this.getAttendanceNum()))
                return "kaldi";
        return "kalmadi";
    }

    public String graduateSituation(){
        if(educationLevel.graduation(this.getGpa()))
            return "mezun olabilir";
        return "mezun olamaz";
    }

}
