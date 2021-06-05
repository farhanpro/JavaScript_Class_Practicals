public abstract class Shape {
public abstract double area();
}

public class Rectangle extends Shape
{
private final double width, length;

public Rectangle(double width, double length)
{
this.width = width;
this.length = length;
}

public double area() {
return width * length;
}

public class Circle extends Shape
{
private final double radius;
final double pi = Math.PI;
public Circle(double radius)
{
this.radius = radius;
}

public double area()
{
return pi * Math.pow(radius, 2);

}
}

public class Square extends Shape
{
private final double side;
public Square(double side)
{
this.side=side;
}
public double area()
{
return side*side;
}

}

public class TestShape {
public static void main(String[] args) {

double width = 5, length = 7;
Shape rectangle = new Rectangle(width, length);
System.out.println("\n Area of rectange="+ rectange.area());

double radius = 5;
Shape circle = new Circle(radius);
System.out.println("\n Area of Circle="+circle.area());

double side=8;
Shape square=new Square(side);
System.out.println("\n Area of Square="+square.area());

}

