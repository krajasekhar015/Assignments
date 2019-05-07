class A
{
	int a;
	void disp()
	{
	 System.out.println("Display class");
	}
}
class B extends A
{
	int b;
	void show()
	{
	 System.out.println("Show class");
	 a=100;
	 b=200;
	 System.out.println("Value of A="+a);
	 System.out.println("Value of B="+b);
	}
}
class Inheritance
{
	public static void main(String args[])
	{
	 System.out.println("Create object wrt B");
	 B b=new B();
	 b.disp();
	 b.show();
	}
}