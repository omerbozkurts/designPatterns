//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student ali = new Student("ali",new FullTimeStudent(),new Graduate());

        ali.setAttendanceNum(151);
        System.out.println(ali.attendanceSituation());

        ali.setAttendanceNum(99);
        System.out.println(ali.attendanceSituation());

        ali.setAttendanceRole(new PartTimeStudent());
        ali.setAttendanceNum(2);

        System.out.println(ali.attendanceSituation());

        ali.setGpa(2.7);
        System.out.println(ali.graduateSituation());

        ali.setEducationLevel(new UnderGraduate());
        System.out.println(ali.graduateSituation());
    }
}