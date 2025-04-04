import java.util.Arrays;

public class Multiset {
    private final double[] values;

    public Multiset(double... values) {
        this.values = values;
    }

    public boolean equals(Multiset x) {
        if (x == null || this.values.length != x.values.length) {
            return false;
        }
        double[] sortedValues1 = Arrays.copyOf(this.values, this.values.length);
        double[] sortedValues2 = Arrays.copyOf(x.values, x.values.length);
        Arrays.sort(sortedValues1);
        Arrays.sort(sortedValues2);
        return Arrays.equals(sortedValues1, sortedValues2);
    }

    public String toString() {
        StringBuilder result = new StringBuilder("X {");
        boolean[] counted = new boolean[values.length];

        for (int i = 0; i < values.length; i++) {
            if (!counted[i]) {
                double value = values[i];
                int count = 1;
                for (int j = i + 1; j < values.length; j++) {
                    if (values[j] == value) {
                        count++;
                        counted[j] = true;
                    }
                }
                result.append(value).append(" --> (").append(count).append("), ");
            }
        }

        if (result.length() > 3) {
            result.setLength(result.length() - 2);
        }
        result.append('}');
        return result.toString();
    }

    public void makeSame(Multiset x) {
        if (!this.equals(x)) {
            double[] combinedValues = new double[this.values.length + x.values.length];
            System.out.println("Combined values: " + Arrays.toString(combinedValues));
            System.arraycopy(this.values, 0, combinedValues, 0, this.values.length);
            System.out.println("Combined values: " + Arrays.toString(combinedValues));
            System.arraycopy(x.values, 0, combinedValues, this.values.length, x.values.length);
            System.out.println("Combined values: " + Arrays.toString(combinedValues));
            Arrays.sort(combinedValues);
            System.out.println("Combined values: " + Arrays.toString(combinedValues));
            int mid = combinedValues.length / 2;
            System.out.println("Combined values: " + Arrays.toString(combinedValues));
            System.arraycopy(combinedValues, 0, this.values, 0, mid);
            System.out.println("Combined values: " + Arrays.toString(combinedValues));
            System.arraycopy(combinedValues, mid, x.values, 0, combinedValues.length - mid);
            System.out.println("Combined values: " + Arrays.toString(combinedValues));
        }
    }
}