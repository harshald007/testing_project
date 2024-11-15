class Cyber
{
	int x=100;
}
class Success
{
	static int y=200;
}
class Training
{
	int temp;
}
class NonStaticvar7
{
public static void main(String[] args)
{
	Cyber C =new Cyber();
	Success S = new Success();
	Training T = new Training();
	
	T.temp=C.x;
	C.x=S.y;
	S.y=T.temp;
	
	System.out.println(T.temp);
	System.out.println(C.x);
	System.out.println(S.y);
		
}
}