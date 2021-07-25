public class LinkedList {
        private class Node {
        private int value;
        private Node next;

            public Node(int value) {
                this.value = value;
            }
        }

    private Node first;
    private Node last;
    private int size;



    public void addFirst(int value){
        Node node = new Node(value);
        if(this.first == null && this .last == null) {
            last = first = node;
        }
        else{
            node.next=first;
            first=node;
        }
        size++;

    }
    public void addLast(int value){
        Node node= new Node(value);
        if(this.first == null && this .last == null) {
            last = first = node;
        }
        else{
            last.next=node;
            last= node;

        }
        size++;
    }


    public void deleteFirst(){
            if(this.first == null && this .last == null)
                System.out.println("no elements to be deleted");
            else{
                Node temp=first;
                first=first.next;
                temp.next=null;
            }
            size--;

    }

    public void deleteLast() {
        Node temp2=last;
        if (this.first == null && this.last == null)
            System.out.println("no elements to be deleted");
        else{
            Node temp=first;
            while(temp != last){
                 temp2=temp;
                temp=temp.next;
            }
          temp2.next=null;
          last=temp2;

        }
    }
    public boolean contains(int value){
       Node temp=first;

       while (temp.next != null){
        if(temp.value==value)
            return true;
        temp=temp.next;
    }

       return false ;
}

    public void reverse(){

        Node prevoius=first;
        Node current=first;
        Node next=current.next;

        while(current!= null){
            current.next=prevoius;
            prevoius.next=null;

            prevoius=current;
            current=next;
            next=next.next;
        }
    }

    public void reverselist(){
        Node previous=null;
        Node current=first;
        Node next=current.next;
        Node TEMP=first;
        while( current!= null){
            current.next=previous;

            previous=current;
            first=current;
            current=next;

            if(next==null)
                continue;
            next=next.next;

        }
        last=TEMP;
      //  previous=first;
       // first=last;
      //  last=previous;



    }
    public int[] toarray(){
            Node current=first;
            int[] array=new int[size];
            int index=0;

            while(current !=null){
                array[index++]=current.value;
                current=current.next;

            }
            return array;

    }


public int getKth(int k ){
        Node end =this.first;
        Node begin=end;
        if(this.size==0)
            throw new IllegalArgumentException("empty  list");

         if( k <= 0 || k > this.size || this.size==0)
             throw new IllegalArgumentException("please enter a valid numebr");

        while(k-1 !=0){
            end=end.next;
            k--;
        }


        while(end!=last){
                end=end.next;
                begin=begin.next;

        }

        return begin.value;
}
}
