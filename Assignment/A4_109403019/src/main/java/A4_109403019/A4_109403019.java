//Assignment 4
//Name: 鄒翔宇
//ID: 109403019
//Course: 2023-CE1002

package A4_109403019;

import java.util.Scanner;

public class A4_109403019 {
    public static void main(String[] args) {

        Department CSIE = new Department("CSIE");
        Department EE = new Department("EE");
        Department MATH = new Department("MATH");

        Institute EECS = new Institute("EECS");
        Institute SCI = new Institute("SCI");

        EECS.addDepartmentToInstitute(CSIE);
        EECS.addDepartmentToInstitute(EE);
        SCI.addDepartmentToInstitute(MATH);

        int operation = 0;
        boolean exit = false;

        Scanner sc = new Scanner(System.in);

        while (!exit) {
            System.out.println("1.add student 2.show the number of students in a department 3.show all the students in a department 4.show the number of students in an institute 5.exit:");
            operation = sc.nextInt();

            switch (operation) {
                case 1:     // add new student and put it to matching department.
                    System.out.println("Please input the student info name/id/department:");

                    /*
                        Create a new Student
                     */
                    String studentName = sc.next();
                    int studentId = sc.nextInt();
                    String studentDept = sc.next();
                    Student newStudent = new Student(studentName, studentId, studentDept);

                    /*
                        Add the new student to matching Department
                     */
                    if (studentDept.equals(CSIE.getName()))
                        CSIE.addStudent(newStudent);
                    else if (studentDept.equals(EE.getName()))
                        EE.addStudent(newStudent);
                    else if (studentDept.equals(MATH.getName()))
                        MATH.addStudent(newStudent);

                    break;

                case 2:     // look up the number of total students in specific department.
                    System.out.println("Please input the department:");
                    String requestDept = sc.next();

                    if (requestDept.equals(CSIE.getName()))
                        System.out.println(CSIE.getTotalStudentsInDep());
                    else if (requestDept.equals(EE.getName()))
                        System.out.println(EE.getTotalStudentsInDep());
                    else if (requestDept.equals(MATH.getName()))
                        System.out.println(MATH.getTotalStudentsInDep());

                    break;

                case 3:     // print out total students in specific department.
                    System.out.println("Please input the department:");
                    String inputDept = sc.next();

                    if (inputDept.equals(CSIE.getName()))
                        CSIE.showDepStudents();
                    else if (inputDept.equals(EE.getName()))
                        EE.showDepStudents();
                    else if (inputDept.equals(MATH.getName()))
                        MATH.showDepStudents();

                    break;

                case 4:
                    System.out.println("Please input the institute:");
                    String inputInst = sc.next();

                    if (inputInst.equals(EECS.getName()))
                        System.out.println(EECS.getTotalStudentsInInstitute());
                    else if (inputInst.equals(SCI.getName()))
                        System.out.println(SCI.getTotalStudentsInInstitute());

                    break;  // look up the number of total students in specific institute.

                case 5:     // exit
                    exit = true;
                    break;
            }
        }


        sc.close();
    }
}
