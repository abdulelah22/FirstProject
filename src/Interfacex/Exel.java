package Interfacex;

public class Exel implements Office {
    @Override
    public void neww() {
        System.out.println("Word new .doc");
    }

    @Override
    public void open() {
        System.out.println("Word open .doc");
    }

    @Override
    public void save() {
        System.out.println("Word save .doc");
    }
}
