import java.util.Scanner;
class NtermSumNseries
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int sum = 0, m = 9;
		for(int i = 1; i <= n; i++){
			sum += (sum * 10 + m);
			
		}
		System.out.println("The sum of " + m + " of " + n + "-term is: " + sum);
	}
}
		