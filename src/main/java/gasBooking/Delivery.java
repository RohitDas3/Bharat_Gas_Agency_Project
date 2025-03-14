package gasBooking;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Delivery extends Booking {
    public Delivery(String name, String street, String area, String pincode, String mobile) {
        super(name, street, area, pincode, mobile);
    }

    public String delPersonName;
    int customerOtp;

    public void amountCalc() {
        Long dayDiff = dt_2.getTime() - dt_1.getTime(); //dt_2 is delivery and dt_1 is booking
        long newDiff = TimeUnit.DAYS.convert(dayDiff, TimeUnit.MILLISECONDS);

        if (newDiff > 7) {
            refund = 41.25;
            amount = amount - refund;
        }
    }

    public void verify0tp() {
        if (status.equals("B")) {
            System.out.println("enter OTP: ");
            customerOtp = new Scanner(System.in).nextInt();
            if (customerOtp == otp) {
                status = "C";
            } else {
                status = "D";
            }
        } else System.out.println("no booking found!!!");

    }
    public void delPersonDetails () {
        System.out.println("\n Enter the delivery person name: ");
        delPersonName = new Scanner(System.in).nextLine();
    }
}
