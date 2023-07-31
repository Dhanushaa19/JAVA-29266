package com.mycompany.lab8;

public abstract class BankAccount
{
   
    private int accountNumber;
    protected float balance;
    protected float interest;
    
    public void setVAlueAccNumber(int num)
    {
        this.accountNumber=num;
    }
    public int getValueAccNumber()
    {
        return accountNumber;
    }
     public void setVAlueBalance(float balance)
    {
        this.balance=balance;
    }
    public float getValueBalance()
    {
        return balance;
    }
}


package com.mycompany.lab8;

public class CheckingAccount extends BankAccount
{
     static final float Rate=1.2f;
    public float calculateInterest()
    {
        
        interest=balance*Rate;
        return interest;
    }
    
}

package com.mycompany.lab8;


public class SavingAccount extends BankAccount
{
    static final float SRate=0.2f;
    
    public float calculateInterest()
    {
        interest=balance*SRate;
        return interest;
    }
    
}

package com.mycompany.lab8;

public abstract class AssignmentNew 
{
    public abstract float calculateInterest();

    public static void main(String[] args) 
    {       
        
        CheckingAccount C1=new CheckingAccount();
        C1.setVAlueBalance(1000000);
        System.out.println("Balance:"+C1.getValueBalance());
        System.out.println("The interest:"+C1.calculateInterest());
        
       SavingAccount S1=new SavingAccount();
       S1.setVAlueBalance(20000000.00f);
         System.out.println("Balance:"+S1.getValueBalance());
        System.out.println("The interest:"+S1.calculateInterest());
             
       
    }
}
