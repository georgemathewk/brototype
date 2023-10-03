import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		int n1,n2, result;
		Scanner s = new Scanner(System.in);
		Calc c = new Calc();

		System.out.print("Enter 2 numbers : ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		result =  c.sum(n1,n2);
		System.out.println("Sum : " + result);


	}
}
