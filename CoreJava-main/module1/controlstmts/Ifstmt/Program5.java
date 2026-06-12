class Program5
{
	public static void main(String[] args)
	{
		double percentage=92.4;
		if(percentage>=85)
		{
			System.out.println("Distinction");
		}
		else if (percentage>=60 && percentage<85)
		{
			System.out.println("First Class");
		}
		else if(percentage>=50 && percentage<60)
		{
			System.out.println("Second class");
		}
		else if(percentage>=35 && percentage<50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}