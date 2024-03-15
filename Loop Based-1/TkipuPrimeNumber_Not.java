import java.util.Scanner;
class TkipuPrimeNumber_Not
{
	public static void main(String [] args)
	{
		int i=1,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n= sc.nextInt();
		while(i<=n){
			if(n==0 && n==1){
				System.out.println(n+" : is not prime number");
			}
			else if(n%i==0){
				count++;
			}
			i++;
		}
		if(count==2){
			System.out.println(n+": is Prime Number");
		}
		else{
			System.out.println(n+": is not Prime Number");
		}
	}
}