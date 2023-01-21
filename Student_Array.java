import java.util.Scanner;

public class Student_Array 
{
    int roll;
    String name;
    Scanner sc = new Scanner(System.in);

    void getdata() 
    {
        // Scanner sc=new Scanner(System.in);
        System.out.println("Enter student Rollno: ");
        roll = sc.nextInt();
        System.out.println("Enter student Name: ");
        name = sc.next();
        // show1();

    }
    void display() 
   {
        System.out.println("student Rollno: " + roll);
        System.out.println(" student Rollno: " + name);

    }
  public static void main(String args[]) 
  {
     Student_Array obj=new Student_Array();
     obj.getdata();
     obj.display();
  }
    
}

    