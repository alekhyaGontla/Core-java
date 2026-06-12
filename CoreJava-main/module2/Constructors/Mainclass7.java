class Amazon
{
	Amazon()
	{
		System.out.println("Intitialze shopping");
	}
	Amazon(double subscription)
	{
		System.out.println("Intitialze shopping");
		System.out.println("Intitialze Prime video");
		System.out.println("Intitialze Prime music");
	}
}
public class Mainclass7
{
	public static void main(String[] args)
	{
		Amazon regular=new Amazon();
		System.out.println("--------------------");
		Amazon prime=new Amazon( 1299.0);
	}
}