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

        LinkedList ll = new LinkedList();

        DSA_11_RemoveDupsLL obj1 = new DSA_11_RemoveDupsLL();
        DSA_12_ReturnNthToLastLL obj2 = new DSA_12_ReturnNthToLastLL();
        DSA_14_PartitionLL obj3 = new DSA_14_PartitionLL();

        ll.create(1);

        ll.insert(9);
        ll.insert(5);
        ll.insert(10);
        ll.insert(2);

        ll.traversal();

        // obj1.deleteDups(ll);
        // ll.traversal();

        Node result1 = obj2.nthToLast(ll, 2);

        System.out.println(result1.value);
        ll.traversal();
        obj3.partition(ll, 4);
        ll.traversal();
        


        

    }
}
