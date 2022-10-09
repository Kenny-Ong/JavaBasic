package JavaClass.Class14;



public class HwTask6 {

    /*Write a method to return whether given number is prime or not?*/

    boolean isPrime(int num) {
        boolean isPrime=true;
        if (num>1) {
            for (int i=2; i<num; i++) {
                isPrime=false;
            }
        } else {
            isPrime=false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        HwTask6 task6=new HwTask6();
        System.out.println(task6.isPrime(12));
    }
}
