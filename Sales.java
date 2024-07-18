import java.util.Scanner;

public class Sales{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Assuming the sales data is provided or read from somewhere (not explicitly mentioned)
        double[] sales = {5000, 3000, 6000, 4500, 7000}; // Example sales data
        int[] salaryRanges = new int[9]; // Array to count salaries in each range

        for (double sale : sales) {
            double salary = 200 + (0.09 * sale); // Calculate the total salary
            int salaryInt = (int) salary; // Truncate to integer

            // Determine the range and increment the corresponding counter
            if (salaryInt >= 200 && salaryInt <= 299) {
                salaryRanges[0]++;
            } else if (salaryInt >= 300 && salaryInt <= 399) {
                salaryRanges[1]++;
            } else if (salaryInt >= 400 && salaryInt <= 499) {
                salaryRanges[2]++;
            } else if (salaryInt >= 500 && salaryInt <= 599) {
                salaryRanges[3]++;
            } else if (salaryInt >= 600 && salaryInt <= 699) {
                salaryRanges[4]++;
            } else if (salaryInt >= 700 && salaryInt <= 799) {
                salaryRanges[5]++;
            } else if (salaryInt >= 800 && salaryInt <= 899) {
                salaryRanges[6]++;
            } else if (salaryInt >= 900 && salaryInt <= 999) {
                salaryRanges[7]++;
            } else if (salaryInt >= 1000) {
                salaryRanges[8]++;
            }
        }

        // Displaying the results
        System.out.println("Salary ranges:");
        System.out.println("$200-$299: " + salaryRanges[0]);
        System.out.println("$300-$399: " + salaryRanges[1]);
        System.out.println("$400-$499: " + salaryRanges[2]);
        System.out.println("$500-$599: " + salaryRanges[3]);
        System.out.println("$600-$699: " + salaryRanges[4]);
        System.out.println("$700-$799: " + salaryRanges[5]);
        System.out.println("$800-$899: " + salaryRanges[6]);
        System.out.println("$900-$999: " + salaryRanges[7]);
        System.out.println("$1000 and above: " + salaryRanges[8]);

        scanner.close();
    }
}