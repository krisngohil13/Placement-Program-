import java.util.Scanner;

public class Unit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        double billAmount = calculateBillAmount(units);

        System.out.println("Bill Amount: Rs. " + String.format("%.2f", billAmount));
    }

    private static double calculateBillAmount(int units) {
        double billAmount = 0;

        // Calculate the cost of units consumed
        if (units <= 100) {
            billAmount = units * 0.80;
        } else if (units <= 300) {
            billAmount = 100 * 0.80 + (units - 100) * 0.90;
        } else {
            billAmount = 100 * 0.80 + 200 * 0.90 + (units - 300) * 1.00;
        }

        // Add meter charge
        billAmount += 100;

        // Add surcharge if total amount is more than Rs. 300
        if (billAmount > 300) {
            billAmount += billAmount * 0.1236;
        }

        return billAmount;
    }
}