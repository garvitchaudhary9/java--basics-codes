package recursion;

import java.util.Scanner;

public class RecursionPower {
	static int power(int a,int b) {
		if(b==1) {
			return a;
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
		int z=power(a,b);
		System.out.println(a+"to power"+b+"="+z);
	}

}
