import java.util.Scanner;

public class Main{
	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		double n1, n2, result = 1;
		int op;
		Calc c = new Calc();

		System.out.println("Enter 2 numbers: ");
		n1 = s.nextDouble();
		n2 = s.nextDouble();
	
		System.out.println("Enter :");
		System.out.println("1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division");
		op = s.nextInt();

		switch(op){
			case 1:
				result = c.sum(n1, n2);
				break;
			case 2:
				result = c.sub(n1, n2);
				break;
			case 3:
				result = c.mul(n1, n2);
				break;
			case 4:
				result = c.div(n1, n2);
				break;
			default:
				System.out.println("Invalid Operation");

		}

		System.out.println("Result : " + result);

	
	}
}
