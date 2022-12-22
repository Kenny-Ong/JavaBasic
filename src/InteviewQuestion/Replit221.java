package InteviewQuestion;

import java.util.LinkedList;

public class Replit221 {
    public static void main(String[] args) {
        String str = "find MaxLen Even EIGHTYSS";
        findMaxLenEven(str);
    }

    public static String findMaxLenEven(String str)
    {
        String odd = "-1";
        String [] arr = str.split(" ");
        LinkedList<String> maxEven = new LinkedList<>();
        LinkedList <String> maxLength = new LinkedList<>();
        String length = null;
        LinkedList <String> oddLength = new LinkedList<>();

        for(String a: arr) {
            if(a.length()%2==1) {
                oddLength.add(a);
            }
        }

        if(arr.length==oddLength.size()) {
            System.out.println(odd);
            return odd;
        }
        for(String a : arr) {
            if(a.length()%2==0){
                maxEven.add(a);
            }
        }
        for(int i =0; i<maxEven.size(); i++) {
            for(int j=i+1; j<maxEven.size(); j++) {
                if(maxEven.get(i).length()>maxEven.get(j).length()){
                    length = maxEven.get(i);
                } else if( maxEven.get(i).length()<maxEven.get(j).length()) {
                    length = maxEven.get(j);
                }
            }
        }
        for(String MaxEven: maxEven){
            if(length.length()== MaxEven.length()) {
                maxLength.add(MaxEven);
            }
        }
        System.out.println(maxLength.get(0));
        return maxLength.get(0);
    }
}
/*
Find the largest even length word from a String
if there are two words with same largest even length return the first one.
if there are not even words return -1

input ["find MaxLen Even"]

output ["MaxLen"]

input["I am very Good at Java"]

output ["very"]

input["I was"]

output ["-1"]
 */
