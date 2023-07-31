
package com.mycompany.lab62;


public class lab62
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



package com.mycompany.lab62;


public  class Lecturer implements Speaker
{
    @Override
    public void speak()
    {
        System.out.println("LecturerSpeak");
    }
}






package com.mycompany.lab62;


public class Poltician implements Speaker
{
    
    @Override
    public void speak() {
        System.out.println("PoliticianSpeak");
    }
}



package com.mycompany.lab62;


public class Priest implements Speaker
{
    @Override
    public void speak()
    {
        System.out.println("PriestSpeak");
    }
}




package com.mycompany.lab62;

public interface Speaker 
{
  void speak();  
}



