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

    Customer(String name,String address,String email,String mobileNo,boolean isPremiumMember){
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobileNo = mobileNo;
        this.isPremiunMember = isPremiumMember;

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setPremiunMember(boolean premiunMember) {
        isPremiunMember = premiunMember;
    }

    public boolean isPremiunMember() {
        return isPremiunMember;
    }
}
