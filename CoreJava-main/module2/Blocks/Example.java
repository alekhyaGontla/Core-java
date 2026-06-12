class Example
{
	static int val;
	static{
		val=100;
	}
	static{
		val=200;
	}
	static{
		val=300;
	}
	public static void main(String[] args)
	{
		System.out.println(Example.val);
	}
}