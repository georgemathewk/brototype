class MyHandler extends Handler{
	public void onScanningDone(String text){
		System.out.println("Scanned Text: " + text);
	}
}
