package com.mycompany.q4;

public class Rectangle extends shape
{
    private double length, width;
    public Rectangle(double l, double w)
    {
        this.width=w;
        this.length=l;
    }
    
    public void calculateArea()
    {
        area=length*width;     
    }
}

package com.mycompany.shape;


public abstract class shape
{
    final double pi=3.14159;
    public  abstract void  calculateArea();
    protected double area;
    public void display()
    {
        System.out.println("Area:"+area);
    }

    public static void main(String[] args) 
    {
        Circle C1=new Circle(7);
        C1.calculateArea();
        C1.display();
        
        Rectangle R1=new Rectangle(4,5);
        R1.calculateArea();
        R1.display();
    }
}

package com.mycompany.shapeshape;

public class Circle extends shape
{
    private double radius;
    public Circle(int r)
    {
        this.radius=r;
    }
    public void calculateArea()
    {
        area=radius*radius*pi;
    }
    
    
}
