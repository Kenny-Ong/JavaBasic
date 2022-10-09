package JavaClass.Class14;

public class HwTask4 {
/*
    Create a method that will say Hello in different language based on the country
     that will be passed when method is executed*/

    void hello(String word) {

        switch (word) {
            case "USA":
                System.out.println("Hello");
                break;
            case "China":
                System.out.println("你好 or Nǐ hǎo");
                break;
            case "Japan":
                System.out.println("こんにちは or Kon'nichiwa");
                break;
            case "Russia":
                System.out.println("привет or privet");
                break;
            default:
                System.out.println("Enter a valid country");
                break;
        }
    }

        public static void main (String[]args){

            HwTask4 hey = new HwTask4();
            hey.hello("Taiwan");
        }
}

