class Pen
{
	String type;
	String color;
	void write()
	{
		System.out.println("type of pen:"+type);
		
	}
	void draw()
	{
		System.out.println("color of pen:"+color);
	}
}
public class Mainclass9
{
	public static void main(String[] args)
	{
		Pen p1=new Pen();
		p1.type="bitco";
		p1.color="blue";
		p1.write();
		p1.draw();
	}
}