package GroupProject;

public class CodingTask08 {

	public static void main(String[] args) {

		int fib = 0;
		int a = 1;
		int b = 0;

		for (int i = 0; i < 10; i++) {
			fib = b + a;
			System.out.print(fib + " ");
			b = fib;
			a = b - a;
		}
	}
}
