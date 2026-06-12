class Beta
{
	 int a=10;
	 void test()
	{
		System.out.println("Executing test().....");
	}
}
public class Mainclass4
{
	public static void main(String[] args)
	{
		System.out.println(new Beta().a);
		new Beta().test();
	}
}