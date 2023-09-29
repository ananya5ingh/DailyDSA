/*
27.09.2023
Starting DailyDSA again, this time for real

Question:
Intersection
Given two (singly) linked lists, determine if the two lists intersect. 
Return the intersecting node. Note that the intersection is defined based on reference, not value. 
That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, 
then they are intersecting.

LinkedList llA = new LinkedList();
   llA.insertNode(3);
   llA.insertNode(1);
   llA.insertNode(5);
   llA.insertNode(9);
   LinkedList llB = new LinkedList();
   llB.insertNode(2);
   llB.insertNode(4);
   llB.insertNode(6);
   Exercise ex = new Exercise();
   ex.addSameNode(llA, llB, 7);
   ex.addSameNode(llA, llB, 2);
   ex.addSameNode(llA, llB, 1);
   Node inter = ex.findIntersection(llA, llB);
   System.out.println(inter.value);
 
// 7

 */
public class DSA_16_IntersectionLL{

  //getKthNode
    public Node getKthNode(Node head, int k){

      Node current = head;
      while(k>0 && current != null){
        current = current.next;
        k--;
      }
      return current;

    }

  // Add same node 
  public void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
    Node newNode = new Node();
    newNode.value = nodeValue;
    llA.tail.next = newNode;
    llA.tail = newNode;
    llB.tail.next = newNode;
    llB.tail = newNode;

  }

//TODO
  public Node findIntersection(LinkedList lla, LinkedList llb){

    if(lla.head == null | llb.head == null){
      return null;
    }

    if(lla.tail != llb.tail){
      return null;
    }

    Node shorter = new Node();
    Node longer = new Node();

    if(lla.size > llb.size){
      longer = lla.head;
      shorter = llb.head;
    }
    else{
      shorter = lla.head;
      longer = llb.head;
    }

    longer = getKthNode(longer, Math.abs(lla.size - llb.size)); // changing starting point for longer LL
    while(shorter != longer){ // loop until both LL(shorter and longer)point to same node
      shorter = shorter.next;
      longer = longer.next;
    }
    return longer; // can return either, shorter or longer (since they point to the same node)
  } // TC: O(a+b) where a is the size of lla and b is the size of llb // SC: O(1)
}

