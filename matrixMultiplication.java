package arrays;

import java.util.Scanner;

public class matrixMultiplication {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r,c;
		System.out.println("enter the no of rows and columns respectively");
		r= sc.nextInt();
		c=sc.nextInt();
	 int a[][]= new int [r][c];
	 int b[][]= new int [r][c];
	 int d[][]= new int [r][c];
	 System.out.println("Enter the array a:");
	 for(int i =0; i<r;i++)
	 {
		 for(int j=0;j<c;j++) {
			 a[i][j]=sc.nextInt();
		 }
	 }
	 System.out.println("Enter the array b:");
	 for(int i =0; i<r;i++)
	 {
		 for(int j=0;j<c;j++) {
			 b[i][j]=sc.nextInt();
		 }
	 }
	 
	 for(int i =0; i<r;i++)
	 {
		 for(int j=0;j<c;j++) {
			 d[i][j]+=a[i][j]*b[j][i];
		 }
	 }
	 System.out.println("the matrix multiplication of the array a and b is c :");
	 for(int i =0; i<r;i++)
	 {
		 for(int j=0;j <  c;j++) {
			 System.out.println(d[i][j]+" ");
		 }
		 
	 }

	}

}