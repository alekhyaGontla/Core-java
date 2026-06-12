import java.util.Scanner;//step1
class Program6
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);//step2
		System.out.println("Enter the value:");
		String str=scn.nextLine();//step3
		System.out.println("Value:"+str);
	}
}
//next()=it can read only one word
//nextLine()= it can read multiple words