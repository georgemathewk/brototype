class B extends A{
	public void disp(){
		System.out.println("disp from B");
	}

	public void show(){
		System.out.println("show from B");
		super.show();
	}
}
