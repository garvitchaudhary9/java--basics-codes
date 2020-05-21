package introduction;

import java.util.Scanner;

public class numberOfDigits {

	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		int no_of_digits;
		no_of_digits=(int) (Math.log10(a)+1);
		System.out.println("the no of digits of "+a+" is "+no_of_digits);

	}

}
