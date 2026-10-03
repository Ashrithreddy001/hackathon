public class HouseholdDetails {
    public static void main(String[] args) {
        // Declaring variables with appropriate data types
        int familyMembers = 4;
        double waterConsumedLitres = 450.75;
        int houseNumber = 102;
        char usageStatus = 'N'; // 'N' for Normal, 'H' for High, etc.

        // Displaying the details
        System.out.println("--- Household Details ---");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Number of Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumedLitres + " litres");
        System.out.println("Water Usage Status: " + usageStatus);
    }
}