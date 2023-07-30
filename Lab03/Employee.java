
package com.mycompany.lab03;


public class Employee 
{
    private String EmpName;
    private float BasicSalary;
    private float Bonus;
    private float BonusAmount;
    
    public void setEmpname(String empname)
    {
        this.EmpName=empname;        
    }
    public String getName()
    {
        return(EmpName);
    }
    public void setbasicsalary(float bsalary)
    {
        this.BasicSalary=bsalary;        
    }
    public float getBasicSalary()
    {
       return(BasicSalary);
    }
    public Employee(float  bonus)
    {
        this.Bonus=bonus;
    }
    public void findbonus()
    {
       BonusAmount= BasicSalary+Bonus; 
        System.out.println("Bonus : "+BonusAmount);
    }
}
