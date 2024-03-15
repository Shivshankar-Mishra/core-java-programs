import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  to check: ");
		int n = sc.nextInt();
		int digit = n, square = n*n, val = 0, a = 1, count = 0;
		while(digit > 0){
			count++;
			digit /= 10;
		}
		for(int i = 1; i <= count; i++){
			a *= 10;
		}
		val = square % a;
		if(n == val){
			System.out.println(n + " is Automorphic number");
		}
		else{
			System.out.println(n + " is not a Automorphic number");
		}
	}
}