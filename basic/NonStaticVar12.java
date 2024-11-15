class NonStaticVar12
	{
		public static void main(String[] args)
	{
			System.out.println("start @ cyber success");
			int a= 10;
			float b= 2.13f;

			NonStaticVar9  ref = new NonStaticVar9();

			float result = ref.m1(b,a);

			System.out.println(result);	

			System.out.println("stop @ cyber success");		
	}
	float m1(float b,int a){
			System.out.println("inside m1 method");
			float result= a+b;
			return result;
		}
}