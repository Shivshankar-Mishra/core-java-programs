import java.util.Scanner;
class Tkipu_PowerOfNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=1;
		long pow=1;
		System.out.println("Enter The Number: "); 
		long a= sc.nextLong();
		System.out.println("Enter The power: ");
		int b= sc.nextInt();
		if(b==0){
			System.out.println(a+" To the power "+b+" is: 1");
		}
		else{
			while(i<=b){
				pow=pow*a;
				i++;
			}
			System.out.println("Power of the number "+a+" to "+b+" is: "+pow);
		}
	}
}