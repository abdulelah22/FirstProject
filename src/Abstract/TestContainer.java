package Abstract;

public class TestContainer {
    public static void main (String [] args){

        Container c1 = new CircleContainer();
        c1.calculateVolume(10,5);

        c1 = new SquareContainer();
        c1.calculateVolume(10,5);

    }
}
