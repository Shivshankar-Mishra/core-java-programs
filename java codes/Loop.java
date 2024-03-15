public class Loop{
public static void main(String[] args){
int a= 0;
System.out.println("1: While Loop");
while(a<=10)
	{
		System.out.println(a);
		a+=1;
	}
System.out.println("2: Do While Loop");
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
System.out.println("3: For Loop");
for(a=0;a<=20;a+=2)
	{
		System.out.println(a);
	}
System.out.println("4: For Each Loop");
int [] arr={5,10,15,20,25,30,35,40,45,50};
for (int b : arr)
	{
		System.out.println(b);
	}

 }
}