import java.util.Scanner;
class DecimalToHexa
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Decimal Number: ");
		int Decimal = sc.nextInt();
		int digit = Decimal;
		String Hexadecimal = "";
		while(digit > 0){
			int a = digit % 16;
			if(a > 9){
				Hexadecimal = (char)(a + 55) + Hexadecimal;
			}
			else{
				Hexadecimal = (char)(a + 48) + Hexadecimal;
			}
			digit /= 16;
		}
		System.out.println("Hexadecimal Of Decimal: " + Decimal + " is in Hexadecimal: " + Hexadecimal);
	}
}