class Strsplit
{
	public static void main(String[] args)//string:split()
	{
		String str="Qspiders Pyspiders Jspiders Prospiders";
		String[] arr=str.split("i");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}