/*
10.10.2023
Question:
Queue via Stacks
Implement Queue class which implements a queue using two stacks.
 */

import java.util.Stack;

class QueueViaStack{

    Stack<Integer> stackNewest, stackOldest;

    public QueueViaStack(){
        stackNewest = new Stack<Integer>();
        stackOldest = new Stack<Integer>();
    }

    public int size(){

        return stackNewest.size() + stackOldest.size();
    }

    public void enqueue(int value){

        stackNewest.push(value);
    }

    //helper function
    private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                int poppedOut = stackNewest.pop();
                stackOldest.push(poppedOut);
            }
        }
    }

    public int dequeue(){
        shiftStacks();
        return stackOldest.pop();
    }

    public int peek(){
        shiftStacks();
        return stackOldest.peek();
    }
}

public class DSA_24_QueueViaStacks {
    
    public static void main(String[] args){

        QueueViaStack newQueue = new QueueViaStack();

        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);

        // System.out.println(newQueue.dequeue());
        newQueue.enqueue(4);
        //System.out.println(newQueue.dequeue());
        System.out.println(newQueue.peek());

    }
}
