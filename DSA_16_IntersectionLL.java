/*
25.09.2023
Starting DailyDSA again, this time for real

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

  // changing starting point for longer LL

  longer = getKthNode(longer, )

    
    Node tempNode1 = lla.head;
    Node tempNode2 = llb.head;
    Node outputNode = null; 
    
    boolean intersectFlag = false;
    
    if(tempNode1 == tempNode2){
        intersectFlag = true;
    }
    
    while(tempNode1 != null){
        while(tempNode2 != null){
            if(tempNode2 == tempNode1){
                intersectFlag = true;
                outputNode = tempNode1;
                break;

            }
            tempNode2 = tempNode2.next;
        }
        tempNode1 = tempNode1.next;
    }
    
   
  return outputNode;

}

}

