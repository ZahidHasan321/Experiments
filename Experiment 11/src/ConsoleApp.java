import resources.Student;
//8
public class ConsoleApp {
    public static void main(String[] args) {
        Student student = new Student("zahid", 15, true);
        student.takesRecruitmentExam();
        student.publishResult();
    }
}
