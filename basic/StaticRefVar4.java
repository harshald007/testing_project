class Demo
{
	int a=100;
	void m1()
		{
		System.out.println("Inside test method");
		}
}
class Sample
{
	static Demo demoref = new Demo();
}
class StaticRefVar3
{
public static void main(String[] args)
{
	
	System.out.println("Start @ Cyber Success");
	System.out.println(Sample.demoref.a);
	Sample.demoref.m1();
	System.out.println("Stop @ Cyber Success");
		
}
}