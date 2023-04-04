import java.util.*;

class Product
{
	int id;
	String name;
	double price;
	

	void setter()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th ID: ");
		id=sc.nextInt();
		System.out.println("Enter the name: ");
		name=sc.next();
		System.out.println("Enter the price: ");
		price=sc.nextDouble();
	}

	void getter()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
	}

	

}

class Valuation
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a;
		int i;
		System.out.println("Enter the number of products you want to enter: ");
		a=sc.nextInt();

		Product p[] = new Product[a];
		for(i=0;i<a;i++)
		{
			p[i] = new Product();
			p[i].setter();
			p[i].calculate();
		}

		for(i=0;i<a;i++)
		{
			p[i].getter();
		}
		double val=0;
		for(i=0;i<a;i++)
		val=val+p[i].price;
		System.out.println();
		System.out.println("Valuation = "+val);
	}
}