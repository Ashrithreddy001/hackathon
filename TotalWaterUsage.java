import java.util.Scanner;

public class TotalWaterUsage {

    // Method to calculate total water consumption
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading morning and evening water usage
        System.out.print("Enter morning water usage (in litres): ");
        int morning = scanner.nextInt();

        System.out.print("Enter evening water usage (in litres): ");
        int evening = scanner.nextInt();

        // Calling method and displaying result
        int totalConsumption = calculateTotal(morning, evening);
        System.out.println("Total Water Consumption: " + totalConsumption + " litres");

        scanner.close();
    }
}