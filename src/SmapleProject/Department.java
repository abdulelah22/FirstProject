package SmapleProject;

public class Department {
    private String deptName;
    private double budget;

    private Employee[] emps = new Employee[5];
    private int counter = 0;

    public Department(String deptName){
        this.deptName = deptName;
        this.budget = 50000;
    }

    public void addEmployee(Employee obj){
        emps[counter] = obj;
        if(obj.getGrade()>= 5){
            this.budget += 150000;

        }else if(obj.getGrade() < 5){
            this.budget+= 100000;
        }
        counter++;
    }

    public void describe(){
        String temp = "Dept name: " + this.deptName + "\nBudget: " + this.budget + "\n Employee Name: ";
        for (Employee x : emps) {
            if (x != null) {
                temp += x.getEmpInfo();
            }
            System.out.println(temp);

        }
    }
}