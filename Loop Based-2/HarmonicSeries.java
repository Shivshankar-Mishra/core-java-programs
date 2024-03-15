import java.util.Scanner;
class HarmonicSeries
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		double sum = 1.0;
		for(double i = 2; i <= n; i++){
			sum += 1 / i;
		}
		System.out.println("The sum of Harmonic Series is: " + sum);
	}
}
		