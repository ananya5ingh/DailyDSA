/*
10.10.2023
Question:
Stack Minimum
How would you design a stack which, in addition to push and pop, 
has a function min which returns the minimum element? 
Push, pop and min should all operate in O(1).
 */

class Node{
    int value;
    Node next;

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}

class StackMin{

    Node top;
    Node min;

    public StackMin(){
        top = null;
        min = null;
    }

    public int min(){
        return min.value;
    }

    public void push(int value){
        if(min == null){
            min = new Node(value, min);
        }
        else if(min.value < value){
            min = new Node(min.value, min);
        }
        else{
            min = new Node(value, min);
        }
        top = new Node(value, top);
    }

    public int pop(){
        min = min.next;
        int result = top.value;
        top = top.next;
        return result;
    }
}
public class DSA_23_StackMinimum {

    public static void main(String[] args){

        StackMin newStack = new StackMin();

        newStack.push(5);
        System.out.println(newStack.min());

        newStack.push(6);
        System.out.println(newStack.min());

        newStack.push(3);
        System.out.println(newStack.min());

        newStack.push(7);
        System.out.println(newStack.min());

        newStack.pop();
        System.out.println(newStack.min());
        
        newStack.pop();
        System.out.println(newStack.min());
    }
    
    
    

}
