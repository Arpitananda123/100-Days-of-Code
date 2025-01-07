public class Day37 {
        public static int[] leftRightDifference(int[] nums) {
            int[] leftsum=new int[nums.length];
            int[] rightsum=new int[nums.length];
            int[] ans=new int[nums.length];
            leftsum[0]=0;
            rightsum[nums.length-1]=0;
            for(int i=1;i<nums.length;i++){
                leftsum[i]=leftsum[i-1]+nums[i-1];
            }
            for(int i=nums.length-2;i>=0;i--){
                rightsum[i]=nums[i+1]+rightsum[i+1];
    
            }
            for(int k=0;k<nums.length;k++){
                ans[k]=Math.abs(leftsum[k]-rightsum[k]);
                
            }
            return ans;
    
            
        }

        public static void main(String[] args){
            int[] nums=new int[]{10,4,8,3};
            int[] result=leftRightDifference(nums);
            System.out.print("[ ");
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println("]");
        }
    
    
}
