import java.util.Scanner;

public class SumUptoN{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n =0, sum = 0;

		System.out.print("Enter a number: ");
		n = s.nextInt();

		for(int i=0; i<=n; i++){
			sum = sum + i ;
		}

		System.out.println("Sum : " + sum);
	}
}
