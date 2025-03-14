package gasBooking;

import Customers.*;
import java.util.*;
import java.text.*;

public class Booking extends GasConnecttion {
    public double otp = 5678, amount = 825.0, refund = 0;
    public Date dt_1;
    public String dt;
    public String delDate, Status, DelMobileNo = "7838048546";
    public Booking(String name, String street, String area, String pincode, String mobile) {
        super(name, street, area, pincode, mobile);
    }

    public void getDates() {
        System.out.println("enter booking date: ");
        dt = new Scanner(System.in).next();
        dt_1 = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            dt_1 = dateFormat.parse(dt);
        } catch (Exception e) {
            System.out.println("the error in getDates function: " + e.getMessage());
        }
    }
}
