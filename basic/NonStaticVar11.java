class Demo
	{	float m1(int a)
		{	float result1 = a+100.5f;
			return result1;
		}
	}
class Sample
	{	float m2(float b)
		{	float result2 = b+ 200;
			return result2;
		}
	}
class NonStaticVar11
	{
		public static void main(String[] args)
	{
			System.out.println("start @ cyber success");
			int a= 10;
			float b= 2.13f;
			NonStaticVar9 ref = new NonStaticVar9();
			Sample s1 = new Sample();
			Demo   d1 = new Demo();
			float result1 = d1.m1(a);
			float result2= s1.m2(b);
			System.out.println("Demo 1 result"+result1);
			System.out.println("Sample 2 result"+result2);		
			System.out.println("stop @ cyber success");		
	}
}