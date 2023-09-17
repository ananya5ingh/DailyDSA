/*
17.09.2023

Question:
Return Nth to Last
Implement and algorithm to find the nth to last element of a singly linked list.

Example

linkedList = 1->2->3->4-5
deleteDups(linkedList, 2)
//Output
4
 */

public class DSA_12_ReturnNthToLastLL {
    public Node nthToLast(LinkedList ll, int n){

        // using two pointers
        Node pointer1 = ll.head; // let this be at the beginning
        Node pointer2 = ll.head; // put this n spaces apart from pointer 1

        for(int i=0; i<n; i++){
            if(pointer2.next == null){
                return null;
            }
            
            pointer2 = pointer2.next;
        }

        while(pointer2.next != null){ // to make sure pointers don't move forward when pointer 2 reaches the last node
           pointer1 = pointer1.next; 
           pointer2 = pointer1.next; 
           System.out.println("Pointer 1 loc: :"+pointer1.value);
           System.out.println("Pointer 2 loc: :"+pointer2.value);
           System.out.println();
        }
        return pointer1;
    }
    // TC: O(n) // SC: O(1)
}
