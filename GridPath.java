package recursion;

import java.util.Scanner;

public class GridPath {
	static int path(int n , int m) {
		if(n==1||m==1) {
			return 1;
			
		}
		return path(n-1,m)+path(n,m-1);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;
		int a;
		int b;
		System.out.println(" enter a(row) and b(column) respectively");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.hasNextLine();
		sc.close();
		int z= path(a,b);
		System.out.println("the total possible paths are :"+z);

	}

}
