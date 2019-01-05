package Package1;

public class ExampleString {
    public static void main(String[] args){
        String x = "James Dean";

        System.out.println("hello " + x);
        System.out.println(x.toUpperCase());

        String age = "24";
        String salary = "10000.89";

        int a = Integer.parseInt(age)/2;
        double b = Double.parseDouble(salary)*.15;

        System.out.println("Age is "+ a);
        System.out.println("Salary is "+ b);

    }
}
