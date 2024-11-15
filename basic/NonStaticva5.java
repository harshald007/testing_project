class Demo3
{
	int a=100;
	static float b;
}
class Sample
{
	static int x;
	float y=200.5f;
	
}
class NonStaticvar5
{
public static void main(String[] args)
{
	Sample s=new Sample();
	Demo3 d = new Demo3();
	
	
	Sample.x=d.a;
	Demo3.b=s.y;
	
	System.out.println(Sample.x);
	System.out.println(Demo3.b);
		
}
}