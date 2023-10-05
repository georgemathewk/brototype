class Main{
	public static void main(String args[]){
		MyThread m1 = new MyThread(1);
		MyThread m2 = new MyThread(2);


		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);

		t1.start();
		t2.start();
	}
}

class MyThread implements Runnable{
	int a;

	public MyThread(int a){
		this.a = a;
	}

	public void run(){
		try{
			for(int i=0; i<10; i++){
				System.out.println("a="+a+", i=" + i);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}
}
