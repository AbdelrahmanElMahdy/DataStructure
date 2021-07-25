import java.util.EmptyStackException;

public class stackUsingArray {
    private int[] array;
    private  int index=0;
    private int inialSize=10;

    public stackUsingArray() {
        array = new int[inialSize];
    }
    public void push(int item){
        if(index==inialSize-1){
            array=extendArray(array);
            inialSize=inialSize*2;
        }
        array[index++]=item;
    }
    public boolean isEmpty(){
        return index == 0;
    }
    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();
        return array[(index--)-1];
    }
    public int peak(){
        if (isEmpty())
            throw new EmptyStackException();
        return array[index-1];
    }


    private int[] extendArray(int[] array) {
        int index=0;
        int[] newArray =new int[array.length*2];
        for (int number:array) {
            newArray[index++]=number;
        }
        return newArray;
}
}
