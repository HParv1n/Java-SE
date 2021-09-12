package homework;

public class MasterStudent extends GraduetStudent {

    public MasterStudent(String name, String surname, int age, String diplomName, int average) {
        super(name, surname, age, diplomName, average);
    }

    @Override
    public void study() {
        System.out.println("I am studying Master degree");
    }

    @Override
    public void writeThesis() {
        System.out.println("I am writing Master thesis");
    }

    @Override
    public String toString() {
        return "homework.MasterStudent{" +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", diplomName='" + diplomName + '\'' +
                ", average=" + average +
                '}';
    }
}
