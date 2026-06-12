class Program8
{
	public static void main(String[] args)
	{
		double accbal=10000.0;
		int amt=1300;
		if(amt<=accbal)
		{
			if(amt%100==0)
			{
				System.out.println("Withdrawl success");
			}
			else
			{
				System.out.println("Invalid Denomination");
			}
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}