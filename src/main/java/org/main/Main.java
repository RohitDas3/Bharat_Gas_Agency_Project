package org.main;
import Customers.*;
import gasBooking.*;
import gasSupplier.*;

import java.util.Scanner;

public class Main {

    static int count;
    static int bcount = 0, ccount = 0, dcount = 0, pcount = 0;
    static String dpname;
    public static void cylinderCount (Delivery [] obj) {
        String[] months = new String[]{"January", "february", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        for (Delivery delivery: obj) {
            count = 0;
            System.out.println("In the month of " + (months [delivery.dt_2.getMonth()]) + " ");
            System.out.println("In "+ delivery. area);
            if(delivery.status.equals("D"))
            {
                count+= delivery.numberOfCylinders;
            }
            System.out.println(" "+count+ "cylinders delivered");
        }
        System.out.println("\n");
    }

    public static void checkLateDel (Delivery [] obj) {
        String[] months = new String[]{"January", "february", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        int[] month = new int[12];
        for (Delivery delivery: obj) {
            if(delivery.status.equals("D") && delivery. amount == 783.75 ) {
                month [delivery.dt_2.getMonth()] += 1;
                /* february, month array → at index 1st = 1; */
            }
            System.out.println(" -late delivery-- ");
            for (int i=0; i<12; i++){
                if(month[i] != 0){
                    System.out.println("In " + months [i] + "there are " + month[i]);
                }
            }
            System.out.println("\n");
        }
    }

    public static void numOfSingleCylinders (Delivery [] obj) {
        System.out.println("- Single Cylinder Holders- ");
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].numberOfCylinders == 1) {
                System.out.println("* Customer Name: " + obj[i].name);
                System.out.println("* Mobile No.: " + obj[i].mobile);
                System.out.println("Gas Connection No.:" + (i + 101));
            }
        }
        System.out.println("\n");
    }
    public static void DeliveryDetails (Delivery[] obj) {
        System.out.println(". --Delivery Details- -");
        System.out.println("enter the name of delivery person: ");
        dpname = new Scanner(System.in).next();
        for (Delivery delivery : obj) {
            if (delivery.status.equals("D") && delivery.delPersonName.equals(dpname)) {
                System.out.println("* Customer Name: " + delivery.name);
                System.out.println(" " + delivery.Street + ", " + delivery.area +
                        delivery.pincode);
            }
            System.out.println("\n");
        }
    } 
    
    public static void printReport(Delivery[] obj){
        System.out.println("---------------------Delivery Report----------------------");
        for(int i = 0 ; i < obj.length ; i++){
            if(obj[i].status.equals("D")){
                dcount++;
            } else if (obj[i].status.equals("B")) {
                bcount++;
            } else if (obj[i].status.equals("C")) {
                ccount++;
            } else if (obj[i].status.equals("P")) {
                pcount++;
            } else {
                System.out.println("Status invalid");
            }
        }
    }

    public static void main(String[] args) {

    }
}