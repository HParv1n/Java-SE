package odev;

public class Main {
    public static void main(String[] args) {

        Cours cours = new Cours();
        cours.setId(1);
        cours.setCoursName("Yazilim gelistrici yetistirme kampi(C#+Angular)");
        cours.setCoursDetails("2 ay surecek yazilim gelistirici yetisdtirme kampimizin takip,dokuman duyurularini buradan yapazagiz");
        cours.setTeacher("Engin Demirog");
        cours.setCoursPrice("UCRETSIZ");

        Cours cours1 = new Cours();
        cours1.setId(2);
        cours1.setCoursName("Yazilim Gelistirici Yetistirme Kampi(JAVA+REACT");
        cours1.setTeacher("Engin Demirog");
        cours1.setCoursDetails("2 ay surecek yazilim gelistirici yetisdtirme kampimizin takip,dokuman duyurularini buradan yapazagiz");
        cours1.setCoursPrice("UCRETSIZ");


        Cours cours2 = new Cours();
        cours2.setId(3);
        cours2.setCoursName("Programlamaya Giris icin Temel Kurs");
        cours2.setTeacher("Engin Demirog");
        cours2.setCoursDetails("PYTHON,JAVA,C# gibi tum programlama dilleri icin temel programlama mantigini anlasilir orenklerle ogrenin");
        cours2.setCoursPrice("UCRETSIZ");


        Cours[] coursList ={cours,cours1,cours2};

       for (int i = 0; i < coursList.length;i++){
           System.out.println(coursList[i].getCoursName());
           System.out.println(coursList[i].getCoursDetails());
           System.out.println(coursList[i].getCoursPrice());
           System.out.println(coursList[i].getTeacher());
           System.out.println("*************************************************");
       }
    }
}
