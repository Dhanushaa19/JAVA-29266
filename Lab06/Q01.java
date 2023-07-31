package com.mycompany.lab6;

public class lab6 
{

    public static void main(String[] args)
    {
        classs obj1=new classs();
        obj1.display();
    }
}


package com.mycompany.lab6;

public abstract class Abstract
{
    public abstract void display();
    public void Display()
    {
        int x=5;
        System.out.println(x);
    }
    
}


package com.mycompany.lab6;


public class classs extends Abstract
{
    public void display()
    {
        int x=10;
        System.out.println(x);
    }
    
}

