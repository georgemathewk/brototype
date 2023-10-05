import java.lang.*;
class Main{
	public static void main(String args[]){
		try{
			int a[] = new int[4];
			a[4] = 5; // Error
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}
	}
}
