public class Progression {

    protected long current;

    public Progression(){ this(0);} // Construct a progression starting at zero

    public Progression(long start){current = start;} // Construct a progression with given start value

    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }

    /** Advances the current value to the next value of the progression. */
    protected void advance(){
        current++;
    }

    // Prints the next n values of the progression, separated by spaces.
    public void printProgression(int n){
        System.out.print(nextValue());
        for (int j=1; j<n; j++)
            System.out.print(" " + nextValue());
        System.out.println();

    }


}
