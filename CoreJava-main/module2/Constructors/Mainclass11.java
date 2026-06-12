class Chair{
	Chair(int a){
		System.out.println("Regualar Chair");
	}
	Chair(double d){
		System.out.println("Office Chair");
	}
	Chair(String s){
		System.out.println("Reclainer Chair");
	}
}
public class Mainclass11
{
	public static void main(String[] args){
		Chair c1=new Chair(25);
		Chair c2=new Chair(4.5);
		Chair c3=new Chair("ABC");
	}
}