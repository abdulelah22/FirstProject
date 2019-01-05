package Package1;

public class AndOr {
    public static void main(String[] args){
        int x,y ;
        x = 10;
        y = -10;
        if(x > 0 && y > 0){
            System.out.print("both numbers are positive");
        }
        else if(x > 0 || y > 0){
            System.out.print("At least one number is positive");
        }
        else{
            System.out.print("No positive numbers");
        }
    }
}
