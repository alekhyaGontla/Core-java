class Program7
{
	public static void main(String[] args)
	{   
	    // nested-if statement
		int n=8;
		if(n>0)
		{
			if(n%2==0)
			{
				System.out.println("Pani poori");
			}
				else
				{
					System.out.println("Sev poori");
				}
			
		}
		else
		{
			if(n%2==0)
			{
				System.out.println("Bhale poori");
			}
			else
			{
				System.out.println("Dahi poori");
			}
		}
	}
}