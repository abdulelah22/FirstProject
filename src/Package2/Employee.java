package Package2;

public class Employee {
    double salary;
    double bouns;

    void calculateTotalPay(){
        double totalPay = salary + bouns;

        System.out.println("Total pay = "+ totalPay);
    }
}
