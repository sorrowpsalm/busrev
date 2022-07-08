import java.util.ArrayList;
import java.util.*;

public class Booking {
    private int bookingid;
    private String customerName;
    private int noOfSeatsBooked;
    private int[] bookedSeats;

    Booking(ArrayList<Booking> bookingsList, ArrayList<Bus> busList){
        System.out.println("Let's book your ticket!\n"+"Here's the list of available busses:\n");
        for (Bus bus : busList) {
            System.out.println(bus.getBusNumber());
        }

        System.out.println("Which bus do you want to book a ticket in?");
        Scanner scan = new Scanner(System.in);
        int preferredBus = scan.nextInt();

        int noOfBookings = 0;
        

        scan.close();

    }

}
