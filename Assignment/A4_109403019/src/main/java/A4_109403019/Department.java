package A4_109403019;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Student> students;
    private String name;

    public Department(String name) {
        this.students = new ArrayList<Student>();
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalStudentsInDep() {
        return students.size();
    }

    public void showDepStudents() {
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}
