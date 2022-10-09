package JavaClass.Class12;

import java.util.Scanner;

public class Hw4 {

    public static void main(String[] args) {
        /*Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
                */

        String mom;
        String dad;
        String gender;
        char first;
        char last;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mom, what is your first name?");
        mom = scanner.nextLine().toUpperCase();

        System.out.println("Dad, what is your first name?");
        dad = scanner.nextLine().toUpperCase();

        System.out.println("Please enter baby gender 'B' for boy or 'G' for girl?");
        gender = scanner.next();
        first = (char) (dad.length()/2);
        last = (char) (mom.length()/2);

        if(gender.equalsIgnoreCase("b")) {

            System.out.println(dad.substring(0, first)+mom.substring(last, mom.length()));
        }
        else if (gender.equalsIgnoreCase("g")) {
            System.out.println(mom.substring(0, first)+dad.substring(last, dad.length()));
        }
        else {
            System.out.println("Enter invalid gender");
        }

    }
}
