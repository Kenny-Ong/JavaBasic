package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        int num = 214515475;
        boolean isPrime=true;
        if (num > 1) {

            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }

        if(isPrime) {
            System.out.println(num+" is Prime");
        }else {

            System.out.println(num+" is not Prime");
        }

    }
}