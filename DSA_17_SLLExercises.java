/*
27.09.2023

Question:
SLL Push Pop Get
*/

class SinglyLinkedList {
    
    public Node head;
    public Node tail;
    public int size;

    public Node insertSinglyLinkedList(int nodeValue) {
    head = new Node();
    Node node = new Node();
    node.next = null;
    node.value = nodeValue;
    head = node;
    tail = node;
    size = 1;
    return head;
  }

    public void push(int nodeValue) {
    if (head == null) {
      insertSinglyLinkedList(nodeValue);
      return;
    } else {
      Node node = new Node();
      node.value = nodeValue;
      node.next = null;
      tail.next = node;
      tail = node;
      size++;
    }
}
    
    // public void push(int nodeValue){
        
    //     Node node = new Node();
    //     node.value = nodeValue;
        
    //     if(head == null){
    //         head = node;
    //         tail = node;
    //         size = 1;
    //     }
    //     else{
    //         node.next = null;
    //         tail.next = node;
    //         tail = node;
    //         size++;
    //     }
    // }
// WHY WON'T THE TEST CASES PASS!
//     public Node pop() {
//     // TODO
//     if(head == null){
//         System.out.println("The SLL does not exist");
//         return null;
//     }
//     Node tempNode = head;
//     Node elementRemoved = null;

//     if(head == tail){
//         elementRemoved = head;
//         head = tail = null;
//     }
//     else{
//         for(int i=0; i<(size-1); i++){
//             elementRemoved = tempNode.next;
//             tempNode = tempNode.next;
//             // System.out.println(i+" "+size);
//             // System.out.println(tempNode.value);
//         }
//         if(tempNode == head){
        
//             head.next = null;
//             tail = head = null;
//             size--;
//             return null;
//         }
//         tempNode.next = null;
//         tail = tempNode;
//     }
//     size--;
//     return elementRemoved;
//   }

    public Node pop() {
    // TODO
    if(head == null){
        System.out.println("The SLL does not exist");
        return null;
    }
    Node tempNode;
    Node elementRemoved = null;

    if(head == tail){
        elementRemoved = head;
        head = tail = null;
    }
    else{
        tempNode = head;
        while(tempNode.next != tail){
            tempNode = tempNode.next;
            // System.out.println(i+" "+size);
            // System.out.println(tempNode.value);
        }
        elementRemoved = tempNode.next;
        tempNode.next = null;
        tail = tempNode;
    }
    size--;
    return elementRemoved;
  }

  // 28.09.2023

  public void traversal(){

        if(head == null){

            System.out.println("Single LL does not exist.");
        }// TC: O(1)
        else{
            Node tempNode = head; // TC: O(1)
            for(int i=0; i<size; i++){ // TC: O(n)
                System.out.print(tempNode.value);
            if(i != size-1){ // TC: O(1)
                System.out.print(" --> ");
            }
            tempNode = tempNode.next; // TC: O(1)
            }
        }
        System.out.println();
    }
  //Get
  public Node get(int index) {
      
      Node tempNode = head;
      for(int i=0; i<index; i++){
          tempNode = tempNode.next;
      }
      return tempNode;
  }

  public boolean insert(int data, int index) {
    //TODO
    
    if(index<0 | index>size){
        return false;
    }
    
    Node node = new Node();
    node.value = data;
    
    if(head == null){
        node.next = null;
        head = node;
        tail = node;
        // size = 1;
        // return true;
    }
    else if(index == 0){
        node.next = head;
        head = node;
    }
    else if(index == size-1){
        push(data);
    }
    else{
        Node tempNode = head;
        for(int i=0; i<index-1; i++){
            tempNode = tempNode.next;
        }
        node.next = tempNode.next;
        tempNode.next = node;
    }
    size++;
    return true;
  }

  // 29.09.2023
  public String rotate(int number) {
    // TODO
    Node tempNode = head;
    for(int i=1; i<=number; i++){
        
        push(tempNode.value);
        tempNode = tempNode.next;
        head = head.next;
    }
    return "success";
  }


// public String rotate(int number) {
//     int index = number;
//     if (number < 0) {
//       index = number + size;
//     }
//     if (index < 0 || index >= size) {
//       return null;
//     }
//     if (index == 0) {
//       return "No Rotation";
//     }
//     Node prevNode = head;
//     for(int i=0; i<index-1; i++) {
//       prevNode = prevNode.next;  
//     }
//     if (prevNode == null) {
//         return "No Rotation";
//       }
//     tail.next = head;
//     head = prevNode.next;
//     tail = prevNode;
//     prevNode.next = null;
//     return "Success";
//   }

// Set

  public boolean set(int index, int value) {
    // TODO
    if(index<0 || index >= size){
        return false;
    }
    Node tempNode = head;
    for(int i=0; i<index; i++){
        tempNode = tempNode.next;
    }
    tempNode.value = value;
    return true;
  }

}

public class DSA_17_SLLExercises {
    
    public static void main(String[] args){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(5);  // Success
        // System.out.println(singlyLinkedList.size);  // 1
        // System.out.println(singlyLinkedList.head.value); // 5
        // System.out.println(singlyLinkedList.tail.value);// 5
 
        singlyLinkedList.push(10);    // Success
        // System.out.println(singlyLinkedList.size);      // 2
        // System.out.println(singlyLinkedList.head.value);        // 5
        // System.out.println(singlyLinkedList.head.next.value);  // 10
        // System.out.println(singlyLinkedList.tail.value);    // 10

        singlyLinkedList.push(11);
        singlyLinkedList.push(12);
        singlyLinkedList.push(13);

        // System.out.println(singlyLinkedList.pop());

        singlyLinkedList.traversal();

        singlyLinkedList.insert(14, 1);
        singlyLinkedList.traversal();

        // singlyLinkedList.rotate(2);
        // singlyLinkedList.traversal();

        singlyLinkedList.set(2,111);
        singlyLinkedList.traversal();

        

        

    }
}
