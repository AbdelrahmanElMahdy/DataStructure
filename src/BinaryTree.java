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
    public BinaryTree(){
    }

    public void insert(int value){
        
        if(this.root == null){
            this.root=new Node(value);
            return;
           
        }
          
        if(found(value))
        throw new IllegalArgumentException("value: "+ value + " Already exist. binary tree could't have duplicated value");
    

        Node crNode= root;
        boolean isRight= value > crNode.value;

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
    
    public boolean found(int value) {
        
        Node crNode= root;
        boolean isRight= value > crNode.value;
        boolean found  = false ;

        while( crNode != null ){
           
            if (value == crNode.value){
                found= true;
                return found;
            }   
            if(isRight)
                crNode = crNode.right;

            else
                crNode = crNode.left;            
            
            try {
                isRight= value > crNode.value;
            } catch (Exception e) {
                isRight=false;
            }
}       
        return found ;
 }
}