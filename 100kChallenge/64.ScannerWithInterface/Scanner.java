class Scanner{
	Handler h;
	public Scanner(Handler h){
		this.h = h;
	}
	public void scan(){
		String text = "Scanned Text";
		h.onScanningDone(text);
	}
}
