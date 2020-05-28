package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int a=5;
			int b=0;
			System.out.println(a/b);}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" error occured");
		}
		System.out.println("very important code,will run");

	}

}
