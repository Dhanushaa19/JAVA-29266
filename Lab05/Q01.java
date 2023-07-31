
package com.mycompany.lab5;


public class classs extends Abstract
{
    public void display()
    {
        int x=10;
        System.out.println("X:"+x);
    }
    
}

package com.mycompany.lab5;

public class lab5 
{
    public static void main(String[] args)
    {
        classs obj1=new classs();
        obj1.display();
    }
}

package com.mycompany.lab5;

public abstract class Abstract
{
    public abstract void display();
    public void Display()
    {
        int x=5;
        System.out.println("X:"+x);
    }
    
}
