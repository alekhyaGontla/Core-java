class RecursionExample3
{
	static void findfactorial(int n,int fact)
	{
		fact=fact*n;
		n--;
		if(n>1)
		{
			findfactorial(n,fact);
			
		}
		else
		{
			System.out.println("Factorial :"+fact);
		}
		
	}	
	public static void main(String[] args)
	{
		findfactorial(5,1);
	}
}