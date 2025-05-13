package BinaryTrees;

import java.util.Scanner;

public class BinaryTree {
    public void BinaryTree(){

    }
    private static class Node{
        int value ;
        Node left ;
        Node right ;
        Node(int value){
            this.value = value ;
        }
    }
    private Node root ;
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ") ;
        int value = scanner.nextInt() ;
        root = new Node(value) ;
        populate(scanner , root) ;
    }
    public void populate(Scanner scanner , Node node){
        System.out.println("Do you want to enter the left of: " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left node: ");
            int value = scanner.nextInt() ;
            node.left = new Node(value) ;
            populate(scanner , node.left) ;
        }
        System.out.println("Do you want to enter the right of: " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of right node: ");
            int value = scanner.nextInt() ;
            node.right = new Node(value) ;
            populate(scanner , node.right) ;
        }
    }
    public void display(){
        display(root , "") ;
    }
    private void display(Node root , String indent){
        if(root == null){
            return ;
        }
        System.out.println(indent + root.value ) ;
        display(root.left , indent + "\t") ;
        display(root.right , indent + "\t") ;
    }
}

