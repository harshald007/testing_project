class Demo
{
	static char x='a';
}

class Staticvar4
{
public static void main(String[] args)
{
	
	//System.out.println(x); directly not valid
	System.out.println(Demo.x);
}
}