package JavaClass.Class2;
public class Hw1 {
	public static void main(String[] args) {
		String add; String sub; String multi; String div;
		add="addition"; sub="subration"; multi="multiple"; div="divide";
		double a=1.4, b=2.6, add1, sub1, multi1, div1, width, height;
		add1=a+b; sub1=a-b; multi1=a*b; div1=a/b; width=5; height=8;
		double e=3.9;
		System.out.println("1.");
		System.out.println("The "+add+" of 2 numbers "+a+" and "+b+" is equal to "+add1+".");
		System.out.println("The "+sub+" of 2 numbers "+a+" and "+b+" is equal to "+sub1+".");
		System.out.println("The "+multi+" of 2 numbers "+a+" and "+b+" is equal to "+multi1+".");
		System.out.println("The "+div+" of 2 numbers "+a+" and "+b+" is equal to "+div1+".");
		System.out.println(" ");
		System.out.println("2.");
		System.out.println("The square of the "+e+" is "+e*e+".");
		System.out.println(" ");
		System.out.println("3.");
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+(width+height)*2+" and the area is "+width*height+".");
		}
	}