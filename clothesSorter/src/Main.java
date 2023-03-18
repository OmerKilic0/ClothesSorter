import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ClothesSorter clothes = new ClothesSorter("Clothes.txt");

        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Sort by name of clothes ");
            System.out.println("2. Sort by color of clothes ");
            System.out.println("3. Sort by price of clothes ");
            System.out.println("4. Sort by discount percentage of clothes ");
            System.out.println("5. Print contents in a table ");
            System.out.println("6. Exit");
            choice = scan.nextInt();

            if (choice == 1) {
                System.out.println("Sort by name:");
                clothes.sortByName();
            }
            else if (choice == 2) {
                System.out.println("Sort by color:");
                clothes.sortByColor();
            }
            else if (choice == 3) {
                System.out.println("Sort by price:");
                clothes.sortByPrice();
            }
            else if (choice == 4) {
                System.out.println("Sort by percentage:");
                clothes.sortByDiscountPercentage();
            }
            else if (choice == 5) {
                clothes.print();
            }
        }while(choice != 6);
        scan.close();
    }
}
