import java.util.Scanner;
class Tkipu_FactorAllSum
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt(), sum = 0;
		for(int i = 1; i <= n/2; i++){
			if(n % i == 0){
				sum += i;
			}
		}
		System.out.println("The sum of all factors of " + n + " is: " + sum);
	}
}