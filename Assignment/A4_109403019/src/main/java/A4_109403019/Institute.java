package A4_109403019;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    private List<Department> departments;
    private String name;

    public Institute(String name) {
        this.departments = new ArrayList<Department>();
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void addDepartmentToInstitute(Department dept){
        departments.add(dept);
    }

    public int getTotalStudentsInInstitute() {
        int totalStudents = 0;

        for (Department dept : departments) {
            totalStudents += dept.getTotalStudentsInDep();
        }

        return totalStudents;
    }
}
