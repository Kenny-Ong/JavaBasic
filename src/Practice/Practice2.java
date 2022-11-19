package Practice;

import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.poi.ss.usermodel.Row;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {

        List<Map<String,Object>> dataList = new ArrayList<>();
            Map<String,Object> appleMap = new LinkedHashMap<>();
                appleMap.put("Items", "Apple");
                appleMap.put("Price", 20.00);
                appleMap.put("Quantity", 10);
                dataList.add(appleMap);

            Map<String,Object> orangeMap = new LinkedHashMap<>();
                orangeMap.put("Items", "Orange");
                orangeMap.put("Price", 21.99);
                orangeMap.put("Quantity", 10);
                dataList.add(orangeMap);

                double price =0;
                int quantity=0;
                double total=0;
            for(Map<String, Object> listData:dataList){
                for(Map.Entry<String,Object> entry:listData.entrySet()) {
                    if(entry.getKey().equals("Price")){
                        price=(double) entry.getValue();
                    } else if( entry.getKey().equals("Quantity")) {
                        quantity=(int) entry.getValue();
                    }
                    System.out.println(entry.getKey()+": "+entry.getValue()+" ");
                }
                total+=price*quantity;
                System.out.println("Subtotal "+(price*quantity));
            }
            System.out.println("Your purchase total :"+(total));
    }
}
