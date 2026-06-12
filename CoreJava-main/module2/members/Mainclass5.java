class Delta// non-static member
{
	 int x=100;
	 int y=200;
	 void disp()
	{
		System.out.println("Executing disp().....");
	}
	void play()
	{
		System.out.println("Executing play().....");
	}
}
public class Mainclass5
{
	public static void main(String[] args)
	{	
		Delta ref=new Delta();//using one object and it reuse multiple times
		System.out.println(ref.x);
		System.out.println(ref.y);
		ref.disp();
		ref.play();
	}
}