import java.util.Scanner;//step1
class Program7
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);//step2
		System.out.println("Enter the value:");
		int val=scn.nextLine().charAt(0);//step3
		System.out.println("Value:"+val);
	}
}