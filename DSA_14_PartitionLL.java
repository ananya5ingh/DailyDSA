public class DSA_14_PartitionLL {
    LinkedList partition(LinkedList ll, int x) {
        
        Node currentNode = ll.head;
        ll.tail = ll.head;

        while(currentNode != null){

            Node next = currentNode.next;
            if(currentNode.value < x){

                currentNode.next = ll.head;
                ll.head = currentNode;
            }
            else{
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
  }


















//     LinkedList partition(LinkedList ll, int x) {
        
//         Node tempNode1 = ll.head;
//         Node tempNode2 = new Node();
//         for(int i=0; i<ll.size; i++){
//             if(tempNode1.value>x){
//                 ll.insert(tempNode1.value);
//                 ll.head = tempNode1.next;
//                 tempNode1 = ll.head;
//                 continue;
//                 // delete node tempNode1 is pointing to
                
//             }
//             if(tempNode1.next.value>x){

//                 ll.insert(tempNode1.next.value);
//                 tempNode1.next = tempNode1.next.next;
//                 tempNode1 = tempNode1.next;
                
//             }
//             tempNode1 = tempNode1.next;
//         }
        
//         return ll;
//   }
}
