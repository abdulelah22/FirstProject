package SmapleProject;

public class Employee {

    private String empName;
    private int grade;

    public Employee(String empName , int grade){
        this.empName = empName;
        this.grade = grade;
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getEmpInfo (){
        return empName + "(" + grade + ")";
    }
}
