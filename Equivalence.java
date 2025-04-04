public class Equivalence {
    private Equivalence() {
    }

    public static boolean run(double[] values1, double[] values2) {

        Multiset x1 = new Multiset(values1[0], values1[1]);
        Multiset x2 = new Multiset(values2[0], values2[1]);

        return x1.equals(x2);
    }

}