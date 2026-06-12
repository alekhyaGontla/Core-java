class Passingreturningval
{
	static boolean check(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		public static void main(String[] args)
		{
			boolean bool=check(12);
			System.out.println("value:"+bool);
			
			System.out.println("value:" +check(15));
			
		}		
	
}