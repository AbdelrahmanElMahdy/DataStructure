import java.util.Arrays;

public class PriorityQwithArray {
    private int initsize=5+11;
    private int[] items;
    private int front = 0;
    private int count=0;

    public PriorityQwithArray() {
        this.items = new int[initsize+1];
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalArgumentException("empty");

        int current=0;
        int value=items[0];
       //shifiting items
        while(current<count)
            items[current]=items[current++ + 1];

        count--;
        return value;
    }

    public void enquue(int value) {
        if(isFull())
            throw new IllegalArgumentException("full");
        else if (isEmpty())
            items[0]=value;
      else {
          int checkPoint=count-1;
          int current=count;
            while (value < items[checkPoint]){
                items[checkPoint+1] = items[checkPoint];
                   current=checkPoint;
                   checkPoint--;
            }

            items[current] = value;
        }
       count++;
    }
@Override
public String toString(){
        return Arrays.toString(this.items);
}
    private boolean isEmpty() {
        return count==0;
    }


    private boolean isFull() {
        return count==initsize;
    }

}
