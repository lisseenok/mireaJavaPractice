package practice7.adapter;

public class Main {
    public static void main(String[] args) {
        // Круглое к круглому — всё работает.
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("кружок с радиусом 5 влез в отверстие с радиусом 5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("квадрат со стороной 2 влез в отверстие с радиусом 5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("квадрат со стороной 20 не влез в отверстие с радиусом 5.");
        }
    }
}
