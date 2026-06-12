class Program3
{
	public static void main(String[] args)
	{
		int i=27; //11001--011001
		int j=55; //110111
		System.out.println(i&j);
		System.out.println(i|j);
		System.out.println(i^j);
		
		// Bitwise leftshift(<<) operator
		int a=10;
		System.out.println(a<<1);//20
		int b=13;
		System.out.println(b<<1);//26
		int c=21;
		System.out.println(c<<1);//42
		int p=12;
		System.out.println(p<<2);//48
		int q=9;
		System.out.println(q<<2);//36
		int r=11;
		System.out.println(r<<3);//88
		int s=13;
		System.out.println(s<<3);//104
		
		//Bitwise rightshift(>>) operator
		int x=21;
		System.out.println(x>>1);//10
		int y=27;
		System.out.println(y>>1);//13
		int z=25;
		System.out.println(z>>1);//12
		int u=45;
		System.out.println(u>>2);//11
		int v=84;
		System.out.println(v>>2);//21
		int w=143;
		System.out.println(w>>3);//17
		
		
		
		
	}
}