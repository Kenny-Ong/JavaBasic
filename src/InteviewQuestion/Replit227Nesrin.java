package InteviewQuestion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Replit227Nesrin {
    public static void main(String[] args) {
        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }

    public static String HTMLElements(String str) {

        String[] splitted = str.split("<");

        List<String> openingTags = new ArrayList<>();
        List<String> closingTags = new ArrayList<>();
        for (String tag : splitted) {
            if(tag.equals("")){
                continue;
            }
            if (tag.contains("/")) {
                closingTags.add(tag);
            } else {
                openingTags.add(tag);
            }
        }
        String odd = "";
        Iterator it1 = openingTags.iterator();
        while (it1.hasNext()) {
            String openingTag = (String) it1.next();

            if (!openingTag.endsWith(">") ) {
                for (int i = 0; i < openingTag.length(); i++) {
                    openingTag = openingTag.substring(0, openingTag.indexOf(">"));
                    odd = openingTag;
                    break;
                }
            }
            Iterator it2 = closingTags.iterator();
            while (it2.hasNext()) {
                String closingTag = (String) it2.next();
                if (closingTag.contains(openingTag) ) {
                    it2.remove();
                    it1.remove();
                    break;
                }
            }
        }
        String result ="true";
        if(openingTags.size()>0){
            odd = openingTags.get(0);
            result = odd.substring(0, odd.indexOf(">"));
        }

        return result;
    }

}
