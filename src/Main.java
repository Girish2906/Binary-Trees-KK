import java.util.Arrays;
import java.util.Scanner;

import BinaryTrees.BinaryTree ;

class Notification{
    public void sendNotification(){
        System.out.println("Email sent");
    }
}

class TextNotification extends Notification{
    @Override
    public void sendNotification(){
        System.out.println("Text sent");
    }
}

class WptNotification extends Notification{
    @Override
    public void sendNotification(){
        System.out.println("Whatsapp sent");
    }
}


public class Main {
    public static void main(String[] args)
    {
        System.out.println("Decoding Binary Tree in JAVA\n") ;
        Scanner sc = new Scanner(System.in) ;
        BinaryTree obj = new BinaryTree() ;
        obj.populate(sc) ;
        obj.display() ;
//        Notification obj = new WptNotification() ;
//        obj.sendNotification();
        //        System.out.println("Hello world there!");
//        int[] arr = {1 , 2 , 3 , 4 , 5} ;
//        System.out.println(Arrays.toString(arr));
//        change(arr) ;
//        System.out.println(Arrays.toString(arr));
    }
//    static void change(int [] arr){
//        arr[0] = 2410 ;
//    }

}