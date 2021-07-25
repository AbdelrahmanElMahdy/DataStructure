import java.util.Arrays;
import java.util.Stack;
public class QueueStacks {
    private Stack<Integer> StackOne;
    private Stack<Integer> StackTwo;
    private int count=0;

    public QueueStacks(){
        StackOne =new Stack<>();
        StackTwo =new Stack<>();
    }


    public void enqueue(int item){
        StackOne.push(item);
        count++;
    }
    public int dequeue(){
        if(StackOne.isEmpty())
            throw new IllegalArgumentException();
        while (!StackOne.isEmpty())
            StackTwo.push(StackOne.pop());
        int item = StackTwo.pop();
        while (!StackTwo.isEmpty())
            StackOne.push(StackTwo.pop());
     count--;
     return item;
    }
/*
@Override
public String toString(){
        int[] array=new int[count];
        int index=0;

    while (!StackOne.isEmpty())
        StackTwo.push(StackOne.pop());

        while (!StackTwo.isEmpty()) {
            StackOne.push(StackTwo.peek());
            array[index++] = StackOne.pop();
        }
        return Arrays.toString(array);
}
*/

}
