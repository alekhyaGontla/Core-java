class Sample
{
	static int x=25;
	static int y=50;
	static void disp()
	{
		System.out.println("Executing disp().....");
	}
	static void play()
	{
		System.out.println("Executing play().....");
	}
}
public class Mainclass2
{
	public static void main(String[] args)
	{
		System.out.println(Sample.x);
		System.out.println(Sample.y);
		Sample.disp();
		Sample.play();
	}
}