import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        int[] stackArray = new int[5];
        Scanner input = new Scanner(System.in);


        System.out.println("Is stack full? " + stack.isFull() + " ");

        while (true) {
            System.out.println("Choose an operation: " +
                    "push, pop, peek, print, check size, exit ");

            String operation = input.nextLine();

            if (operation.equalsIgnoreCase("push")) {
                System.out.println("Enter an integer to push:");
                int first = input.nextInt();
                input.nextLine();
                stack.push(first);
            } else if (operation.equalsIgnoreCase("pop")) {
                stack.pop();
            } else if (operation.equalsIgnoreCase("peek")) {
                stack.peek();
            } else if (operation.equalsIgnoreCase("print")) {
                    stack.printStack();
            } else if (operation.equalsIgnoreCase("check size")) {
                System.out.println("The size of the stack is " + stack.size());
            } else if (operation.equalsIgnoreCase("exit")) {

                System.out.println("Thank you, goodbye.");
                break;
            } else {
                System.out.println("Invalid input for operation. Choose again.");
            }

        }

    }
}

