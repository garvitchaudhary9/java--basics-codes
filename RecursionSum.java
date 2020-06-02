package recursion;

import java.util.Scanner;

public class RecursionSum {
	static int sum(int n) {
		if(n==1) {
			return 1;
			
		}
		return n+sum(n-1);
	}

	public static void main(String[] args) {
		int n ;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int z=sum(n);
		System.out.println(z);

	}

}
