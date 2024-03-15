import java.util.Scanner;
class FibonacciSeriesUptoN
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Digit till print the Fibonacci Series: ");
		int n = sc.nextInt();
		int first = 0, second = 1, next;
		System.out.println("Fibonacci Series Upto " +n+ " terms:");
		for(int i = 0; i<=n; i++)
		{
			System.out.print(first + "  ");
			next = first + second;
			first = second;
			second = next;
		}
	}
}