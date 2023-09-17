public class DSA_12_ReturnNthToLastLL {
    public int nthToLast(LinkedList ll, int n){
        
        Node tempNode = ll.tail;
        
        for(int i=ll.size-1; i >= ll.size-(n-1); i--){
            tempNode = tempNode.prev;
        }
        int result = tempNode.value;
        
        return result;
    }
}
