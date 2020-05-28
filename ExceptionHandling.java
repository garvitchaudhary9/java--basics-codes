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
		finally {
			System.out.println("sorry for the inconvineance ");
		}
		System.out.println("very important code,will run ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after delay");
		
	}

}
