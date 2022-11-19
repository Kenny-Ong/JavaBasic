package Practice;
import org.apache.commons.collections4.map.HashedMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class practice5 {

    public static int[] arraySumToZero(int N) {
        int [] arr = new int [N];
        if(N==0) {

            return arr;
        }
        if(N%2==0){
            for (int i=0; i<N; i++){
                if(i%2==0){
                    arr[i] = N;
                } else if (i%2==1){
                    arr[i] = -N;
                }
            }
        } else if(N%2==1){

            for (int i=0; i<N; i++){
                if((i+1)==N) {
                    arr[i]=0;
                    break;
                }
                if(i%2==0){
                    arr[i] = N;
                } else if (i%2==1){
                    arr[i] = -N;
                }
            }
        }
        return arr;
    }
    public static void main(String[]args){

        int [] a = new int[0];
        System.out.println(Arrays.toString(a));

        System.out.print(Arrays.toString(arraySumToZero(4)));

    }
}
