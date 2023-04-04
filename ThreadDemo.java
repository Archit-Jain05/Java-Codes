class Thread1 extends Thread
{
	String x;
	Thread1(String a)
	{
		super("Counter Thread");
		x=a;
		start();
	}

	public void run()
	{
		int count=0;  
      
            char ch[]= new char[x.length()];     
            for(int i=0;i<x.length();i++)  
            {  
                ch[i]= x.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  

            }  
              System.out.println(count);

	}
}

class Thread2 extends Thread
	{
		String x;
		Thread2(String a)
		{
			super("Reverse Thread");
			x=a;
			start();
		}

		public void run()
		{

		String nstr="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
        
      for (int i=0; i<x.length(); i++)
      {
        ch= x.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}


	


class ThreadDemo
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1("Hello MF World");
		Thread2 t2=new Thread2("Hello MF World");

	}
}