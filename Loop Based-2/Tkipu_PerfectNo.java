import java.util.Scanner;
class Tkipu_PerfectNo
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
		if(n == sum){
			System.out.println(n + " is perfect number");
		}
		else{
			System.out.println(n + " is not perfect number");
		}
	}
}