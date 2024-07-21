/** Original Code from Youtube
 *
 * import java.util.NoSuchElementException;

public class CirQueue2 {

    int front, rear;
    int[] nums;
    int size;
    final int CAPACITY;
    int temp;

    public CirQueue2(int initialSize) {
        this.nums = new int[initialSize];
        this.front = this.rear = -1;
        size = 0;
        CAPACITY = initialSize;
    }


    public void enqueue(int data) {
        if(isFull())
            resize();
        else if(isEmpty())
            front ++;
        rear = (rear + 1) % nums.length;
        nums[rear] = data;
        }




    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int temp = nums[front];
        if(front == rear)
            front = rear = -1;
        else front = (front+1)% nums.length;
        return temp;
    }

    public int getSize() {
        if (isEmpty())
            return 0;
        else return nums.length;
    }

    private void resize(){
        int[] tempArr = new int[nums.length*2];
        int i = 0;
        int j = front;

        do{
            tempArr[i++]=nums[j];
            j = (j+1) % nums.length;
        }while (j != front);

        front = 0;
        rear = nums.length -1;
        nums = tempArr;
    }

    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException();
        return nums[front];
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public boolean isFull() {
        if(rear>0)
            return (rear + 1) % nums.length == front;
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return ("queue is empty.");
        }
        StringBuilder kb = new StringBuilder();
        kb.append("[");
        for (int i = front; i < rear + 1; i++) {
            kb.append(nums[i]);
            if (i < rear ) {
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


}*/
