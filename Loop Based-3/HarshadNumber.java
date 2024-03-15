import java.util.Scanner;
class HarshadNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check: ");
		int n = sc.nextInt();
		int sum = 0, digit = n, a = 0;
		while( digit > 0){
			a = digit % 10;
			sum += a;
			digit /= 10;
		}
		if(n % sum == 0){
			System.out.println(n + " is a Harshad Number");
		}
		else{
			System.out.println(n + " is not a Harshad Number");
		}
	}
}