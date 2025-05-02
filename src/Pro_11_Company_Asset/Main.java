
//Problem 11: Company Asset Tracker (Map<String, Set<Asset>>)
//        Store assets per department with unique Asset objects.
//        •	Detect duplicate asset IDs globally.


package Pro_11_Company_Asset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CompanyAsset tracker = new CompanyAsset();

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n=== Company Asset Tracker ===");
                System.out.println("1. Add Asset");
                System.out.println("2. Print All Assets");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                if (choice == 1) {
                    System.out.print("Enter department name: ");
                    String department = sc.nextLine();

                    System.out.print("Enter asset ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter asset name: ");
                    String name = sc.nextLine();

                    Asset asset = new Asset(id, name);
                    tracker.addAsset(department, asset);

                } else if (choice == 2) {
                    tracker.printAssets();

                } else if (choice == 3) {
                    System.out.println("Exiting.");
                    break;

                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
            sc.close();
        }
    }


