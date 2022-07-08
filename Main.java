import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Bus> busList = new ArrayList<>();
        ArrayList<Booking> bookingsList = new ArrayList<>();

        Bus b = new Bus(125,"ajith",5);
        busList.add(b);
        b.getBus();
        
        System.out.println("What do you want to do?");
        System.out.println("1.View all available buses\n2.Book a bus\n3.Exit");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                
                break;
        
            default:
                break;
        }

        scan.close();


    }
}