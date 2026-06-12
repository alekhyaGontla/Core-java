class Program1
{
	public static void main(String[] args)
	{
		//flipkart payment
		int choice=6;
		switch(choice)
		{
			case 1: System.out.println("COD");
			break;
			case 2: System.out.println("Card");
			break;
			case 3: System.out.println("UPI");
			break;
			case 4: System.out.println("Net Banking");
			break;
			default: System.out.println("Invalid Selection");
			
		}
		// language for mobile to choose
		int option=2;
		switch(option)
		{
			case 1: System.out.println("English");
			break;
			case 2: System.out.println("Kannada");
			break;
			case 3: System.out.println("Hindi");
			break;
			default: System.out.println("Invalid Selection");
		}
		// withdrawl amount in ATM 
		int select=2;
		switch(select)
		{
			case 1: System.out.println("Withdrawl");
			break;
			case 2: System.out.println("Checkbalance");
			break;
			case 3: System.out.println("Pin change");
			break;
			case 4: System.out.println("Mini statement");
			break;
			default: System.out.println("Invalid Selection");
			
		}
		
	}
}