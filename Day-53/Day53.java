public class Day53 {
        public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
            int count=0;
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    int m=nums2[j]*k;
                    if(nums1[i]%m==0){
                        count+=1;
                    }
                }
            }
            return count;
            
        }
        public static void main(String[] args){
            int[] nums1=new int[]{1,3,4};
            int[] nums2=new int[]{1,3,4};
            int k=1;
            System.out.println(numberOfPairs(nums1,nums2,k));
        }
    
}
