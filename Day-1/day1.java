import java.util.HashSet;
public class day1 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);

         }
         if(set.size()<n){
            return true;
         }else{
            return false;
         }    
    }
    public static void main(String[] args) {
        int nums[] = new int[] {1,2,3,1};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
}