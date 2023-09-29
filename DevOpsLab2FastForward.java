import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid number of values.");
            return;
        }

        double sum = 0;

        System.out.println("Enter the values one by one:");
        for (int i = 0; i < n; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            double value = scanner.nextDouble();
            sum += value;
        }

        double average = sum / n;
        System.out.println("The average of the " + n + " values is: " + average);

        scanner.close();
    }
}
