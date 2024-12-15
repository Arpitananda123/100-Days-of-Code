
public class Day12 {
        public static int removeElement(int[] nums, int val) {
            int n=nums.length;
            int j=0;
            for(int i=0;i<n;i++){
                if(nums[i]==val){
                    continue;
                }else{
                    nums[j]=nums[i];
                }
                j++;
                
            }
            return j;
            
        }

    public static void main(String[] args){
        int[] num=new int[] {3,2,2,3};
        int val=3;
        int k=removeElement(num,val);
        System.out.println(k);
    }
    
    
}
