package JavaClass.Class28.Hw;

import java.util.HashMap;

public class Hw5 {
    public static void main(String[] args) {
        /*
        Create a Map that will store Employee name and salary. Write a logic to retrieve
        an employee who gets the highest salary. Output should be in the below format
        John Smith = $10000
         */

        HashMap<String, Integer> employee = new HashMap<>();
        employee.put("John Smith", 100000);
        employee.put("Kenny Ong", 90000);
        employee.put("Linda Huynh", 98000);
        employee.put("Ethan Ong", 95000);
        employee.put("Malia Ong", 91000);

        var entrySet = employee.entrySet();
        Integer highest = 0;
        for (var highPay: employee.values()) {
            if(highPay>highest) {
                highest=highPay;
            }
        }
        for(var high:entrySet){
            if(high.getValue()==highest) {
                System.out.println(high.getKey()+" = "+high.getValue());
            }
        }
    }
}