 
class mythread implements Runnable
{
Thread t;
public mythread(String title)
{
t=new Thread(this,title);
t.start();
}
public void run()
{
for(int i=0;i<50;i++)
{
System.out.println((i+1)+"ThreadName:"+Thread.currentThread().getName());
try
{
Thread.sleep(100);
}
catch(Exception e)
{
}
}}}
public class Hello_Java
{
public static void main(String a [])
{
System.out.println("ThreadName:"+Thread.currentThread().getName());
mythread mt=new mythread("Hello Java");
}
}
