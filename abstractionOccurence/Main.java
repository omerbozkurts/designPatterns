public class Main {
    public static void main (String args[]){
        Lesson mathLesson = new Lesson("math","ali yilmaz","MATH214");
        ClassSession session1 = new ClassSession("2024-03-01","14:30",mathLesson);
        ClassSession session2 = new ClassSession("2024-04-01","14:30",mathLesson);
        System.out.println(session2.getDate()+mathLesson.getName());
        System.out.println(session1.getDate()+mathLesson.getName());
    }
}
