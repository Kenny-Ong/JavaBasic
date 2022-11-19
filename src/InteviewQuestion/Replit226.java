package InteviewQuestion;

import java.util.Arrays;

public class Replit226 {
    public static void main(String[] args) {
        String reverseString = "I am a java Programmer";
        
        reverse(reverseString);
    }
    public static String reverse(String strToRev){
        String[] arr = strToRev.split(" ");
        String reverse = "";
        for(int i = arr.length-1; i>=0; i--) {
            reverse = reverse.concat(arr[i]).concat(" ");
        }
        reverse = reverse.trim();
        return reverse;
    }  
}
/*
Reverse the String without using the Reverse method from the StringBuilder Class
input["I am a java Programmer"] output["Programmer java a am I"]

input["Syntax is Great"] output["Great is Syntax"]


 */