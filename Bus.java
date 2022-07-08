public class Bus {
    private int busNumber;
    private String driverName;
    private int noOfSeats;

    Bus(int busNumber, String driverName,int noOfSeats) {
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.noOfSeats = noOfSeats;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int  getNumberOfSeats() {
        return noOfSeats;
    }

    public void displayBusDetails() {
        System.out.println("Bus number: " + busNumber + "Driver Name:" + driverName + "Total Number of Seats: " + noOfSeats);
    }
}
