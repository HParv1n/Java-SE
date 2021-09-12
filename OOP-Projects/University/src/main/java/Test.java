import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Department department = new Department();
        department.setName("Software Engineering");


        Student student = new Student();
        student.setName("Parvin Hajiaghayev");
        student.setBrithday("27.02.1999");
        student.setNo("1");

        ClassRoom classRoom = new ClassRoom();
        classRoom.setClassName("115-A");


        Professor professor = new Professor();
        professor.setName("Akin Kaldiroglu");
        professor.setBrithday("24.08.1960");
        professor.setNo("1");
        professor.setDepartment(department);

        Course course = new Course();
        course.setName("Introduction to Software Engineering");
        course.setCode("15-ISE");
        course.setTeacher(professor);
        course.setDepartment(department);
        course.setClassRoom(classRoom);
        course.setStudents(student);

        department.setHead(professor);
        department.setStudents(student);
        department.setCourses(course);

        professor.setAdvisee(student);
        professor.setCoursesGiven(course);

        student.setDepartment(department);
        student.setAdvisor(professor);
        student.setCoursesTaken(course);

        System.out.println(student.getNo()+" "+student.getName()+" "+student.getBrithday()+" "+student.getDepartment().getName()+" "+student.getCoursesTaken().getName()+" "+student.getAdvisor().getName());












    }
}
