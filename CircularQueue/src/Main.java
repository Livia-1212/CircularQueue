import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the size of the queue you want to create: ");
        int size = kb.nextInt();
        CirQueue queue = new CirQueue(size);

        if (size < 0 || size > 10) {
            System.out.println("Please enter integer between 0 and 10");
            size = kb.nextInt();
            queue = new CirQueue(size);
        } else System.out.print("The queue size is " + size + ".");

        while (true) {
            System.out.println("Choose an operation: 1,enqueue; 2, dequeue" +
                    "\n3,getSize;4, peek; 5,check if queue is full; " +
                    "\n6,check if queue is empty; 7, print out current queue.");
            int choice = kb.nextInt();
            kb.nextLine(); // Consume the newline character left by nextInt()

            switch (choice) {
                case 1:
                    while(choice==1) {
                        System.out.println("Enter the integer you would like to add to the queue or \"exit\": ");

                        String input = kb.nextLine(); // Read the next token as a string
                        if (input.equalsIgnoreCase("exit")) {
                            break;
                        } else{
                            int data = Integer.parseInt(input); // Try to parse the input as an integer
                            queue.enqueue(data); // Enqueue the integer

                            System.out.println("Added element " + data + " to the queue.");


                        }
                    }
                    break;

                case 2:
                    if(queue.isEmpty()){
                        System.out.println("No element.");
                    }else {
                        System.out.println("Dequeue the element: " + queue.dequeue());
                    }

                    break;
                case 3:
                    System.out.println("The size of the queue is " + queue.getSize());

                    break;
                case 4:
                    System.out.println(queue.peek());

                    break;
                case 5:
                    System.out.println("The queue capacity is " + queue.getCAPACITY() + ".");
                    System.out.println("The queue size is " + queue.getSize() + ".");
                    System.out.println("The queue full status is: " + queue.isFull());

                    break;
                case 6:
                    System.out.println(queue.isEmpty());

                    break;
                case 7:
                    System.out.println(queue.toString());

                    break;
                default:
                    System.out.println("Your choice is an invalid input. Choose again.");
                    break;
            }

        }

    }
}