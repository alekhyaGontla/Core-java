import java.util.Scanner;
class Program4
{
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter 1st value:");
		double num1=reader.nextDouble();
		System.out.println("Enter 2nd value:");
		double num2=reader.nextDouble();
		double sum=num1+num2;
		System.out.println("Result:"+sum);
		
	}
}