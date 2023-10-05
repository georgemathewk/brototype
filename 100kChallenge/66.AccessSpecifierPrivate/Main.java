class A{
	private void privateHai(){
		System.out.println("Hai from Private");
	}
}

class Main{
	public static void main(String args[]){
		A a = new A();
		a.privateHai(); // Compilation Error : Private member has no access outside the class
	}

}
