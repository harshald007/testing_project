class NonStaticVar8
	{
		public static void main(String[] args)
	{
			System.out.println("start @ cyber success");
			NonStaticVar8 ref = new NonStaticVar8();
			ref.m1();
			System.out.println("stop @ cyber success");		
	}
	void m1()
		{
			System.out.println("method inside m1");
		}
}