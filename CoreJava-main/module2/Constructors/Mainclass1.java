class Demo
{
	int x=100;
	void play()
	{
		System.out.println("Executing play()..........");
	}
}
public class Mainclass1
{
	public static void main(String[] args)
	{
		Demo ref=new Demo();
		System.out.println(ref.x);
		ref.play();
	}
}