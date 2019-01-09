package Interfacex;

public class Word implements Office {
    @Override
    public void neww() {
        System.out.println("Excel new .xls");
    }

    @Override
    public void open() {
        System.out.println("Excel open .xls");
    }

    @Override
    public void save() {
        System.out.println("Excel save .xls");
    }
}
