package introduction;
import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		int x, y, sum=0;
		Scanner myObj= new Scanner(System.in);
		System.out.println("enter two numbers:");
		x=myObj.nextInt();
		y=myObj.nextInt();
		sum=x+y;
		System.out.println(x+" + "+y+" is "+sum);
		

	}

}
