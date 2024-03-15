import java.util.Scanner;
public class AbleVote{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("entaer your age: ");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("you are able to vote");
		}
		else{
			System.out.println("you are not able to vote");
		}
	}
}