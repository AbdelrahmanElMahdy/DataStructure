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

    public void insert(int value){
        Node crNode= root;
        boolean isRight= crNode.value < value;

        while( ( crNode.right != null && isRight )  || ( crNode.left != null && !isRight ) ){
            if( value > crNode.value )
                crNode= crNode.right;
    
            else if( value < crNode.value )
                crNode= crNode.left;            
            
            isRight= value > crNode.value;
}

        if (isRight)
            crNode.right=new Node(value);
        else
        crNode.left=new Node(value);

}
    


}