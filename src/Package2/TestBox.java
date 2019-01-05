package Package2;

public class TestBox {
    public static void main(String[] args){
        Box UPS = new Box();
        Box FedEx = new Box();

        UPS.length = 5;
        UPS.width = 10;
        double area1 = UPS.calculateArea(4, 3);

        FedEx.length = 6;
        FedEx.width = 7;
        double area2 = UPS.calculateArea(2, 5);

        System.out.println("The Total OF FedEx & UPS is = " +(area1 + area2));
    }
}
