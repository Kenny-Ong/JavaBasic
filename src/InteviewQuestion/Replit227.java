package InteviewQuestion;

import java.util.*;

public class Replit227 {
    public static void main(String[] args) {
        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>")); //true
        System.out.println(HTMLElements("<div><div><b></b></div></p>")); //div
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>")); //i
    }
    public static String HTMLElements(String str){

           //split the string
        String [] splitTag = str.split(">");
        LinkedList<String> word = new LinkedList<>();
        for(String split:splitTag){
            word.add(split);
        }
            //I rebuild the string open and close tag in a LinkedList
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word.size(); i++) {
            sb = sb.append(word.get(i)).append(">");
            String stringSB = sb.toString();
            word.set(i, stringSB);
            sb.delete(0, sb.length());
            if(word.get(i).contains("</")){
                if(word.get(i).indexOf("/")!=1) {
                    word.set(i, word.get(i).substring(word.get(i).indexOf("/")-1));
                }
            }
        }
        //if there was a double open tag
        for(int i=0; i<word.size(); i++) {
            for(int j=i+1; j<word.size(); j++){
                if(word.get(i).equals(word.get(j))){
                    String doubleElement = word.get(j).toString().replaceAll("[^A-Z,a-z]", "");
                    return doubleElement;
                }
            }
        }
        //if open and close tag have same matching pair compare both length and return true
        LinkedList <String> word2 = new LinkedList<>();
        String nestCorrectly = "true";
        for(int i=0; i<word.size(); i++) {
            for (int j = i + 1; j < word.size(); j++) {
                if(word.get(i).substring(1).equals(word.get(j).substring(2))){
                    word2.add(word.get(i));
                    word2.add(word.get(j));
                }
            }
        }
        if(word2.size()==word.size()) {
            return nestCorrectly;
        }
        //replace all matching pair of open and closing tag, and only closing tag with * and remove with iterator
        LinkedList <String> word3 = new LinkedList<>(word);
        for(int i=0; i<word3.size(); i++) {
            for (int j = i + 1; j < word3.size(); j++) {
                if(word3.get(i).substring(1).equals(word3.get(j).substring(2))){
                    word3.set(i, "*");
                }
            }
        }
        for(int i=0; i<word3.size(); i++) {
            if(word3.get(i).contains("/")){
                word3.set(i, "*");
            }
        }
        Iterator<String> itr = word3.iterator();
        while(itr.hasNext()) {
            String removeStar = itr.next();
            if (removeStar.contains("*")) {
                itr.remove();
            }
        }
        String noClosingElement = word3.toString().replaceAll("[^A-Z,a-z]", "");
        return noClosingElement;
    }
}
