package whileLoop;
import java.util.Scanner;
public class checkPalindrome {

	public static void main(String[] args) {
		int x,lastDigit=0;
		int temp=0;
		int rev=0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		temp=x;
		while(temp!=0) {
			lastDigit=temp%10;
			temp=temp/10;
			rev=rev*10+lastDigit;
		}
		if (rev==x) {
			System.out.println("the number is palindrome");
			
		}
		else {
			System.out.println("the number is not a palindrome");
		}

	}

}
