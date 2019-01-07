package Encapsulation;
// encapsulation: used for putting a constraints on the input of the variable.
public class TestEmployee {
    public static void main (String[] args){
        Employee alex = new Employee();
        //alex.salary = 100;
        alex.setSalary(100000);
        alex.setBonus(2000);
        alex.calculateTotalPay();

        System.out.println(alex.getSalary());
    }
}
