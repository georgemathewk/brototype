class Scanner{
	Handler h;
	public Scanner(Handler h){
		this.h = h;
	}

	public void scan(){
		String scannedText = "You have scanned this text";
		System.out.println("Scanning done");
		h.onScanningDone(scannedText);
	}
}
