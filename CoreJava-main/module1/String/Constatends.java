class Constatends
{
	public static void main(String[] args) // strings:contains(),startsWith(),endsWith().
	{
		String str="Engineering";
		System.out.println(str.contains("job"));
		System.out.println(str.contains("gin"));
		
		System.out.println(str.startsWith("eng"));
		System.out.println(str.startsWith("Engine"));
		
		System.out.println(str.endsWith("r ing"));
		System.out.println(str.endsWith("ing"));
	}
}