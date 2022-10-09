package JavaClass.Class13;

import java.util.Arrays;

public class StringMethodsSplit {

    public static void main(String[] args) {

        String str="Batch 14 is really good";
        String [] arr= str.split(" [t]");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);

        String str2="Today is Sunday. Sunday is good. java is also good";
        String [] arr2=str2.split("");
        System.out.println(Arrays.toString(arr2));


    }
}
