class Example8
{int a;
	void m1(int a)
	{
		
		this.a=a;
		System.out.println("Inaside 1 arg m1 method");
		this.a=a;
		System.out.println(this.a);
	}
	Example8()
	{
		this(10);
		System.out.println("good");
	}
	Example8(int a)
	{
		System.out.println("good");
	}
public static void main (String [] args)
{
	System.out.println("start @ Cyber success");
	new Example8().m1(10);
	System.out.println("Stop @ Cyber success");
}
}