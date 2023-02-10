
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class file_handling_write {

 
      public static void main(String args[])
     {
        try{
            FileWriter  myWriter = new FileWriter("Student.txt");
            myWriter.write("File in java might be tricky,but it is fun enough");
            myWriter.close();
            System.out.println("Succesfully wrote to the file.");
        }
        catch(IOException e)
        {
            System.out.println("An error occured.");
        }
     }
    }


