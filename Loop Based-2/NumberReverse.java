import java.util.Scanner;
class NumberReverse
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int digit = n, lastDigit = 0, newDigit = 0;
		while(digit > 0){
			lastDigit = digit % 10;
			newDigit = newDigit * 10 + lastDigit;
			digit /= 10;
		}
		System.out.println("Reverse Of Number " + n + " is: " + newDigit);
	}
}