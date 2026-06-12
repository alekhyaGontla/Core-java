class Returningvalue2
{
	static char play()
	{
		return 'J';
	}
	static boolean verify()
	{
		return true;
	}
	public static void main(String[] args)
	{
		char ch=play();
		System.out.println("Returned Value :" +ch);
		System.out.println("Value Returned :" +verify());
		
		
	}
}