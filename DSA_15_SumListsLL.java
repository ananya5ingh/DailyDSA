public class DSA_15_SumListsLL {
        public LinkedList sumLists(LinkedList list1 , LinkedList list2){
                
        Node currentNode1 = list1.head;
        Node currentNode2 = list2.head;
        int carry = 0;
        LinkedList resultLL = new LinkedList();
        while(currentNode1 != null || currentNode2 != null){
            int partSum = carry;
            if(currentNode1 != null){
                partSum += currentNode1.value;
                currentNode1 = currentNode1.next;
            }
            if(currentNode2 != null){
                partSum += currentNode2.value;
                currentNode2 = currentNode2.next;
            }
            resultLL.insert(partSum%10);
            carry = partSum/10;
        }
        resultLL.traversal();
        return resultLL;
    }

    // public LinkedList reverseLL(LinkedList ll){
        
    //     Node currentNode = ll.head;
    //     ll.tail = ll.head;
        
    //     while(currentNode != null){
            
    //         Node nextNode = currentNode.next;
            
    //         currentNode.next = ll.head;
    //         ll.head = currentNode;
            
    //         currentNode = nextNode;
    //     }
        
    //     return ll;
    // }

    // public LinkedList sumLists(LinkedList list1 , LinkedList list2){
        
    //     LinkedList reversedLL1 = reverseLL(list1);
    //     LinkedList reversedLL2 = reverseLL(list2);
        
    //     LinkedList reversedResultLL = new LinkedList();
    //     reversedResultLL.create(0);
        
    //     Node currentNode1 = reversedLL1.head;
    //     Node currentNode2 = reversedLL2.head;
        
    //     int carry = 0;
        
    //     while(currentNode1 != null & currentNode2 != null){
            
    //         int partSum = currentNode1.value + currentNode2.value + carry;
    //         carry = 0;
            
    //         if(currentNode1.next != null & currentNode2.next != null){
    //             if(partSum>9){
    //                 partSum = partSum-10;
    //                 carry = 1;
    //             }
    //         }
            
    //         reversedResultLL.insert(partSum);

    //         currentNode1 = currentNode1.next;
    //         currentNode2 = currentNode2.next;
    //     }

    //     reversedResultLL.traversal();
    //     return reversedResultLL;
    // }
}
