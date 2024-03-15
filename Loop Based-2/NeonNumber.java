import java.util.Scanner;
class NeonNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check: ");
		int n = sc.nextInt();
		int digit = n * n, a = 0, sum = 0;
		while(digit > 0){
			a = digit % 10;
			sum += a;
			digit /= 10;
		}
		if(n == sum){
			System.out.println(n + " is Neon Number");
		}
		else{
			System.out.println(n + " is not a Neon Number");
		}
	}
}