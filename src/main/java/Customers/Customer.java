package Customers;
import gasSupplier.gasAgency;
public class Customer {
    public String name;
    public String Street;
    public String area;
    public String pincode;
    public String mobile;
    //constructor
    public Customer (String name, String street, String area, String pincode, String mobile) {
        this.name = name;
        this.Street = street;
        this.area = area;
        this.pincode = pincode;
        this.mobile = mobile;
    }
}
