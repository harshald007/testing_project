class Demo3
{
	static float a=20.5f;
}
class Staticvar5
{
	int b=1;
public static void main(String[] args)
{
	Staticvar5 B = new Staticvar5();
	float result = Demo3.a+B.b;
	//System.out.println(x); directly not valid
	System.out.println(result);
}
}