

public class Day9 {
        public static int findMaxK(int[] nums) {
            int max=-1;
            for(int i=0;i<nums.length;i++){
                if(max<Math.abs(nums[i])){
                    for(int j=i+1;j<nums.length;j++){
                        if(nums[j]==-nums[i]){
                            max=Math.abs(nums[i]);
                        }
                    }
                }
            }
            return max;
            
            
        }
        public static void main(String[] args){
            int[] num=new int[] {-1,10,6,7,-7,1};
            int k=findMaxK(num);
            System.out.println(k);
        }
    
    
}
