package Customers;

import java.text.SimpleDateFormat;
import java.util.*;
public class GasConnecttion extends Customer {
    public int numberOfCylinders;
    String date;
    static int connectionNumber = 100;
    static {
        connectionNumber += 1;
    }
    public Date lastDate = null;
    SimpleDateFormat dateFormat = new SimpleDateFormat( "dd-MM-yyyy" );
    public GasConnecttion(String name, String street, String area, String pincode, String mobile) {
        super(name, street, area, pincode, mobile);
        this.numberOfCylinders = numberOfCylinders;
    }
    public void getLastDate() {
        System.out.println("Enter the last Date");
        date = new Scanner(System.in).nextLine();
        try {
            lastDate = dateFormat.parse(date);
        } catch (Exception e) {
            System.out.println("error in getLast Date: " + e.getMessage());
        }
    }
}
