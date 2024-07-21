//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;


public class Insertion {
    public static void main(String[] args) throws Exception{
        int[] numbers = new int[10];
        Random rand = new Random();

        System.out.println("Original numbers: " );
        for (int i = 0; i <= numbers.length-1; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + " ");
        }

        insertionSort(numbers);
        System.out.println("\nAfter sorted: " + " ");
        for (int i=0; i <= numbers.length-1; i++)
            System.out.print(numbers[i]+ " ");
    }


    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int currentValue = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > currentValue) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = currentValue;
        }
    }



}