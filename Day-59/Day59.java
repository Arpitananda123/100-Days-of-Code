import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day59 {
        public static List<Integer> targetIndices(int[] nums, int target) {
            Arrays.sort(nums);
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    ans.add(i);
                }
            }
            return ans;
            
        }
        public static void main(String[] args){
            int[] nums=new int[]{1,2,5,2,3};
            int target=2;
            System.out.println(targetIndices(nums,target));
        }
    
}
