package Exercies;

public class ExerciesA {
    public static void main(String[] args){
        double salary = 78678.65;
        double tax = 0.0;

        if(salary <= 15000){
            tax = salary * .10;
        }
        else if(salary <= 40000){
            tax = salary * .20;
        }
        else{
            tax = salary * .30;
        }
        System.out.println("The tax rate is "+ tax);

        String[] nums = {"10","20","30","40"};
        int sum = 0;
            for(String temp : nums){

                sum += Integer.parseInt(temp);
            }
            System.out.println("The total is " + sum);

            String a = "Hello World";
                System.out.println(a.substring(6).toLowerCase());
    }
}
