class Program1
{
	public static void main(String[] args)
	{
		//post operation
		int a=5;//6
		System.out.println(a++);//5
		System.out.println(a);//6
		
		int b=9;//8
		System.out.println(b--);//9
		System.out.println(b);//8
		
		int p=12;//13
		System.out.println(p++);//12
		System.out.println(p);//13
		
		int q=17;//16,15
		System.out.println(q--);//17
		System.out.println(q--);//16
		System.out.println(q);//15
		
		int x=10;//11,12
		int y=x++ + x++;
		System.out.println(y);//21
		
		int i=15;//14,13
		int j=i-- + i--;
		System.out.println(j);//29
		
		int m=14;//15,16,17
		int n= m++ + m++ + m++;
		System.out.println(n);//45
		
		int c=18;//17,16,15
		int d= c-- + c-- + c--;
		System.out.println(d);//51
		
		int h=14;//15,16
		int g=11;//10,9
		int w= h++ + g-- + h++ + g--;
		System.out.println(w);//50
		
		int e=17;//16,15
		int f=13;//14,15
		int o = e-- + f++ + e-- + f++;
		System.out.println(o);//60
		
	}
}