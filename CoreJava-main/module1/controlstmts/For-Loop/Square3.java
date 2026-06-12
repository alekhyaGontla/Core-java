class Square3
{
	public static void main(String[] args)
	{
		//using increment for char to print aaaaa bbbbb ccccc ddddd eeeee
		int n=5;//sixe of square
		char ch='a';
		for(int i=0;i<n;i++)//no.of rows
		{
			for(int j=0;j<n;j++)//no.of columns
			{
				System.out.print(ch+" ");
			}
			System.out.println();//move to the next line
			ch++;
		}
		// using ch value in increment and re-initialization of the program abcde abcde abcde abcde abcde
		System.out.println("using re-initialization");
		for(int i=0;i<n;i++)//no.of rows
		{
			for(int j=0;j<n;j++)//no.of columns
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();//move to the next line
			ch='a';
		}
		
	}
}