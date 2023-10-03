import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n;
	
		System.out.println("Enter a number: ");
		n = s.nextInt();

		PrimeChecker c = new PrimeChecker();
		if(c.isPrime(n)){
			System.out.println("The number is prime");
		}else{
			System.out.println("The number is not prime");
		}
	}
}
