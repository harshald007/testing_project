class Demo3
{
	boolean status = true;
}
class NonStaticvar6
{
public static void main(String[] args)
{
	Demo3 d = new Demo3();
	boolean result =d.status;
	System.out.println(result);
}
}