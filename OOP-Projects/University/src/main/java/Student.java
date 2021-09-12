public class Student {
    private String no;
    private String name;
    private String brithday;
    private Department department;
    private Professor advisor;
    private Course coursesTaken;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Professor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Professor advisor) {
        this.advisor = advisor;
    }

    public Course getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course coursesTaken) {
        this.coursesTaken = coursesTaken;
    }
}
