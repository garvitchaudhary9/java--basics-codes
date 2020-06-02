package recursion;

import java.util.Scanner;

public class RecursionPowerFast {

	static int power(int a,int b) {
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return power(a*a,b/2);
		}
		
			return power(a,b-1)*a;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in) ;
		int a,b;
		System.out.println("to find a to power b enter a and b respectively");
		a=sc.nextInt();
		sc.hasNextLine();
		b=sc.nextInt();
		sc.close();
		int z=power(a,b);
		System.out.println(a+"to power"+b+"="+z);
	}
}

