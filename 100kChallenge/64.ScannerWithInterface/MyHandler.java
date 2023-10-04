class MyHandler implements Handler{
	public void onScanningDone(String text){
		System.out.println("Scanned : " + text);
	}
}
