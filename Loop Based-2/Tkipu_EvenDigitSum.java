import java.util.Scanner;
class Tkipu_EvenDigitSum
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt(), a = 0, sum = 0;
		int digit = n;
		while(digit >0){
			a = digit % 10;
			if(a % 2 == 0){
				sum += a;
			}
			digit /= 10;
		}
		System.out.println("The Sum of all digits of " + n + " is: " + sum);
	}
}