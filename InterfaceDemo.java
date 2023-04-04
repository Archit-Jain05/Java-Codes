interface Box
{
	abstract void area();
}

class Demo implements Box
{
	 public void area()
	{
		int a=2;
		int b=4;

		System.out.println("Area = "+(a*b));
	}
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();

		d1.area();
	}
}