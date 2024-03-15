import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Decimal Number: ");
		int Decimal = sc.nextInt();
		int digit = Decimal, Binary = 0, base = 1;
		while(digit > 0){
			int a = digit % 2;
			Binary += a * base;
			base *= 10;
			digit /= 2;
		}
		System.out.println("Binary Of Decimal: " + Decimal + " is in Binary: " + Binary);
	}
}