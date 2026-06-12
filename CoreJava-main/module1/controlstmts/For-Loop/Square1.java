class Square1
{
	public static void main(String[] args)
	{
		int n=5;//sixe of square
		for(int i=0;i<n;i++)//no.of rows
		{
			for(int j=0;j<n;j++)//no.of columns
			{
				System.out.print("*"+" ");
			}
			System.out.println();//move to the next line
		}
		
		//using  value increment and re-intilialization it give 12345 12345 12345 12345 12345
		int val=1;
		for(int i=0;i<n;i++)//no.of rows
		{
			for(int j=0;j<n;j++)//no.of columns
			{
				System.out.print(val+" ");
				val++;
			}
			System.out.println();//move to the next line
			val=1;
		}
		
	}
}