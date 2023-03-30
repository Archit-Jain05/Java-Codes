//experiment 3//

class Box
{
	double width,depth,height,vol;


	Box(double w, double d, double h)
	{
		width=w;
		depth=d;
		height=h;
	}

}

class BoxWeight extends Box
{
	double weight;

	BoxWeight(double w,double d,double h,double we)
	{
		super(w,d,h);
		weight=we;
	}
}

class Shipment extends BoxWeight
{
	double cost;

	Shipment(double w,double d,double h,double we,double co)
	{
		super(w,d,h,we);
		cost=co;
	}

	void getter()
	{
		System.out.println("Width: "+width);
		System.out.println("Height: "+height);
		System.out.println("Depth: "+depth);
		System.out.println("Weight: "+weight+"Kg");
		System.out.println("Cost: "+cost+"rs");
	}
}

class BoxMain
{
	public static void main(String args[])
	{
		Shipment s=new Shipment(10,20,20,30,400);
		s.getter();


	}
}

