class Main{

	public static void main(String args[]){
		Main m = new Main();
		m.greet();
		m.greet("George");
	}
	
	void greet(){
		System.out.println("Hai");
	}

	void greet(String name){
		System.out.println("Hai " + name);
	}
}
