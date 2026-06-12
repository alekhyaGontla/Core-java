class Square2
{
	public static void main(String[] args)
	{
		//using increment tp print 11111 22222 33333 44444 55555 in square
		int n=5;//sixe of square
		int val=1;
		for(int i=0;i<n;i++)//no.of rows
		{
			for(int j=0;j<n;j++)//no.of columns
			{
				System.out.print(val+" ");
			}
			System.out.println();//move to the next line
			val++;
		}
		
		// using 123 without increment
		
		for(int i=0;i<n;i++)//no.of rows
		{
			for(int j=0;j<n;j++)//no.of columns
			{
				System.out.print(i+1+" ");
			}
			System.out.println();//move to the next line
			
		}
		int s=5;
		for(int i=n;i>0;i--)//no.of rows
		{
			for(int j=n;j>0;j--)//no.of columns
			{
				System.out.print(s+" ");
			}
			System.out.println();//move to the next line
			s--;
		}
		int f=5;
		System.out.println();
		for(int i=n;i>0;i--)//no.of rows
		{
			for(int j=n;j>0;j--)//no.of columns
			{
				System.out.print(f+" ");
				f--;
			}
			System.out.println();//move to the next line
			f=5;
		}
		
	}
}