class Delta
{
	int x;
	double y;
	char z;
	{
		x=20;
		y=5.5;
		z='Q';
	}
	public static void main(String [] args)
	{
		System.out.println("Progarm starts");
		Delta ref=new Delta();
		System.out.println(ref.x);
		System.out.println(ref.y);
		System.out.println(ref.z);
		System.out.println("Progarm ends");
	}
}