class Program7
{
	static void play(boolean bool)
	{
		System.out.println("Passed value:"+bool);
	}
	static void test(char ch)
	{
		System.out.println("Value:"+ch);
	}
	public static void main(String[] args)
	{
		test('J');
		play(true);
	}
}