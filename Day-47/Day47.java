public class Day47 {
        public static int differenceOfSum(int[] nums) {
            int esum=0;
            for(int i=0;i<nums.length;i++){
                esum+=nums[i];
            }
            int dsum=0;
            for(int i=0;i<nums.length;i++){
                int k=nums[i];
                while(k!=0){
                    int m=k%10;
                    dsum+=m;
                    k/=10;
                }
            }
            return Math.abs(esum-dsum);
            
        }
        public static void main(String[] args){
            int[] arr=new int[]{1,15,6,3};
            System.out.println(differenceOfSum(arr));
            
        }
    
}
