class Alpha
{
	int a;
	char b;
	double c;
	Alpha()
	{
		System.out.println("Alpha() Constructor");
		a=10;
		b='J';
		c=2.7;	
	}
}
public class Mainclass3
{
	public static void main(String[] args)
	{
		Alpha ref = new Alpha();
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println(ref.c);	
	}
}