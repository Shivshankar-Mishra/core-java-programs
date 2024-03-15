import java.util.Scanner;
public class Coin{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number,one,two,five;
	  number= s.nextInt();
        five=(number-4)/5;
        if((number-five)%2==0){
            one= 2;
        }
        else{
            one=1;
        }
        two=((number-five-one)/2);
        System.out.println("1's rs coin: "+ one);
        System.out.println("2's rs coin: "+ two);
        System.out.println("5's rs coin: "+ five);
           
        
        
    }
}