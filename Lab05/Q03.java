package com.mycompany.q3;

public abstract class Student 
{
    final int marks=100;
    final void display()
    {
        System.out.println("Marks:"+marks);
    }
    
}

package com.mycompany.q3;

public class Undergraduate extends Student
{
    
}

package com.mycompany.q3;

public class q3
{

    public static void main(String[] args)
    {
       Undergraduate U1=new Undergraduate();
       U1.display();
    }
}
