public class Main{

	public static void main(String args[]){
		MyThread t1 = new MyThread(1);
		MyThread t2 = new MyThread(2);
		MyThread t3 = new MyThread(3);
		t1.start();
		t2.start();
		t3.start();
	}

}

class MyThread extends Thread{
	int a;
	public MyThread(int a){
		this.a = a;
	}
	
	public void run(){
		try{
			for(int i=0; i<10; i++){
				System.out.println("a="+a + ", i=" + i);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	

}
