class Program2
{
	public static void main(String[] args)
	{
		//Pre operation
		int a=7;//8
		System.out.println(++a);//8
		System.out.println(a);//8
		
		int b=5;//4
		System.out.println(--b);//4
		System.out.println(b);//4
		
		int x=10;//11,12
		System.out.println(++x);//11
		System.out.println(++x);//12
		System.out.println(x);//12
		
		int y=17;//16,15
		System.out.println(--y);//16
		System.out.println(--y);//15
		System.out.println(y);//15
		
		int i=12;//13,14
		int j= ++i + ++i;
		System.out.println(j);//27
		
		int c=14;//13,12
		int d= --c + --c;
		System.out.println(d);//25
		
		int p=15;// 16,17,18
		int q= ++p + ++p + ++p;
		System.out.println(q);//51
		
		int r=18;//17,16,15
		int s= --r + --r + --r;
		System.out.println(s);//48
		
		int m=13;//14,15
		int n=15;//14,13
		int o= ++m + --n + ++m + --n;
		System.out.println(o); //56
		
		int u=8;//7,6
		int v=5;//6,7
		int w= --u + ++v + --u + ++v;
		System.out.println(w);//26
	}
}