import java.util.Scanner;
class DisariumNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check: ");
		int n = sc.nextInt();
		int x = n, y = n, a = 0, sum = 0;
		while(x > 0){
			a++;
			x /= 10;
		}
		while(y > 0){
			int b = y % 10;
			int pow = 1;
			for(int i = 1; i <= a; i++){
				pow *= b;
			}
			sum += pow;
			y /=10;
			a--;
		}
		if(n == sum){
			System.out.println(n + " is Disarium Number");
		}
		else{
			System.out.println(n + " is not a Disarium Number");
		}
	}
}