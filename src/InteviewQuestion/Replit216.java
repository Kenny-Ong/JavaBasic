package InteviewQuestion;

import java.util.Arrays;

public class Replit216 {
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
        System.out.print(Arrays.toString(arraySumToZero(0)));
    }
}
/*
Create an Array of size N whose elements sum to zero

ArraySumToZero(0) ->{}

ArraySumToZero(1) ->{0}

ArraySumToZero(2) ->{-1,1}

ArraySumToZero(3) ->{1,-1,0}

ArraySumToZero(4) ->{2,-2,3,-3}

N will be given as input to the function and fucntion will return
an array whose element will sum to zero.
 */