class Email
{
	String from;
	String to;
	void send()
	{
		System.out.println("Email sent from "+from+"to"+to);
	}
	void recieve()
	{
		System.out.println("Email recieved from "+from+"to"+to);
	}
}
public class Mainclass6
{
	public static void main(String[] args)
	{
		Email e1=new Email();
		e1.from="kumar@gmail.com";
		e1.from="ram@yahoo.com";
		e1.send();
		System.out.println("-----------------------------------");
		Email e2=new Email();
		e2.from="amar@gmail.com";
		e2.from="ram@hotmail.com";
		e2.recieve();
	}
}