class Addition
{
	int sum(int a, int b)
	{
	 return a+b;
	}
}
class Subtraction
{
	int sub(int a,int b)
	{
	 return a-b;
	}
}
class Multiplication
{
	int mul(int a,int b)
	{
	 return a*b;
	}
}
class Division
{
	int div(int a,int b)
	{
	 return a/b;
	}
}
class Calculator
{
 public static void main(String args[])
	{
		System.out.println("Enter the values of a and b");
		Addition a=new Addition();
		System.out.println("sum= "+a.sum(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		Subtraction s=new Subtraction();
		System.out.println("sub= "+s.sub(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		Multiplication m=new Multiplication();
		System.out.println("mul= "+m.mul(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		Division d=new Division();
		System.out.println("div= "+d.div(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
}
		