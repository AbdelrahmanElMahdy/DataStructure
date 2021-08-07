public class BinaryTree {
    
    //encapsulate the node class inside tree class 
    private class Node {
        int value;
        Node left; 
        Node right;

        private Node(int value){
         this.value=value;
        }

    }


    private Node root ; 

    public BinaryTree(int value){
        this.root=new Node(value);
    }

}