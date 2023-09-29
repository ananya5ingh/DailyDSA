class Node{

    public int value;
    public Node next;
    public Node prev;
}

class LinkedList{

    public Node head;
    public Node tail;
    public int size;
    

    public void create(int nodeValue){

        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insert(int nodeValue){

        if(head == null){
            create(nodeValue);
            return;
        }
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traversal(){

        Node tempNode = head;
        for(int i=0; i<size; i++){
            System.out.print(tempNode.value);
            tempNode = tempNode.next;

            if(i != size-1){
                System.out.print(" --> ");
            }
        }
        System.out.println("\n"); 
    }
}


public class DSA_LL_Class {
    
    public static void main(String[] args){

        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();

        DSA_11_RemoveDupsLL obj1 = new DSA_11_RemoveDupsLL();
        DSA_12_ReturnNthToLastLL obj2 = new DSA_12_ReturnNthToLastLL();
        DSA_14_PartitionLL obj3 = new DSA_14_PartitionLL();
        DSA_15_SumListsLL obj4 = new DSA_15_SumListsLL();
        DSA_16_IntersectionLL obj5 = new DSA_16_IntersectionLL();

        // ll1.insert(7);
        // ll1.insert(1);
        // ll1.insert(6);

        // ll1.traversal();

        // ll2.insert(5);
        // ll2.insert(9);
        // ll2.insert(2);

        // ll2.traversal();

        // obj1.deleteDups(ll);
        // ll.traversal();

        // Node result1 = obj2.nthToLast(ll, 2);

        // System.out.println(result1.value);
        // ll.traversal();

        // obj3.partition(ll, 4);
        // ll.traversal();
        
        obj4.sumLists(ll1, ll2);

        LinkedList llA = new LinkedList();
        llA.insert(3);
        llA.insert(1);
        llA.insert(5);
        llA.insert(9);
        LinkedList llB = new LinkedList();
        llB.insert(2);
        llB.insert(4);
        llB.insert(6);
        
        obj5.addSameNode(llA, llB, 7);
        obj5.addSameNode(llA, llB, 2);
        obj5.addSameNode(llA, llB, 1);
        Node inter = obj5.findIntersection(llA, llB);
        System.out.println(inter.value);
        
        // 7 

    }
}
