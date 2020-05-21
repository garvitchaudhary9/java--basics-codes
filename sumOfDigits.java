package whileLoop;
import java.util.Scanner;
public class digitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lastDigit,x, temp=0, sum=0;
		x=sc.nextInt();
		temp=x;
		while(temp!=0)
		{
			lastDigit=temp%10;
			temp=temp/10;
			sum+=lastDigit;
		}
		System.out.println("sum of digits of"+x+" is "+sum);

	}

}
