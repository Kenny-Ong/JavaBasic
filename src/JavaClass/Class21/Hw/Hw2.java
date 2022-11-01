package JavaClass.Class21.Hw;

public class Hw2 {
    /*Create a class CreditCard and define variable balance and interest. Create an instance
    method that will calculate interest based on the given balance. Create 2 subclasses: Visa
    and AX. In AX class override method calculate interest. Call the method by creating an
    object of each of the three classes.     */

    public static void main(String[] args) {
        CreditCard a = new CreditCard(1000, 3);
        Visa b = new Visa(2000, 3.25);
        AX c = new AX(3000, 4.3);

        a.calculator(1000,3);
        b.calculator(2000,3.25);
        c.calculator(3000,4.3);
    }
}

class CreditCard {
    double balance;
    double interest;
    CreditCard(){}

    CreditCard(double balance, double interest) {
        this.balance=balance;
        this.interest=interest;
    }

    void calculator (double balance, double interest){
        double interestAmount=balance*interest/100;

        System.out.println(interestAmount);
    }
}
class Visa extends CreditCard{

    Visa(double balance, double interest) {
        super(balance,interest);
    }
    @Override
    void calculator (double balance, double interest){
        double interestAmount=balance*interest/100;
       System.out.println("Visa interest & balance equals: "+(interestAmount));
    }
}

class AX extends CreditCard {
    AX(double balance, double interest) {
        super(balance,interest);
    }
    @Override
    void calculator (double balance, double interest){
        double interestAmount=balance*interest/100;
        System.out.println("AX interest & balance equals: "+(interestAmount+1));
    }

}