package homework;

public class TestMain {
    public static void main(String[] args) {

        MasterStudent student = new MasterStudent("Parvin","Haji",22,"masterDiplom",85);
         System.out.println(student);
         student.study();
         student.writeThesis();

    }
}
