package JavaClass.Class2;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		// +, -< *, /, %
		
		int a=900;
		int b=100;
		
		System.out.println(a+b);
		System.out.println(a-b);		
		System.out.println(a*b);
		System.out.println(a/b);
	
		System.out.println("--------------------");
		
		int e=10;
		int f=5;
		
		System.out.println("division = "+e/f); //2
		System.out.println("remaindfer = "+e%f); //0
		
		System.out.println(20%9);//2
		
		System.out.println("--------------------");
		int c=10;
		int d=3;
		
		int sum=c+d;
		int sub=c-d;
		int remainder=c%d; //10/3
		int div=c/d;
		
		System.out.println("Sum is = "+sum);
		System.out.println("Sub is = "+sub);
		System.out.println("Remainder is = "+remainder);
		System.out.println("Div is = "+div); //3
		
		double num1=10.0;
		double num2=3.0;
		
		System.out.println(num1/num2);
		
		System.out.println(" using float data type------");
		
		float number1=10.0F;
		float number2=3.0F;
		
		System.out.println("Division of float = "+number1/number2);
		System.out.println(number1%number2);
		
		//remainder - % - mod operator shows what's after division
		
		System.out.println(6%3);
		
		System.out.println("   what is teh output   ");
		
		System.out.println(10+10/10); //11
		System.out.println((10+10)/10); //2
		
		
		
	}

}
