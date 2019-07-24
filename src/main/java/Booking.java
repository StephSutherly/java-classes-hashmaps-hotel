public class Booking {

    private Bedroom bedroom;
    private int numOfNights;
    private int totalBill;

    public Booking(Bedroom bedroom, int numOfNights) {
        this.bedroom = bedroom;
        this.numOfNights = numOfNights;
        this.totalBill = numOfNights*bedroom.getNightlyRate();
    }

    public int getTotalBill() {
        return totalBill;
    }
}
