package arrays;

import java.util.Scanner;

public class averageOfMarks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,sum=0,average=0 ;
		System.out.println("enter the no of the students");
		n=sc.nextInt();
		int marks[]= new int [n];
		System.out.println("enter the marks now");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
			sum+=marks[i];
		}
		average=sum/n;
		System.out.println("average is:"+average);

	}

}
