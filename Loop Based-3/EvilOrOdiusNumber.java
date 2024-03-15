import java.util.Scanner;
class EvilOrOdiusNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Decimal Number: ");
		int Decimal = sc.nextInt();
		int digit = Decimal, Binary = 0, base = 1, count = 0;
		while(digit > 0){
			int a = digit % 2;
			Binary += a * base;
			base *= 10;
			digit /= 2;
		}
		while(Binary > 0){
			int rem = Binary % 10;
			if(rem == 1){
				count++;
			}
			Binary /= 10;
		}
		if(count % 2 == 0){
			System.out.println(Decimal + " is Evil Number");
		}
		else{
			System.out.println(Decimal + " is Odius Number");
		}
	}
}