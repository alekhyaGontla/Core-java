class Example
{
	double num=10.0;
	char val='C';
	void help()
	{
		System.out.println("Executing help().....");
	}
	static void send()
	{
		System.out.println("Executing send().....");
	}
}
public class Mainclass6
{
	public static void main(String[] args)
	{
		Example ref=new Example();
		System.out.println(ref.num);
		System.out.println(ref.val);
		ref.help();
		ref.send();
	}
}