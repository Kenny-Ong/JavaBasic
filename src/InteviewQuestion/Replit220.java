package InteviewQuestion;

import java.util.ArrayList;

public class Replit220 {
    public static void main(String[] args) {
        String string = "00-44   48 555555";
        formatString(string);
    }
    public static String formatString(String S){
        String format = S.replaceAll("[^0-9]", "");
        char [] formatChar = format.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();

        for(Character arry: formatChar) {
            arrayList.add(arry);
        }

        for(int i=3; i<arrayList.size(); i+=4){
            arrayList.add(i, '-');
        }
        StringBuilder sb = new StringBuilder();
        for(Character word: arrayList) {
            sb.append(word);
        }
        String formatted = sb.toString();
        System.out.println(formatted);
        return formatted;
    }
}
/*
Format the String:
Write the logic to format the string in the below given format
xxx-xxx-xxx
after each 3 digits ther should be dash("-")
if there are any spaces in the input remove those

input ["00-44   48 555555"]

output ["004-448-555-555"]

input ["00-44   48 555"]

output["004-448-555"]

input ["00-44  #$% 48 55"]

output ["004-448-55"]

 */