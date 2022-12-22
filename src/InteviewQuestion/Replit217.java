package InteviewQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Replit217 {
    public static void main(String[] args ){

        ArrayList<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(12);
        num.add(13);
        num.add(45);
        num.add(78);
        num.add(7);
        num.add(7);
        System.out.println(countDuplicates(num));
    }
    static int countDuplicates(List<Integer> numbers){
        HashSet<Integer> output = new HashSet<>();
        for(int i=0; i<numbers.size(); i++){
            for(int j=i+1; j<numbers.size(); j++){
                if(numbers.get(i)==numbers.get(j)) {
                    output.add(numbers.get(i));
                }
            }
        }
        return output.size();
    }
}
/*
Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.

Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1

 */