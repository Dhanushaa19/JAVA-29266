
package com.mycompany.lab04;


public class lab4
{

    public static void main(String[] args)
    {
        Employee E1=new Employee();
         E1.setId(123);
         E1.setEmpname("Mr.Bogdan");
         E1.setEmpDesignation("Manager");
         
         System.out.println("ID:"+E1.getId());
         System.out.println("Name:"+E1.geteName());
         System.out.println("Designation:"+E1.getEmpDesignation());         
         Employee E2=new Employee();
         E2.setId(222);
         E2.setEmpname("Ms.Bird");
         E2.setEmpDesignation("Lecturer");  
		 
         System.out.println("ID:"+E2.getId());
         System.out.println("Name:"+E2.geteName());
         System.out.println("Designation:"+E2.getEmpDesignation());
    }
}


package com.mycompany.lab04;


public class Employee 
{
    private int empID;
    private String empName;
    private String empDesignation;
    
    public void setId(int id)
    {
        this.empID=id;        
    }
    public int getId()
    {
        return empID;
    }
    public void setEmpname(String ename)
    {
        this.empName=ename;     
    }
    public String geteName()
    {
        return empName;
    }
    public void setEmpDesignation(String des)
    {
        this.empDesignation=des;     
    }
    public String getEmpDesignation()
    {
        return empDesignation;
    }
}
