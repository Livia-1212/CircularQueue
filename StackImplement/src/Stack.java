
public class Stack {
    // Instance variables
    private int maxSize; // size of the stack
    private int[] stackArray; //store elements of stack
    private int top; //represent top of the stack

    // Constructor to initialize the stack with an array of size 5
    public Stack(int size) {
        stackArray = new int[size];
        maxSize = size;
        top = -1;
    }

    // push top data item at the stack
    public int push(int first) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + first);
        } else {
            System.out.println("Pushed " + first + " to the stack.");
            stackArray[++top] = first;
        }
        return stackArray[top];
    }

    // remove top elements from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop any value.");
            return -1;
        } else {
            int last = stackArray[top];
            System.out.println("pop the element: " + last);
            top--;
        }
        return stackArray[top];
    }

    // return the size of the stack
    public int size() {
        int count = 0;
        for (int i = 0; i <= top; i++)
            count++;
        return count;
    }

    // get the top item of the stack without removing the item
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, no item to peek.");
        } else
            System.out.println("Top item is " + stackArray[top]);
    }

    // return true if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // return true if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // print all current elements in the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else{
            for (int i = top; i>-1;i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }


}



