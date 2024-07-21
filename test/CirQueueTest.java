import static org.junit.Assert.*;

public class CirQueueTest {

    CirQueue c = new CirQueue(5);
    @org.junit.Test
    public void enqueue() {
        try {
            c.enqueue(5);
            c.enqueue(17);
            c.enqueue(-32);
            c.enqueue(19);
        } catch (Exception e) {
            assertEquals("[5,17,-32,19]", c.toString());
        }
    }

    @org.junit.Test
    public void dequeue() {
        try {
            c.dequeue();
            assertTrue(5 == c.dequeue());

            c.dequeue();
            assertTrue(17 == c.dequeue());

            c.dequeue();
            assertTrue( -32 == c.dequeue());

            c.dequeue();
            assertTrue(19 == c.dequeue());

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @org.junit.Test
    public void getSize() {
        try {
            c.enqueue(5);
            c.enqueue(17);
            c.enqueue(-32);
        } catch (Exception e) {
            assertEquals(3, c.getSize());
        }
    }

    @org.junit.Test
    public void peek() throws Exception {
        try {
            c.enqueue(5);
            assert c.peek() == 5;
            c.enqueue(17);
            assert c.peek() == 5;
            c.enqueue(-32);
            assert c.peek() == 5;
            c.enqueue(19);
            assert c.peek() == 5;
        }catch (Exception e){
            assert c.peek() == 5;
        }

        c.dequeue();
        assert c.peek() == 17;


    }

    @org.junit.Test
    public void isEmpty() {
        assertTrue(c.isEmpty());
        c.enqueue(1);
        assertFalse(c.isEmpty());
    }

    @org.junit.Test
    public void isFull() {
        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.enqueue(4);
        c.enqueue(5);
        assertTrue(c.isFull());

    }

    @org.junit.Before
    public void setUp() {
        try{
            CirQueue c = new CirQueue(5);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @org.junit.After
    public void tearDown() throws Exception {
        c = null;
    }
}