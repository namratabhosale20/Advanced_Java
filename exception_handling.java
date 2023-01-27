import java.io.IOException;
import java.util.*;
public class exception_handling {
    static void student()throws ArithmeticException
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter Person age: ");
        age=sc.nextInt();
        if(age<18)
        {
            throw new ArithmeticException("Person is not eligible");
        }
        else{
            System.out.println("person is eligible ");
        }
     
      }
    public static void main(String args[])
    {
       student();
        try{
            Scanner sc=new Scanner(System.in);
           int a,b;
           int result;
           System.out.println("Enter 2 integer numbers: ");
           a=sc.nextInt();
           b=sc.nextInt();
           result=a+b;
           System.out.println("Result: "+result);
        }
        catch(ArithmeticException e2)
        {
            System.out.print(e2);
            System.out.println("Please enter interger numbers");
        }
        catch(ArrayIndexOutOfBoundsException e3)
        {
            System.out.print(e3);
        }
        catch(NumberFormatException e4)
        {
            System.out.print(e4);
            System.out.println("Please enter interger numbers");
        }
        catch(Exception e1)
        {
           
           System.out.println("Error");
           System.out.println("Please enter interger numbers");
           Scanner sc=new Scanner(System.in);
           int a,b;
           int result;
           System.out.println("Enter 2 integer numbers: ");
           a=sc.nextInt();
           b=sc.nextInt();
           result=a+b;
           System.out.println("Result: "+result);

        }
        finally
        {
            System.out.println("try catch is completed ");
        }
    }
}
