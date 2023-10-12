/*
13.10.2023
Question:
Minimal Tree
Given a sorted (increasing order) array with unique integer elements, 
write an algorithm to create a binary search tree with minimal height.
 */


public class DSA_31_MinimalTree {
	public int data;      
	public DSA_31_MinimalTree left;    
	public DSA_31_MinimalTree right; 
	public DSA_31_MinimalTree parent;
	public int size = 0;
 
	public DSA_31_MinimalTree(int d) {
		data = d;
		size = 1;
	}
 
  public boolean isBST() {
		if (left != null) {
			if (data < left.data || !left.isBST()) {
				return false;
			}
		}
		
		if (right != null) {
			if (data >= right.data || !right.isBST()) {
				return false;
			}
		}		
		
		return true;
	}
	
	public int height() {
		int leftHeight = left != null ? left.height() : 0;
		int rightHeight = right != null ? right.height() : 0;
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	private void setLeftChild(DSA_31_MinimalTree left) {
		this.left = left;
		if (left != null) {
			left.parent = this;
		}
	}
	
	private void setRightChild(DSA_31_MinimalTree right) {
		this.right = right;
		if (right != null) {
			right.parent = this;
		}
	}
	
	
	private static DSA_31_MinimalTree createMinimalBST(int arr[], int start, int end){
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		DSA_31_MinimalTree n = new DSA_31_MinimalTree(arr[mid]);
		n.setLeftChild(createMinimalBST(arr, start, mid - 1));
		n.setRightChild(createMinimalBST(arr, mid + 1, end));
		return n;
	}
	
	public static DSA_31_MinimalTree createMinimalBST(int[] array) {
		return createMinimalBST(array, 0, array.length - 1);
	}
	
 
} 
