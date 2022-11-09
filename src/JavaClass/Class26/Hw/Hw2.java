package JavaClass.Class26.Hw;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.LinkedList;

public class Hw2 {
    /*Create a Card class that will have implemented  and unimplemented methods and a
    constructor that will initializes credit card type.  Create 3 subclasses of a Card card.
     Create 3 objects of different card and store them into LinkedList. Using for
     loop/advanced for loop/ iterator access all methods of the class.
     */
    public static void main(String[] args) {
        Visa visa = new Visa("Visa");
        Mastercard mastercard = new Mastercard("Mastcard");
        AMX amx = new AMX("AMX");

        LinkedList <Card> linkedList = new LinkedList<>();
        linkedList.add(visa);
        linkedList.add(mastercard);
        linkedList.add(amx);

        for(Card link:linkedList){
            link.fee();
            link.acceptedHere();
        }
    }
}

abstract class Card {
    String card;
    Card (String card){
        this.card=card;
    }
   public void fee(){
        System.out.println(card+" have a .50 cent usuage fee");
    }

    public abstract void acceptedHere();

}

class Visa extends Card {

    Visa(String card) {
        super(card);
    }

    @Override
    public void fee(){
        System.out.println("No usuage fee for "+card);
    }

    @Override
    public void acceptedHere() {
        System.out.println(card+" is accepted everywhere!");
    }
}

class Mastercard extends Card {
    Mastercard(String card) {
        super(card);
    }

    @Override
    public void fee() {
        System.out.println(card+" have a .25 cent usuage fee");
    }
    @Override
    public void acceptedHere() {
        System.out.println(card+" is accepted most places");
    }
}

class AMX extends Card {

    AMX(String card) {
        super(card);
    }

    @Override
    public void acceptedHere() {
        System.out.println(card+" is not accepted everywhere");
    }
}
