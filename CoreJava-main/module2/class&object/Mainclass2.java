class Employee
{
	int eid;
	double ctc;
	void work()
	{
		System.out.println("Employee is working the EID is "+eid);
	}
	void meeting()
	{
		System.out.println("Employee is working the CTCis "+ctc);
		
	}
}
public class Mainclass2
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.eid=101;
		e1.ctc=4.5;
		e1.work();
		e1.meeting();
		System.out.println("--------------------");
		Employee e2=new Employee();
		e2.eid=101;
		e2.ctc=5.5;
		e2.work();
		e2.meeting();
		System.out.println("--------------------");
		Employee e3=new Employee();
		e3.eid=103;
		e3.ctc=3.5;
		e3.work();
		e3.meeting();
		System.out.println("--------------------");
	}
}