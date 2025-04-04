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

        if (Equivalence.run(values1, values2)) {
            System.out.println("x1 and x2 are equivalent.");
        } else {
            System.out.println("x1 and x2 are not equivalent.");
        }
    }

    private static double[] parseInput(String input) {
        String[] parts = input.split(",");
        if (parts.length != 2) {
            throw new IllegalArgumentException("The input must contain exactly two numbers separated by a comma.");
        }
        double[] values = new double[2];
        values[0] = Double.parseDouble(parts[0].trim());
        values[1] = Double.parseDouble(parts[1].trim());
        return values;
    }

}