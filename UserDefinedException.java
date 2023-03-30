class MyException extends Exception
{
	MyException()
	{
		System.out.println("Exception caught");
	}
}

class UserDefinedException
{
	public static void main(String args[])
	{
		try
		{
		throw(new MyException());
	}
		catch(MyException e)
		{
			System.out.println("Exception caught in main");
		}
	}
	
}