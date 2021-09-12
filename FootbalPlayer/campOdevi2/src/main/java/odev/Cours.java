package odev;

public class Cours {
    private int id;
    private String coursName;
    private String teacher;
    private String coursDetails;
    private String coursPrice;

    public Cours(int id, String coursName, String teacher, String coursDetails, String coursPrice) {
        this.id = id;
        this.coursName = coursName;
        this.teacher = teacher;
        this.coursDetails = coursDetails;
        this.coursPrice = coursPrice;
    }

    public Cours() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursName() {
        return coursName;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCoursDetails() {
        return coursDetails;
    }

    public void setCoursDetails(String coursDetails) {
        this.coursDetails = coursDetails;
    }

    public String getCoursPrice() {
        return coursPrice;
    }

    public void setCoursPrice(String coursPrice) {
        this.coursPrice = coursPrice;
    }
}
