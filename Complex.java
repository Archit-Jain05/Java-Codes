import java.util.*;

class Number
{
	int real;
	int img;

	Number add(Number n)
	{
		n.real=real+n.real;
		n.img=img+n.img;
		return n;
	}

	void setnum()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real part of the number:");
		real=sc.nextInt();
		System.out.println("Enter the imaginary part of the number:");
		img=sc.nextInt();
	}

	void getnum()
	{
		System.out.println("Addition = "+real+" + "+img+"i");
	}
}

class Complex
{
	public static void main(String args[])
	{
		
		Number n1=new Number();
		Number n2=new Number();
		Number n3=new Number();
		n1.setnum();
		n2.setnum();
		n3=n2.add(n1);
		n3.getnum();
	}
}