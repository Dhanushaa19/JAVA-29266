package com.mycompany.lab7;


public abstract class lab7
{
    final double pi=3.14159;
    public  abstract void  calculateArea();
    protected double area;
    public void display()
    {
        System.out.println(area);
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


package com.mycompany.lab7;

public class Rectangle extends lab7
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






package com.mycompany.lab7;

public class Circle extends lab7
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




