package BinaryTrees;

public class BinarySearchTree {
    public class Node{
        private int value ;
        private int height ;
        private Node  left ;
        private Node  right ;
        public Node(int value){
            this.value = value ;
        }
        public int getValue(){
            return value ;
        }
    }
    private Node root ;
    public BinarySearchTree(){
    }

    public int height(Node node){
        if(node == null){
            return -1 ;
        } return node.height ;
    }
    public boolean isEmpty(){
        return root == null ;
    }
    public void populate(int[] nums){
        for(int i =0 ; i  < nums.length ; ++i){
//            System.out.println("30 : " + nums[i]);
            this.insert(nums[i] ) ;
        }
    }

    public void populateSorted(int [] nums){
        populateSorted(nums , 0 , nums.length) ;
    }

    private void populateSorted(int [] nums , int start , int end){
        if(start > end) return ;
        int mid = (start + end)/2 ;
        populateSorted(nums , start , mid - 1);
        populateSorted(nums , mid , end) ;
    }


    public void insert(int value){
        root = insert(value , root) ;
    }
    private Node insert(int value , Node node){
//        System.out.println("38 " + value);;
        if(node == null){
            node = new Node(value) ;
            return node ;
        }
        if(node.value > value){
            node.left = insert(value , node.left) ;
//            System.out.println("46" + node.left);
        }if(node.value < value){
            node.right = insert(value , node.right) ;
//            System.out.println("49" + node.right);
        }
        node.height = Math.max(height(node.left) , height(node.right)) + 1 ;
        System.out.println("43: " + node.value);
        return node ;
    }

    public boolean balanced(){
        return balanced(root) ;
    }
    private boolean balanced(Node node){
        if(node == null) return true ;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right) ;
    }

    public void display(){
        display(root , "Root Node : ") ;
    }
    private void display(Node node , String details ){
        if(node == null) return ;
        System.out.println(details + node.value ) ;
//        System.out.println("Left Child of : " + node.value + " is : " + display(node.left , details) + " || Right Child of : " + node.value + " is : " + display(node.right , details));
//        System.out.println("Left Child of : " + node.value + " is: ");
        display(node.left , " left Child of " + node.value + " is: ");
        display(node.right , "right Child of " + node.value + " is: ");
//        display(node.left , details , " left ");
//        System.out.println("Right Child of : " + node.value + " is: ");
//        display(node.right , details , " right " ) ;
    }

}
