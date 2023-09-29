import java.util.Scanner;

public class AverageMinMaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of values
        System.out.print("Enter the number of values: ");
        int numValues = scanner.nextInt();

        // Initialize variables for sum, average, smallest, and largest
        double sum = 0;
        double smallest = Double.MAX_VALUE;
        double largest = Double.MIN_VALUE;

        // Prompt the user to enter the values and calculate the sum, smallest, and largest
        for (int i = 1; i <= numValues; i++) {
            System.out.print("Enter value #" + i + ": ");
            double value = scanner.nextDouble();
            sum += value;

            if (value < smallest) {
                smallest = value;
            }

            if (value > largest) {
                largest = value;
            }
        }

        // Calculate the average
        double average = sum / numValues;

        // Display the results
        System.out.println("The average of the " + numValues + " values is: " + average);
        System.out.println("The smallest value is: " + smallest);
        System.out.println("The largest value is: " + largest);

        // Close the scanner
        scanner.close();
        //
        //
    }
}
