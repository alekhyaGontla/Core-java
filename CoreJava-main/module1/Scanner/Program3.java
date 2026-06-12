import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value:");
		int n= scn.nextInt();
		if(n%2==0)
		{
			System.out.println(n+"is an Even Number");
		}
		else{
			System.out.println(n+" is an Odd Number");
		}
	}
}