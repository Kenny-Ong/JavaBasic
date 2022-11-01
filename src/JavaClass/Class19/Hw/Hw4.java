package JavaClass.Class19.Hw;

public class Hw4 {
    /*Write program: userClass  that has a constructor that initializes instance
    variable name and mobile number. Create a subclass  userInfo that will have user
    address variable and it also being initialized through constructor call. Print users
     name, mobile number and address in userDetails method. Test your code.
     */
    public static void main(String[] args) {
        userInfo user = new userInfo("Kenny", "626-583-9091", "108", " Norwood Place", "San Gabriel", "California", 91776);
        user.userInfo();
    }


}
class userClass {
    String name;
    String mobileNumber;
    userClass(String name, String mobileNumber) {
        this.name=name;
        this.mobileNumber=mobileNumber;

    }

}

class userInfo extends userClass{
    String addressNumber;
    String streetName;
    String city;
    String state;
    int zipCode;

    public userInfo(String name, String mobileNumber, String addressNumber, String streetName, String city, String state, int zipCode) {
        super(name, mobileNumber);
        this.addressNumber = addressNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    void userInfo() {
        System.out.println("Name "+name+" mobile number is "+mobileNumber+ " address is "+addressNumber+" "+streetName+", "+city+", "+state+", "+zipCode);
    }

}
