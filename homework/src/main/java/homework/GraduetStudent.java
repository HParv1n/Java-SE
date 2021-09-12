package homework;

public class GraduetStudent extends Student{
    String diplomName;
    int average;

    public GraduetStudent(String name, String surname, int age,String diplomName,int average) {
        super(name, surname, age);
        this.average = average;
        this.diplomName = diplomName;
    }


    @Override
    public void study() {
        System.out.println("I graduated with a bachelor’s degree");
    }

    public void writeThesis(){
        System.out.println("I am writing Bachelor`s thesis");
    }

    @Override
    public String toString() {
        return "homework.GraduetStudent{" +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                "diplomName='" + diplomName + '\'' +
                ", average=" + average +
                '}';
    }
}
