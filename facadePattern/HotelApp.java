package facadePattern;
import java.util.*;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FrontDesk frontDesk = new FrontDesk();

        int usrChc = 0;
        String again;

        while (true) {
            System.out.println("\n\nAvailable Services:");
            System.out.println("1 - Valet");
            System.out.println("2 - Housekeeping");
            System.out.println("3 - Cart Service");
            System.out.print("\nWhat service do you need?: ");

            try {
                usrChc = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input
                continue; // Skip the rest of the loop and start from the beginning
            }

            switch (usrChc) {
                case 1:
                    System.out.print("\nEnter vehicle plate: ");
                    String plateNumber = scanner.nextLine();
                    HotelService valetService = new Valet(plateNumber);
                    System.out.println();
                    frontDesk.assign(valetService);
                    break;
                case 2:
                    System.out.print("\nEnter your room number: ");
                    String roomNumber = scanner.nextLine();
                    if (!roomNumber.matches("^[a-zA-Z0-9]*$")) {
                        System.out.println("\nInvalid input. Please enter a valid room number.");
                        continue;
                    }
                    HotelService houseKeepingService = new HouseKeeping(roomNumber);
                    System.out.println();
                    frontDesk.assign(houseKeepingService);
                    break;
                case 3:
                    System.out.print("\nHow many carts do you need: ");
                    try {
                        int numberOfCarts = scanner.nextInt();
                        scanner.nextLine();
                        HotelService cartService = new Cart(numberOfCarts);
                        System.out.println();
                        frontDesk.assign(cartService);
                    } catch (InputMismatchException e) {
                        System.out.println("\nInvalid number of carts. Please try again.");
                        scanner.nextLine();
                    }
                    break;
                default:
                    System.out.println("\nInvalid input");
            }
            System.out.print("\nIs that all you need? Y or N?");
            again = scanner.nextLine();
            System.out.println();
            if ("y".equalsIgnoreCase(again)) {
                System.out.println("Thank you for using our services");
                break;
            }
        }
        scanner.close();
    }
}
