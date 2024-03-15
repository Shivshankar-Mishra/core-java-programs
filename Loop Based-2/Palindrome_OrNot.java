import java.util.Scanner;
class Palindrome_OrNot
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check: ");
		int n = sc.nextInt(); 
		int digit = n, a=0, b = 0;
		while(digit > 0){
			a = digit % 10;
			b = b * 10 + a;
			digit /=10;
		}
		if(n == b){
			System.out.println(n + " is Palindrome Number");
		}
		else{
			System.out.println(n + " is not a Palindrome Number");
		}
		System.out.println(b);
	}
}