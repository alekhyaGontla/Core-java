import java.util.Scanner;//step1
class Program2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);//step2
		System.out.println("Enter the value:");
		int num=scn.nextInt();//step3
		int square=num*num;
		System.out.println("Result:"+square);
	}
}