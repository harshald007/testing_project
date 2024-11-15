class Demo1
{
	int a=100;
}
class Sample
{
	void m1()
		{
		System.out.println("Inside test method");
		}
}
class Cyber1
{
	Sample ref1;
		//ref1-> Sample
}
class Success1
{
	Demo1 ref2;
	 //ref2-> Demo
}
class NonStaticRefVar5
{
public static void main(String[] args)
{
	StaticRefVar5 ref = new StaticRefVar5();
	Cyber1 cbr = new Cyber1();
	cbr.ref1 = new Sample();
	cbr.ref1.m1();
	Success1 suc = new Success1();
	suc.ref2 = new Demo1();
	System.out.println(suc.ref2.a);
	System.out.println("Start @ Cyber Success");
	System.out.println("Stop @ Cyber Success");
}
}