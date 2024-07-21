//Livia's version Circular Queue

import java.util.NoSuchElementException;

public class CirQueue {

    int front, rear;
    int[] nums;
    int size;
    final int CAPACITY;

    public CirQueue(int initialSize) {
        this.nums = new int[initialSize];
        this.front = this.rear = -1;
        size = 0;
        CAPACITY = initialSize;
    }


    public void enqueue(int data) {
        if (isEmpty()) {
            front= 0;
            rear=0;
            size++;
        }

        nums[rear] = data;
        rear = (rear + 1) % nums.length;

        if(isFull()) {
            System.out.println("queue is full.");
            size = CAPACITY;
        }else {
            size++;
        }


    }


    public int dequeue() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            int temp = nums[front];
            nums[front] = Integer.MIN_VALUE;
            front = (front + 1) % nums.length;
            size--;
            if (size==0)
               front = rear = -1;

            return temp;

        }
    }

    public int getSize() {
        if (isEmpty())
            return 0;
        else return size;
    }

    public int peek() throws Exception {
        if (isEmpty())
            throw new Exception("No elements to peek");
        return nums[front];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return size == CAPACITY;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return ("queue is empty.");
        }
        StringBuilder kb = new StringBuilder();
        kb.append("[");
        for (int i = 0; i < CAPACITY; i++) {
            if (nums[i] != Integer.MIN_VALUE) {
                kb.append(nums[i]);
            } else {
                kb.append("_");
            }
            if (i < CAPACITY-1) {
                kb.append(", ");
            }
        }
        kb.append("]");
        System.out.println("The current full queue is: ");
        return kb.toString();
    }

    public int getCAPACITY() {
        return CAPACITY;
    }


}
