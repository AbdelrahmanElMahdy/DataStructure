import java.util.Arrays;

public class Array {
    private int length;
    private int[] list;
    private int index = 0;


    public Array(int length) {
        this.length = length;
        list = new int[this.length];

    }

    public void insert(int number) {
        if (this.index >= this.length) {
            this.length = this.length * 2;

            int[] list2 = new int[this.length];

            for (int pos = 0; pos <= list.length - 1; pos++) {
                list2[pos] = list[pos];
            }

            list = list2;
            list[index] = number;
            index++;


        } else {
            list[this.index] = number;
            this.index++;
        }
    }

    public int print(int numberIndex) {
        return this.list[numberIndex];

    }

    public int getLength() {
        return length;
    }

    public int indexOf(int item) {
        for (int pos=0; pos <= this.index; pos++) {
            if (list[pos] == item){
                return pos;
            }
        }
        return -1;
    }

    public void printArray(){
        System.out.println(Arrays.toString(this.list));
    }




}


