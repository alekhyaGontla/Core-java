class Alpha
{
	static double p=10.0;
	static char q='A';
	static void help()
	{
		System.out.println("Executing help().....");
	}
	static void send()
	{
		System.out.println("Executing send().....");
	}
}
public class Mainclass3
{
	public static void main(String[] args)
	{
		System.out.println(Alpha.p);
		System.out.println(Alpha.q);
		Alpha.help();
		Alpha.send();
	}
}