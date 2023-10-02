import java.util.Scanner;

public class AvgOfThreeNumbers{

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n1,n2,n3,avg;

		System.out.print("Enter 3 Numbers:");
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();

		avg = ( n1 + n2 + n3 ) / 3;
		System.out.println("Average : " + avg);

	}

}
