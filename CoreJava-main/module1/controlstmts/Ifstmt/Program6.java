class Program6
{
	public static void main(String[] args)
	{
		char ch='4';
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper case");
		}
		else if (ch>='a' && ch<='z')
		{
			System.out.println("Lower case");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("Number");
		}
		else
		{
			System.out.println("Special character");
		}
	}
	
}