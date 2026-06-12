class Beta
{
	int val;
	Beta()
	{
		val=100;
	}
}
public class Mainclass4
{
	public static void main(String[] args)
	{
		Beta ref=new Beta();
		System.out.println(ref.val);
	}
}