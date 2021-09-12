package homework;

public abstract class Student {
    String name;
    String surname;
    int age;


    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void study(){}


    @Override
    public String toString() {
        return "homework.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
