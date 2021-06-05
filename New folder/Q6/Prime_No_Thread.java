class NewThread implements Runnable
{
	int n=5,f=1;
	Thread t;
	NewThread()
	{
		t=new Thread(this,"factorial");
		System.out.println("Main thread "+t);
		t.start();
	}
	public void run()
	{
		try

		{
			while(n>0)
			{
				f=f*n;
				n=n-1;
			}
			System.out.println(f);
			Thread.sleep(100);

		}
		catch(InterruptedException e)
		{
			System.out.println("Exception");
		}
		System.out.println("Exiting Main thread");
	}

}

class Prime_No_Thread
{
	public static void main(String args[])
	{
		new NewThread();
		new NewThread1();
		System.out.println("Exiting main thread");

	}
}

class NewThread1 implements Runnable
{
	Thread t1;
	NewThread1()
	{
		t1=new Thread(this,"Prime number");
		System.out.println("t1 is created"+t1);
		t1.start();
	}
	public void run()
	{
		int i=2,no=11 ,flag=1;

		try
		{
			int n2= no/2;
			if(n2==0)
				System.out.println("no.is not prime");
			else
				System.out.println("no.is prime");
			Thread.sleep(1000);
		}

		catch(InterruptedException e)
		{
			System.out.println("Exception");
		}
	}
}

