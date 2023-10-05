class A{
	protected void protectedHai(){
		System.out.println("Protected are accessible from same package or subclasses of different packages");
	}
}

class Main{
	public static void main(String args[]){
		A a = new A();
		a.protectedHai();
	}

}
