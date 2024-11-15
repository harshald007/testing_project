import inheritance.A;
import inheritance.B;

class A
{
	static int method2(int a)
	{
		int result1=a+100;
		return result1;
	}
}
class B
{
	static float method1(float b)
	{
		
	float result2=b+200;
	return result2;
	}
}
class StaticMethod10{
public static void main(String[] args)
	{
	int a=10;
	float b=20.5f;
	 float result2= B.method1(b);
	 int result1= A.method2(a);
	System.out.println(result1+result2);
	}
}