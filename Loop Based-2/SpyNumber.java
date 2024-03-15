import java.util.Scanner;
class SpyNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check: ");
		int n = sc.nextInt();
		int digit = n, a = 0, sum = 0, product = 1;
		while(digit > 0){
			a = digit % 10;
			sum += a;
			product *= a;
			digit /= 10;
		}
		if(product == sum){
			System.out.println(n + " is Spy Number");
		}
		else{
			System.out.println(n + " is not a Spy Number");
		}
	}
}