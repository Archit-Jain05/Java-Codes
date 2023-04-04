import java.util.*;

class Person
{
	String name;
	int age;

}

class Faculty extends Person
{
	int id;
	int exp;
	double b_pay;
	double gross;

	void setter()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID:");
		id=sc.nextInt();
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the age:");
		age=sc.nextInt();
		System.out.println("Enter the amount of Experience:");
		exp=sc.nextInt();
		System.out.println("Enter the basic pay:");
		b_pay=sc.nextDouble();
	}

	void getter()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Experience: "+exp);
		System.out.println("Basic pay: "+b_pay);
		System.out.println("Gross salary: "+gross);
	}

	double calSal()
	{
		gross=b_pay+(b_pay*0.75)+(b_pay*0.10)+(b_pay*0.35);
		return gross;
	}
}

class PersonInfo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number of person detail you want to enter: ");
		n=sc.nextInt();
		Faculty f[] = new Faculty[n];
		for(i=0;i<n;i++)
		{
			f[i] = new Faculty();
			f[i].setter();
			f[i].calSal();
			System.out.println();

		}

		for(i=0;i<n;i++)
		{
			f[i].getter();
			System.out.println();
		}
	}
}