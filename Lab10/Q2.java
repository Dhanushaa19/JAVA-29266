package com.mycompany.lab10;

public class lab10
{

    public static void main(String[] args) 
    {    
           int [] arr={10,20,30,40,50};
           
        try
        {           
            arr[5]=20;
            System.out.println("Last element value :"+arr[5]);
            
        }
        catch(ArrayIndexOutOfBoundsException  e )
                {
                     System.out.println(e.getMessage());
                }
        catch(java.lang.Exception e1)
        {
            System.out.println(e1.getMessage());
        }
        finally
        {
            System.out.println("Array:");
            for(int i=0;i<arr.length;i++)
                    {
                        
                        System.out.println(arr[i]);
                    }
        }
    }
}
