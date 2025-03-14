package gasBooking;

import Customers.*;
import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

public class Booking extends GasConnecttion {
    public double otp = 5678, amount = 825.0, refund = 0;
    public Date dt_1,dt_2;
    public String dt,status;
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

        // delivery details
        System.out.println(" Enter Delivery Date: ");
        delDate = new Scanner(System.in).nextLine();
        try {
            dt_2 = dateFormat.parse(String.valueOf(delDate));
        } catch (Exception e) {
            System.out.println("Error parsing second date" + e.getMessage());
        }
        // find the difference between two dates
        try {
            long difference = dt_2.getTime() - dt_1.getTime();
            //difference in days
            Long newDifference = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
            if (newDifference > 7) {
                status = "P";
            }
        } catch (Exception e) {
            System.out.println("Error while finding difference: " + e.getMessage());
        }
    }
        public void validate (){
            // get the difference between two dates
            Long elapsedms = dt_1.getTime() - lastDate.getTime();
            long diff= TimeUnit.DAYS.convert(elapsedms, TimeUnit.MILLISECONDS);
            //print
            System.out.println("Difference between two dates is: " + diff);
            if (numberOfCylinders == 1) {
                if (diff < 30) {
                    System.out.println("booking cannot be done");
                    // numberOfCylinders = 0;
                    status = "C";
                } else {
                    // System.out.println("status: booked");
                    status = "B"; //status booked
                    lastDate = dt_1;
                }
            } else if (numberOfCylinders == 2) {
                if (diff < 50) {
                    System.out.println("booking cannot be done");
                    // numberOfCylinders = 0;
                    status = "C";
                } else {
                    //System.out.println("status: booked");
                    status = "B"; //booked
                    lastDate = dt_1;
                }
            }
        }
    }
