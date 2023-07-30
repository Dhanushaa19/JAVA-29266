
package com.mycompany.lab03;

public class lab3
{

    public static void main(String[] args)
    {
        Employee E1=new Employee(10000.00f);
        E1.setEmpname("Bogdan");
        System.out.println("Employee name:"+E1.getName());
        E1.setbasicsalary(50000);
        System.out.println("Basic Salary:"+E1.getBasicSalary());
        E1.findbonus();
        
    }
}
