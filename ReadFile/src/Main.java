import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateFile {

        try {
            File myObj=new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: "+ myObj.getName());
            }else {
                System.out.println("File already exists.");
            }
        }	catch (IOException e) {
        }

    }




    public class ReadFile {
            try {
                File myObj = new File("Filename.txt");
                Scanner myReader = new Scanner(myObj);
                while(myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            }	catch(FileNotFoundException e)

        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


    public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}