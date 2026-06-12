class Account
{
	long accNum;
	double accBal;
	void withdraw(double amt)
	{
		System.out.println("withdraw amount :"+accNum);
		accBal=accBal-amt;
		System.out.println("Available Balance :"+accBal);
	}
	void Deposit(double amt)
	{
		System.out.println("Deposit amount :"+accNum);
		accBal=accBal+amt;
		System.out.println("Available Balance :"+accBal);
	}
}
public class Mainclass5
{
	public static void main(String[] args)
	{
		Account a1=new Account();
		a1.accNum=7879767574737271L;
		a1.accBal=25000.0;
		a1.withdraw(1000.0);
		a1.Deposit(4000.0);
	}
}