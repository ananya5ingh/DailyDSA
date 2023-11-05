import java.util.ArrayList;

public class DSA_45_CreateTargetArrayInGivenOrder {
    
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int[] ans =  new int[nums.length];
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            arrList.add(index[i], nums[i]);
        }
        for(int i=0; i<ans.length; i++){
            ans[i] = arrList.get(i);
        }
        return ans;
    
}
}
