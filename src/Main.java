import model.Academy;
import service.AcademyService;
import service.StudentService;
import service.TeacherService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService=new StudentService();
        TeacherService teacherService=new TeacherService();
        AcademyService academyService=new AcademyService();
    }
}