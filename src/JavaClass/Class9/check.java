package JavaClass.Class9;

public class check {

    public static void main(String[] args) {
        
        int sum=0;
        int sumO=0;
        int[] num = {4,6,3,6,2,9,54,76,34,76};
        for(int i=0; i<num.length; i++) {
            sum+=num[i];
        }
        System.out.println("The sum is: "+sum);
        System.out.println("-------------");
        for(int numb:num) {
            sumO+=numb;

        }
        System.out.println("The sume is: "+sum);
    }

}