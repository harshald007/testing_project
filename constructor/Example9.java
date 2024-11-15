class Example9
{	int a;
	Example9(int a)
	{
		this();
		this.a=a;
		System.out.println("Inside 1 arg const"+this.a);
	}
Example9()
{
System.out.println("Inside 0 arg const");
}
public static void main (String[] args)
{
	System.out.println("start @ Cyber success");
	new Example9(10);
	System.out.println("Stop @ Cyber success");
}
}