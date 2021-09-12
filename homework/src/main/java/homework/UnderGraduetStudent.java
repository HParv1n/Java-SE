package homework;

public class UnderGraduetStudent extends Student{

    String state;
    int course;

    public UnderGraduetStudent(String name, String surname, int age, String state,int course) {
        super(name, surname, age);
        this.state = state;
        this.course = course;
    }


    @Override
    public void study() {
        System.out.println("I am studying"+course);
    }

//    @Override
//    public void register() {
//        System.out.println("I am ");
//    }
}
