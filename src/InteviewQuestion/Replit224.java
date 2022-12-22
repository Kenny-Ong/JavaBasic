package InteviewQuestion;

import java.util.LinkedList;

public class Replit224 {
    public static void main(String[] args) {
        String letters = "aabbccaddda";
        removeConsecutiveDuplicates(letters);
    }

    public static String removeConsecutiveDuplicates(String input) {
        LinkedList<Character> charArr = new LinkedList<>();
        char [] arr =  input.toCharArray();
        String removeDuplicates = null;
        StringBuilder string = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            charArr.add(arr[i]);
        }


        for(int i=0; i<charArr.size(); i++){
            for(int j=i+1; j<charArr.size(); j++) {
                if(charArr.get(i)==charArr.get(j)) {
                    charArr.set(j, '*');
                } else if (charArr.get(i)!=charArr.get(j)) {
                    break;
                }
            }
        }
        charArr.removeIf(x-> x.equals('*'));

        for(Character a: charArr) {
            string.append(a);
        }

        removeDuplicates = string.toString();
        System.out.println(removeDuplicates);
        return removeDuplicates;
    }
}
/*
Remove Consecutive duplicates
Write the logic to remove only consecutive duplicates

input ["aabbcde"]-> output["abcde"]

input ["aabbcc"]-> output["abc"]

input ["aabbcca"]-> output["abca"]

input ["aabbccaddda"]-> output["abcada"]
 */
