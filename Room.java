package package1;

public class Room {
    int roomNumber;
    String category; // Single, Double, Suite
    boolean isAvailable;

    Room(int roomNumber, String category) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.isAvailable = true;
    }
}
