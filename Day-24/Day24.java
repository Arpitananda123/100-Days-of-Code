

public class Day24 {
        public static int numIdenticalPairs(int[] nums) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(j<i && nums[j]==nums[i]){
                        count++;
                    }
                }
            }
            return count;
            
        }
        public static void main(String[] args){
            int[] nums=new int[]{1,2,3,1,1,3};
            System.out.println(numIdenticalPairs(nums));
        }
    
    
}
