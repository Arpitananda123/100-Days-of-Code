public class Day54 {
        public static int arithmeticTriplets(int[] nums, int diff) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    for(int k=j+1;k<nums.length;k++){
                        if(nums[k]-nums[j]==diff && nums[j]-nums[i]==diff){
                            count+=1;
                        }
                    }
                }
    
            }
            return count;
    
            
        }
        public static void main(String[] args){
            int[] nums=new int[]{0,1,4,6,7,10};
            int diff=3;
            System.out.println(arithmeticTriplets(nums,diff));


        }
    
}
