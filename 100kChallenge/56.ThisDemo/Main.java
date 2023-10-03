class Main{
	int a,b;
	public static void main(String args[]){
		Main m = new Main(10,20);
		System.out.println("a : " + m.getA() );	
		System.out.println("b : " + m.getB() );	
	}

	public Main(int a , int second){
		this.a = a;
		b = second;
	}

	public int getA(){
		return a;
	}


	public int getB(){
		return b;
	}
}
