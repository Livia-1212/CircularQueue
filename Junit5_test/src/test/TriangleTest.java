package test;
import Junit5.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getType(){
        assertAll("TriangleTypetESTS",
                () -> Assertions.assertEquals(3, Triangle.getType(2,2,2), "Should be an equilateral triangle"),
                ()->assertEquals(1, Triangle.getType(3,4,5),"Should be a scalene triangle"),
                ()->assertEquals(2, Triangle.getType(2,3,3), "Should be an isosceles triangle"),
                ()-> assertEquals(0, Triangle.getType(1,1,2),"Should not be a triangle.")
        );

    }

}