
import java.util.ArrayList;
public class Day38 {
        public static int[] createTargetArray(int[] nums, int[] index) {
            int[] ans=new int[nums.length];
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                list.add(index[i],nums[i]);
            }
            for(int i=0;i<list.size();i++){
                ans[i]=list.get(i);
            }
            return ans;
            
        }
        public static void main(String[] args){
           int[] nums=new int[]{0,1,2,3,4};
           int[] index=new int[]{0,1,2,2,1};
           int[] result=createTargetArray(nums,index);
           System.out.print("[ ");
           for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println("]");
        }
    
    
}
