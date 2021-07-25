import java.util.Arrays;
import java.util.LinkedList;

public class StackWithLs {
    private LinkedList<Integer> items =new LinkedList<>();

public void push(int item){
    items.addFirst(item);
}
public int peak(){
      return items.peekFirst();
}
public int pop(){
    return items.poll() ;
}
@Override
    public String toString(){
    return Arrays.toString(items.toArray());
}
}
