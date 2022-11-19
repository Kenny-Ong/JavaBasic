package InteviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class Replit227Ali {
    public static String HTMLElements(String str) {
        List<String> list = getListOfElements(str);
        //   System.out.println("list = " + list);
        for (String s : list) {
            if (s.equals("")) continue;
            try {
                list.set(list.indexOf(s), "");
                list.set(list.indexOf("/" + s), "");
                //System.out.println("list = " + list);
            } catch (Exception e) {
                return s;
            }
        }
        return "";
    }

    public static List<String> getListOfElements(String str) {
        List<String> list = new ArrayList<>();
        boolean start = false;
        String text = "";
        for (String s : str.split("")) {
            if (s.equals("<"))
                start = true;
            else if (s.equals(">")) {
                start = false;
                list.add(text);
                text = "";
            } else if (start)
                text += s;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(HTMLElements("<div><b><p>hello world</p></b> </div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }
}