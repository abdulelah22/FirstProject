package Interfacex;

public class TestOffice {
    public static void main(String[] args){
        Office obj = new Word();
        obj.neww();
        obj.open();
        obj.save();

        obj = new Exel();
        obj.neww();
        obj.open();
        obj.save();


    }
}
