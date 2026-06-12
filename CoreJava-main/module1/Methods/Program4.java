class Program4
{
	static void test()
	{
		System.out.println("test starts");
		System.out.println("test ends");
		
	}
	static void play()
	{
		System.out.println("play starts");
		test();
		System.out.println("play ends");
	}
	public static void main(String[] args)
	{
		System.out.println("main starts");
		play();
		System.out.println("main ends");
	}
}