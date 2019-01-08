package Inhertinace;

public class TestBox {
    public static void main(String[] args){
        Box FedEx = new Box();
        FedEx.calculateArea(3,4);

        NewBox ups = new NewBox();
        ups.calculateArea(4,2);
        ups.calculateVolume(3,4,5);
    }
}
