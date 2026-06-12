class Fibonacci
{
	public static void main(String[] args)
	{
		int a=0, b=1;
		int sum=0,s=2;
		System.out.println(a);
		System.out.println(b);
		while(s<10)
		{
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			s++;
		}
		
		//----or-----
		
		/*int n=10;
		int f1=0, f2=1,f3=0;
		
		System.out.println(f1+" "+f2);
		
		for(int i=1;i<=n-2;i++)
		{
			sum=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			
		}*/
	}
}