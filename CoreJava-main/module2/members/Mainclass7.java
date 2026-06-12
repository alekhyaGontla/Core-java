class Utility
{
	static int p=25;
	int q=50;
	static void test()
	{
		System.out.println("Executing test().....");
	}
	void disp()
	{
		System.out.println("Executing disp().....");
	}
}
public class Mainclass7
{
	public static void main(String[] args)
	{
		System.out.println(Utility.p);
		Utility obj=new Utility();
		System.out.println(obj.q);
		Utility.test();
		obj.disp();
	}
}