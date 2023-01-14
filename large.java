import java.util.*;
class large
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 integer number:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        largest(a,b,c);
    }
    static void largest(int x,int y,int z)
    {
        if(x==y && y==z)
        System.out.println("All 3 int nos are same");
        else if(x>y && x>z)
        System.out.println("First no.is larger");
        else if(y>z)
        System.out.println("second no.is larger");
        else{
            System.out.println("third is larger");
        }
    }
}