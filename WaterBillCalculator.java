import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading water consumption
        System.out.print("Enter water consumption in litres: ");
        double consumption = scanner.nextDouble();

        double billAmount;

        // Calculating bill using if-else condition
        if (consumption <= 500) {
            billAmount = 100.0;
        } else {
            billAmount = 200.0;
        }

        // Displaying the bill
        System.out.println("Water Bill: Rs. " + billAmount);

        scanner.close();
    }
}