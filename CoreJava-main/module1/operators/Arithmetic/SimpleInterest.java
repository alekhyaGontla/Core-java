class SimpleInterest
{
	public static void main(String[] args)
	{
		double principle=100000.0;
		double rate=11.5;
		int tenure=2;
		double SimpleInterest=(principle*tenure*rate)/100;
		System.out.println("Simple Interest:" +SimpleInterest);
		
		double totalRepayment=principle+SimpleInterest;
		System.out.println("TotalRepayment: "+totalRepayment);
		
		double emi=totalRepayment/(tenure*12);
		System.out.println("EMI :"+emi);
	}
}