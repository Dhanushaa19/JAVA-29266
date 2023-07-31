
package com.mycompany.q2;


public class q2
{

    public static void main(String[] args)
    {
       Lecturer L1=new Lecturer();
       L1.speak();
       Poltician P1=new Poltician();
       P1.speak();
       Priest PR1=new Priest();
       PR1.speak();
       

    }
}

package com.mycompany.q2;


public class Poltician implements Speaker
{
    
    @Override
    public void speak() {
        System.out.println("Hello");
    }
}

package com.mycompany.q2;


public class Priest implements Speaker
{
    @Override
    public void speak()
    {
        System.out.println("Every One");
    }
}

package com.mycompany.q2;

public interface Speaker 
{
  void speak();  
}

package com.mycompany.q2;


public  class Lecturer implements Speaker
{
    @Override
    public void speak()
    {
        System.out.println("Good MORNING");
    }
}
