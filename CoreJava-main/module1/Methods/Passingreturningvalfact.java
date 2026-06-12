class Passingreturningvalfact
{
	static int finffactorial(int n)
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
		public static void main(String[] args)
		{
			for(int x=1;x<=5;x++)
			{
				System.out.println(x+" Factorial : "+finffactorial(x));
			}
		}
	
}