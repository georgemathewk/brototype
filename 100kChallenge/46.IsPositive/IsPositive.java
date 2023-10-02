import java.util.Scanner;

public class IsPositive{
	public static void main(String arg[]){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = s.nextInt();

		if(n < 0){
			System.out.println("Number is Negative");
		}else{
			System.out.println("Number is Positive");
		}		
			

	}
}
