package Junit5;

public class Triangle {

    public static int getType(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {//condition 1
            if (a == b && b == c) {//condition 2
                return 3; //equilateral triangle
            } else if (a != b && b != c && a != c) {//condition 3
                return 1;//regular triangle
            } else {
                return 2;//isosceles triangle
            }
        } else {
            return 0;//not triangle
        }
    }
}

