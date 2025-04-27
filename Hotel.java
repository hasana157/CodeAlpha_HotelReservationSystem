package package1;
public class Hotel {
    Room[] rooms;
    Reservation[] reservations;
    int reservationCount;

    // Constructor to create hotel with some rooms
    public Hotel(int totalRooms) {
        rooms = new Room[totalRooms];
        reservations = new Reservation[totalRooms]; // Max one reservation per room
        reservationCount = 0;

        // Let's assign rooms manually
        for (int i = 0; i < totalRooms; i++) {
            if (i < totalRooms / 3) {
                rooms[i] = new Room(100 + i, "Single");
            } else if (i < 2 * totalRooms / 3) {
                rooms[i] = new Room(200 + i, "Double");
            } else {
                rooms[i] = new Room(300 + i, "Suite");
            }
        }
    }

    // Method to display available rooms
    public void showAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable) {
                System.out.println("Room " + room.roomNumber + " - " + room.category);
            }
        }
    }

    // Method to search rooms by category
    public void searchRoomsByCategory(String category) {
        System.out.println("Available " + category + " rooms:");
        boolean found = false;
        for (Room room : rooms) {
            if (room.isAvailable && room.category.equalsIgnoreCase(category)) {
                System.out.println("Room " + room.roomNumber);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No rooms available in this category.");
        }
    }

    // Method to reserve a room
    public boolean makeReservation(String customerName, int roomNumber, double paymentAmount) {
        for (Room room : rooms) {
            if (room.roomNumber == roomNumber && room.isAvailable) {
                room.isAvailable = false;
                reservations[reservationCount++] = new Reservation(customerName, roomNumber, paymentAmount);
                System.out.println("Reservation successful!");
                return true;
            }
        }
        System.out.println("Room not available or doesn't exist.");
        return false;
    }

    // Method to view all reservations
    public void showAllReservations() {
        System.out.println("All Reservations:");
        for (int i = 0; i < reservationCount; i++) {
            Reservation res = reservations[i];
            System.out.println("Customer: " + res.customerName + ", Room: " + res.roomNumber + ", Paid: $" + res.paymentAmount);
        }
    }
}
