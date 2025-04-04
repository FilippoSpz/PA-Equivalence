import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first pair of real numbers separated by a comma:");
        String input1 = scanner.nextLine();
        System.out.println("Enter the second pair of real numbers separated by a comma:");
        String input2 = scanner.nextLine();

        double[] values1 = parseInput(input1);
        double[] values2 = parseInput(input2);

        Multiset x1 = new Multiset(values1);
        Multiset x2 = new Multiset(values2);

        if (x1.equals(x2)) {
            System.out.println("x1 and x2 are equivalent.");
        } else {
            System.out.println("x1 and x2 are not equivalent.");
        }

        x1.makeSame(x2);

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }

    private static double[] parseInput(String input) {
        String[] parts = input.split(",");
        double[] values = new double[parts.length];

        for (int i = 0; i < parts.length; i++) {
            values[i] = Double.parseDouble(parts[i].trim());
        }

        return values;
    }

}