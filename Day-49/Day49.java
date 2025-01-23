public class Day49 {
        public static int[] smallerNumbersThanCurrent(int[] nums) {
            int[] ans=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                int k=nums[i];
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(k>nums[j]){
                        count+=1;
                    }
                }
                ans[i]=count;
            }
            return ans;
            
        }
        
        public static void main(String[] args){
            int[] nums=new int[]{8,1,2,2,3};
            int[] result=smallerNumbersThanCurrent(nums);
            System.out.print("[ ");
            for(int i=0;i<result.length;i++){
                 System.out.print(result[i]+" ");
             }
             System.out.println("]");
        }
    
}
