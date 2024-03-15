import java.util.Scanner;
class FactorialSumEachDigit
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt(), a = 0, sum = 0;
		int digit = n;
		System.out.println("The Factorial of all digits of " + n + " is: ");
		while(digit >0){
			a = digit % 10;
			int fact = 1;
			if(a == 0){
				fact *= 1;
			}
			for(int i = 1; i <= a; i++){
				fact *= i;
			}
			sum += fact;
			System.out.println("The Factorial of digit " + a + " is: " + fact);
			digit /= 10;
		}
		System.out.println("The Sum of Factorial of each digit is: " + sum);
	}
}