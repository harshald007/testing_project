class Demo
{
	int a=100;
	void m1()
		{
		System.out.println("Inside test method");
		}
}
class StaticRefVar3
{
	static Demo ref = new Demo();
public static void main(String[] args)
{
	
	System.out.println("Start @ Cyber Success");
	System.out.println(ref.a);
	ref.m1();
	System.out.println("Stop @ Cyber Success");
		
}
}