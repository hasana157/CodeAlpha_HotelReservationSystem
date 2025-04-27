package package1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(9); // 9 rooms created (3 Single, 3 Double, 3 Suite)

        System.out.println("Welcome to the Hotel Reservation System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Search Rooms by Category");
            System.out.println("3. Make a Reservation");
            System.out.println("4. View Booking Details");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    hotel.showAvailableRooms();
                    break;
                case 2:
                    System.out.print("Enter room category (Single, Double, Suite): ");
                    String category = scanner.nextLine();
                    hotel.searchRoomsByCategory(category);
                    break;
                case 3:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter room number you want to book: ");
                    int roomNumber = scanner.nextInt();
                    System.out.print("Enter payment amount: ");
                    double payment = scanner.nextDouble();

                    if (payment > 0) {
                        hotel.makeReservation(name, roomNumber, payment);
                    } else {
                        System.out.println("Invalid payment amount. Must be greater than 0.");
                    }
                    break;
                case 4:
                    hotel.showAllReservations();
                    break;
                case 5:
                    System.out.println("Thank you for using the Hotel Reservation System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
