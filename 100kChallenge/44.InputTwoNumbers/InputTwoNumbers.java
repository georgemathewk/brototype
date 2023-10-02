import java.util.Scanner;
public class InputTwoNumbers{

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");

		int num1 = s.nextInt();
		int num2 = s.nextInt();

		System.out.println("You entered : " + num1 + " " +  num2);
		
	}
	
}
