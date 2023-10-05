/*
5.10.2023

Question: 
Describe how you could use a single array to implement three stacks
 */

class ThreeInOne{

    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    // isFull
    public boolean isFull(int stackNum){
        if(sizes[stackNum] == stackCapacity){
            return true;
        }
        else{
            return false;
        }
    } 

    // isEmpty
    public boolean isEmpty(int stackNum){
        if(sizes[stackNum] == 0){
            return true;
        }
        else{
            return false;
        }
    } 

    private int indexOfTop(int stackNum){

        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    public void push(int stackNum, int value){

        if(isFull(stackNum)){
            System.out.println("The Stack is full.");
        }
        else{
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }
    }

    // pop
    public int pop(int stackNum){
        if(isEmpty(stackNum)){
            System.out.println("The Stack is Empty");
            return -1;
        }
        else{
            int topIndex = indexOfTop(stackNum);
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;
        }
    }

    // peek

    public int peek(int stackNum){
        if(isEmpty(stackNum)){
            System.out.println("the stack is empty");
            return -1;
        }
        else{
            return values[indexOfTop(stackNum)];
        }
    }
}




public class DSA_19_ThreeInOne_Stack {
    public static void main(String[] args){

        ThreeInOne newStacks = new ThreeInOne(3);
        boolean result1 = newStacks.isFull(2);
        System.out.println(result1);

        boolean result2 = newStacks.isEmpty(2);
        System.out.println(result2);

        newStacks.push(0,1);
        newStacks.push(0,2);
        newStacks.push(1,4);
        newStacks.push(1,5);
        newStacks.push(2,8);

        int result3 = newStacks.pop(0);
        System.out.println(result3);
    }
}
