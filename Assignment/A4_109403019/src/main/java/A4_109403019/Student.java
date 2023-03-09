package A4_109403019;

public class Student {
    private String name;
    public int id;
    private String dept;    // Department


    public Student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public String getName() {
        return this.name;
    }
}
