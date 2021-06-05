import java.util.*;
abstract class Shape1

{
double area, vol;
void display()
{
System.out.println("Volume:\n"+vol);
System.out.println("Area :\n"+area);
}
abstract void calVol();
abstract void calArea();
}

class Cone extends Shape1
{
float r,h;
Cone(float r,float h)
{
this.r=r;
this.h=h;
}
void calVol()
{
vol=4/3*3.14*r*r*r;
}
void calArea()
{
area=4*3.14*r*r*h;
}
}

class Sphere extends Shape1
{
float r;
Sphere(float r)
{
this.r=r;

}
void calVol()
{
vol=4/3*3.14*r*r*r;
}
void calArea()
{
area=4*3.14*r*r*h;
}
}

class Cylinder extends Shape1
{
float r,h;
Cylinder(float r,float h)
{
this.r=r;
this.h=h;
}
void calVol()
{
vol=3.14*r*r*h;

}
void calArea()
{
area=(2*3.14*r*h)+(2*3.14*r*r);
}
}

class ShapeDemo
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);

System.out. println("Enter Radius");
System.out. println("Enter Height");
float r=scan.nextFloat();
float h=scan.nextFLoat();

Cone c=new Cone(r,h);
c.calArea();
c.calVol()
c.display();

System.out. println("---------------------------");

System.out. println("Enter Radius");
System.out. println("Enter Height");
float r1=scan.nextFloat();

Sphere s=new Sphere(r1);

System.out. println("---------------------------");

s.calArea();
s.calVol();
s.display();

};
};

