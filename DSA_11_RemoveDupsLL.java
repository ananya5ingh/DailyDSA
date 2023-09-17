/*
17.09.2023

Question:
Remove Dups
Write a method to remove duplicates from an unsorted linked list.

Example:
linkedList = 1->2->1->3
deleteDups(linkedList)
//Output
1->2->3
 */

import java.util.HashSet;

public class DSA_11_RemoveDupsLL {

    public void deleteDups(LinkedList ll){

        HashSet<Integer> hs = new HashSet<>();
        
        Node current = ll.head;
        Node prev = null;

        while(current != null){
            int currVal = current.value;
            if(hs.contains(currVal)){
                prev.next = current.next;
                ll.size--;
            }
            else{
                hs.add(currVal);
                prev = current;
            }
            current = current.next;
        }
    } // TC: O(n) // SC: O(n)(cause storing in hashset)
    

}
