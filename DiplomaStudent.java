import java.util.*;
class InvalidSemException extends Exception
{
	private int detail;
	InvalidSemException(int sem)
	{
		detail=sem;
	}
	public String toString()
	{
		String s;
		s=" "+detail;
		return s;
	}
}
class DiplomaStudent
{
	static void compute(int sem) throws InvalidSemException
	{
		System.out.println("called compute"+sem);
		if(sem<1 || sem>6)
			throw new InvalidSemException(sem);
		System.out.println("normal exit");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int id,sem;
		String name;
		System.out.println("Enter the id,name and sem of the student");
		id=sc.nextInt();
		name=sc.next();
		sem=sc.nextInt();
		try
		{
			compute(3);
			compute(9);
		}
		catch(InvalidSemException e)
		{
			System.out.println("Exception caught"+e);
		}
	}
}