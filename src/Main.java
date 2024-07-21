
public class Main {
    public static void main(String[] args) {

        CirQueue c = new CirQueue(5);
        try {
            c.enqueue(5);
            c.enqueue(17);
            c.enqueue(-32);
            c.enqueue(19);
            c.enqueue(22);
            c.enqueue(16);
            System.out.println(c.dequeue());
            System.out.println(c.getSize());
            System.out.println(c.dequeue());
            System.out.println(c.peek());
            c.enqueue(88);
            System.out.println(c);

        } catch (Exception e) {
            System.out.println("EXCEPTION RAISED!" + e.toString());
        }



    }
}