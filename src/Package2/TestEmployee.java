package Package2;

public class TestEmployee {
    public static void main (String [] args){
        Employee Alex = new Employee();
        Employee Linda = new Employee();
        Employee John = new Employee();

        Alex.salary = 9000;
        Alex.bouns = 2000;
        Alex.calculateTotalPay();

        Linda.salary = 30000;
        Linda.bouns = 500;
        Linda.calculateTotalPay();

        John.salary = 15000;
        John.bouns = 4000;
        John.calculateTotalPay();


    }
}
