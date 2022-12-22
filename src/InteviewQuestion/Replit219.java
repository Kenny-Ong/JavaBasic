package InteviewQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Replit219 {
    public static void main(String[] args) {

        ArrayList<String> Word = new ArrayList<>();
        Word.add("steve");
        Word.add("stevens");
        Word.add("danny");
        Word.add("steves");
        Word.add("dan");
        Word.add("john");
        Word.add("johny");
        Word.add("alex");
        Word.add("alexander");

        ArrayList<String> Query = new ArrayList<>();
        Query.add("steve");
        Query.add("alex");
        Query.add("joe");
        Query.add("john");
        Query.add("dan");

        System.out.println(countOnlyPrefixes(Word, Query));
    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query){
        LinkedList<Integer> prefixNum = new LinkedList<>();
        for(int i = 0; i <query.size(); i++) {
            prefixNum.add(i, 0);
        }
        int num = 1;
        for(int i=0; i<query.size(); i++) {
            for(int j=0; j<names.size(); j++){
                if(names.get(j).length()>query.get(i).length()) {
                    String prefix = names.get(j).substring(0, query.get(i).length());
                    if(prefix.equals(query.get(i))){
                        if(prefixNum.get(i)==1) {
                            prefixNum.set(i, num++);
                        }
                        prefixNum.set(i, num);
                    }
                    num=1;
                }
            }
        }
        return prefixNum;
    }
}
/*
Count how many times a given word from a list is present as prefix in another list both lists will be given as input to the function

You have to implment a method that takes two lists as input one list contains the query words that we want to search from the other list.

Word List  ["steve","stevens","danny","steves","dan","john","johny"
        ,"joe"
        ,"alex"
        ,"alexander"]

Query Word List ["steve","alex","joe","john","dan"]

output

[2, 1, 0, 1, 1]

As word steve is present as prefix in word stevens and steves so we get 2 for it note we are not counting if we have the exact word in the
original list

word alex is prefix in alexander so we get 1

word joe is not present as prefix so we get 0
 */