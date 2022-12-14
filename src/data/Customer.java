/*Create a class called Customer, which holds the data about customer, this will hold name, address, email, mobile and premium membership(yes/ no).
        This class must be properly encapsulated as well as will contain two constructor.

        This class must contain a method called displayCustomer(), which will display customer information.

        Write an implementation, create object1 by calling parameterized constructor,
        create second object by calling no- arguments constructor,
        display them and change there references means object1 should display object2 values and
        object2 will display object1 values.*/

package data;

public class Customer {
    private String name;
    private String address;
    private String email;
    private long mobileNo;
    private boolean isPremiunMember;

    public Customer(String name,String address,String email,long mobileNo,boolean isPremiumMember){
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobileNo = mobileNo;
        this.isPremiunMember = isPremiumMember;

    }
    public Customer(){
        name = "ABC";
        address = "PQR";
        email = "megha@gmail.com";
        mobileNo = 1234580760L;
        isPremiunMember = true;
    }
    public void displayCustomer(){
        System.out.println("name = " + name);
        System.out.println("address = "+ address);
        System.out.println("email = " + email);
        System.out.println("mobileNo = " + mobileNo);
        System.out.println("isPreminumMember = "+isPremiunMember);
    }

}
