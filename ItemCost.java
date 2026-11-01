import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double totalCost = unitPrice * quantity;

        System.out.println("Item: " + itemName);
        System.out.println("Unit price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total cost: %.2f%n", totalCost);

        input.close();
    }
}
