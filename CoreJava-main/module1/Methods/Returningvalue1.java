class Returningvalue1
{
	static double help()
	{
		return 4.5;
	}
	public static void main(String[] args)
	{
		double val=help();
		System.out.println("Returned Value :" +val);
		System.out.println("Value Returned :" +help());
		
		
	}
}