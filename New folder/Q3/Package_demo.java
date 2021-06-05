
//package MCA;
public class Mathematics
{
int num1, num2, sum_int;
float n1, n2, n3, sum_float;
public Mathematics (int num1, int num2)
{
this.num1=num1;
this.num2=num2;
}
public Mathematics (Float n1, float n2, float n3)
{
this.n1=n1;
this.n2=n2;
this.n3=n3;
}

public void sum_int()
{
sum_int=num1+num2;
System.out.println("Sum of integers is : "+sum_int);
}
public void sum_float()
{
sum_float=n1+n2+n3;
System.out.println("Sum of Float variables is : "+sum_float);
}
}
package MCA;
public class Maximum
{
int n1,n2,n3;
public Maximum(int n1, int n2, int n3)
{
this.n1=n1;
this.n2=n2;
this.n3=n3;
}
public void Find_max()
{
if(n1>n2 && n1>n3)
{
System.out.println(n1+" is greatest.");
}
else if(n2>n1 && n2>n3)
{
System.out.println(n2+" is greatest.");
}
else
{
System.out.println(n3+" is greatest.");
}

}
}
import MCA.*;
public class Package_demo
{
public static void main(String args[])
{
Mathematics obj= new Mathematics(5,7);
obj.sum_int();
Mathematics obj1= new Mathematics(5.6f,7.1f,6.2f);
obj1.sum_float();
Maximum obj3= new Maximum(5,8,3);
obj3.Find_max();
}
}
