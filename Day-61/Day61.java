public class Day61 {
        public static int maximumCount(int[] nums) {
            int maxp=0;
            int maxn=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<0){
                    maxn+=1;
                }else if(nums[i]==0){
                    maxp+=0;
                }else{
                    maxp+=nums.length-i;
                    break;
                }
            }
            if(maxp>=maxn && maxn==0){
                return maxp;
            }else if(maxn>=maxp && maxp==0){
                return maxn;
            }else if(maxp>=maxn){
                return maxp;
            }else{
                return maxn;
            }
            
        }
        
        public static void main(String[] args){
            int[] nums=new int[]{-2,-1,-1,1,2,3};
            System.out.println(maximumCount(nums));
        }
    
}
