import java.util.NoSuchElementException;

public class LinearQueue {

    int front, rear;
    int[] nums;
    int size;
    final int CAPACITY;

    public LinearQueue(int queuesize){
        this.nums = new int[queuesize];
        this.front = this.rear = -1;
        size = 0;
        CAPACITY = queuesize;
    }



    public void enqueue(int data) {
        if (isEmpty()) {
            front = 0;
        }
        try {
            ++rear;
            nums[rear] = data;
            size++;
        }catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("Queue is full.Cannot enqueue " + data + ". Choose another option.");
        }
    }


    public int dequeue(){
        if(isEmpty()) {
            System.out.println("queue is empty.");
        }
        int temp = nums[front];
        if(front ==rear) {
            front = rear = -1;
            size = 0;
        }
        else {
            front++;
            size--;
        }
        return temp;
    }

    public int getSize(){
            if(isEmpty())
                return 0;
            else return size;
    }

    public int peek(){
        if(isEmpty())
            throw new NoSuchElementException();
        return nums[front];
    }

    public boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    public boolean isFull(){
            return size == CAPACITY;
    }

    @Override
    public String toString(){
            if(isEmpty()){
               return ("queue is empty.");
            }
            StringBuilder kb = new StringBuilder();
            kb.append("[");
            for (int i = 0; i < size; i++){
                kb.append(nums[(front+i)%nums.length]);
                if(i<size-1){
                    kb.append(", ");
                }
            }
            kb.append("]");
            System.out.println("The current full queue is: " );
            return kb.toString();
    }

public int getCAPACITY(){
        return CAPACITY;
}

}