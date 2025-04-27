package package1;

public class Reservation {
    String customerName;
    int roomNumber;
    double paymentAmount;

    Reservation(String customerName, int roomNumber, double paymentAmount) {
        this.customerName = customerName;
        this.roomNumber = roomNumber;
        this.paymentAmount = paymentAmount;
    }
}
