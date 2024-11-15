class Demo3
{
	static int a=100;	
}
class Sample
{
	static float x=200.5f;
}
class Cyber
{
	static float result;
	void result()
{
	System.out.println(result);
}
}
class NonStaticvar4
{
public static void main(String[] args)
{	
	NonStaticvar4 ref = new NonStaticvar4();
	Sample S = new Sample();
	Demo3 D = new Demo3();
	Cyber C = new Cyber();
	
	C.result = D.a+S.x;
	//System.out.println(result);
	C.result();
	
	//return C.result();
	
	//System.out.println(Sample.x);
	//System.out.println(Demo3.a);
	
}
}