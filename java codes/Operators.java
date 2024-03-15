public class Operators{
	public static void main(String[] args) {
		System.out.println("1: Arithmatic Operators");
		int a=20,b=30,sum,sub,mul,div,rem;
		sum=a+b;
		System.out.println("sum:"+sum);
		sub=b-a;
		System.out.println("substraction:"+sub);
		mul=a*b;
		System.out.println("multiplication:"+mul);
		div= b/a;
		System.out.println("division:"+div);
		rem= b%a;
		System.out.println("remainder:"+rem);
		System.out.println("2: Assignment Operators");
		System.out.println(a==30);
		System.out.println(b==20);
		System.out.println("3: Comparision Operators");
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println("4: Logical Operators");
		System.out.println(a>5&&a<40);
		System.out.println(b<40&&b>20);
		System.out.println("5: Bitwise operators");
		System.out.println("a&b:"+(a&b));

	}
}