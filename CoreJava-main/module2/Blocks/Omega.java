class Omega
{
	
	{
		System.out.println("Excecuting non-static block");
	}
	public static void main(String[] args)
	{
		System.out.println("Program starts");
		Omega ref=new Omega();
		System.out.println("Program ends");
	}
}