import java.util.Scanner;
import java.io.*;

//a(n) = a(n-1) + 3 * b(n-1);	b(n) = b(n-1) – 2 * a(n-1);
//a(0) = 5;	b(0) = 2;

public class Function {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter n =   (positive integer)");

        int n = myObj.nextInt();
        int resultA = functiona(n);
        System.out.println("Result of Function a: " + resultA);
        int resultB = functionb(n);
        System.out.println("Result of Function b: " + resultB);



    }

    public static int functiona(int n) {
        int result;
        if (n == 0)
            result = 5;
        else {
            result = functiona(n-1)+ 3 * functionb(n-1);
        }
        return result;
    }

    public static int functionb(int n) {
        int result;
        if(n==0)
            result = 2;
        else {
            result = functionb(n-1)- 2 * functiona(n-1);
        }
        return result;
    }


}
