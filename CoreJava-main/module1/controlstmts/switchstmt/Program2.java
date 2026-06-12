class Program2
{
	public static void main(String[] args)
	{
		// by using character char
		char choice='D';
		switch(choice)
		{
			case 'A': System.out.println("Apple");
			break;
			case 'B': System.out.println("Ball");
			break;
			case 'C': System.out.println("Cat");
			break;
			case 'D': System.out.println("Dog");
			break;
			default: System.out.println("Under Development");
		}
		// by using values in switch case
		int value=40;
		switch(value)
		{
			case 10: System.out.println("Frooti");
			break;
			case 20: System.out.println("Hide and Seek");
			break;
			case 30: System.out.println("Lays");
			break;
			case 40: System.out.println("Chocolate");
			break;
			default: System.out.println("Invalid amount");
			
		}
	}
}