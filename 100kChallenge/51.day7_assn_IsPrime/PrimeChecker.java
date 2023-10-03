class PrimeChecker{
	public boolean isPrime(int n){
		boolean flag = true;
		for(int i=2;  i<=n/2 ;i++){
			if(n%i ==0){
				flag = false;
				break;
			}
		}
		return flag;
	}
}
