public class Day55 {
        public static int countKDifference(int[] nums, int k) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                for(int j=i;j<nums.length;j++){
                    if(Math.abs(nums[i]-nums[j])==k){
                       count+=1;
                    }
                }
            }
            return count;
            
        }
        public static void main(String[] args){
            int[] nums=new int[]{1,2,2,1};
            int k=1;
            System.out.println(countKDifference(nums,k));

        }
    
}
