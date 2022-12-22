package InteviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class Replit218 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("switch");
        list.add("tv");
        list.add("switch");
        list.add("tv");
        list.add("switch");
        list.add("tv");
        list.add("radio");
        System.out.println(countDeviceNames(list));
    }
    public static List<String> countDeviceNames(List<String> deviceNames) {
        int rep=1;
        System.out.println(deviceNames);
        System.out.println("_________");
        for (int i=0; i<deviceNames.size(); i++){
            for (int j=i+1; j<deviceNames.size();j++) {
                if(deviceNames.get(i).equals(deviceNames.get(j))){
                    deviceNames.set(j, deviceNames.get(j)+""+rep++);
                }
            } rep =1;
        }
        return deviceNames;
    }
}
/*
Count the number of repetations of words in an ArrayList append that count and return that list.
You need to implent a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList

input ["switch","tv","switch","tv","switch","tv"]

output [switch, tv, switch1, tv1, switch2, tv2]

In this example as word switch is repeated we pick the next entry
where it is repeated and append the count i.e how many times that
word was present previously

More Exmaples

input ["switch","tv","switch","tv","switch","tv","radio"]

output [switch, tv, switch1, tv1, switch2, tv2, radio]

input ["switch","tv","switch","tv"]

output [switch, tv, switch1, tv1]

if words are not repeated we get the same output

input ["switch","tv"]

output [switch, tv]
 */