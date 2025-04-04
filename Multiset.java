import java.util.Arrays;

public class Multiset {
    private final double[] values;

    public Multiset(double... values) {
        this.values = values;
    }

    public boolean equals(Multiset x) {
        if (x == null) {
            return false;
        } else {
            if (this.values.length != x.values.length) {
                return false;
            } else {
                double[] sortedValues1 = Arrays.copyOf(this.values, this.values.length);
                double[] sortedValues2 = Arrays.copyOf(x.values, x.values.length);
                Arrays.sort(sortedValues1);
                Arrays.sort(sortedValues2);
                return Arrays.equals(sortedValues1, sortedValues2);
            }
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder("X {");
        for (int i = 0; i < values.length; i++) {
            result.append(values[i]);
            if (i < values.length - 1) result.append(", ");
        }
        result.append('}');
        return result.toString();
    }
}