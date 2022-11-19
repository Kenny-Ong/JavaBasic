package InteviewQuestion;


public class Replit225 {

    public static void main(String[] args) {
        int num = 12345;
        reverseInteger(num);
    }
    public  static int reverseInteger(int N){

       Integer num = N;
       String n = num.toString();
       StringBuilder sb = new StringBuilder(n);
       String reverseString = sb.reverse().toString();

       int reverse = Integer.parseInt(reverseString);
       System.out.println(reverse);
       return reverse;
    }
}

