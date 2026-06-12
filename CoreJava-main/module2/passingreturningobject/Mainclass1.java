public class Mainclass1
{
	public static void main(String[] args)
	{
		Employee e1=new EmplpyeeHelper.createEmployee();
		EmployeeHelper.displayEmployeeDetails(e1);
		System.out.println("----------------------------------");
		Employee e2=new EmplpyeeHelper.createEmployee();
		EmployeeHelper.displayEmployeeDetails(e2);
		System.out.println("----------------------------------");
		Employee e3=new EmplpyeeHelper.createEmployee();
		EmployeeHelper.displayEmployeeDetails(e3);

		}
}