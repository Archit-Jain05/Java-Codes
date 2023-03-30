abstract class Box
{
	double dim1,dim2;

	abstract double area();

	Box(double a,double b)
	{
		dim1=a;
		dim2=b;
	}
}

class Rectangle extends Box
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}

	final double area()
	{
		return dim1*dim2;
	}
}

class Triangle extends Box
{
	Triangle(double a,double b)
	{
		super(a,b);
	}

	final double area()
	{
		return dim1*dim2/2;
	}
}

class DemoBox
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle(5,5);
		Triangle t=new Triangle(5,5);

		System.out.println("Area of rectangle = "+r.area());
		System.out.println("Area of triangle = "+t.area());
	}
}