package com.mycompany.lab10;
import java.util.Scanner;
import java.io.*;
public class lab10 
{

    public static void main(String[] args)
    {
        try
        {
       File file=new File("test.txt");
       Scanner sc=new Scanner(file);
       while(sc.hasNextLine())
       {
           String line=sc.nextLine();
           System.out.println(line);
       }
        
       sc.close();
        }
       catch(FileNotFoundException e)
               {
               System.out.println("File not found");             
               
               }
    }
}
