public class Day57 {
        public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
            int l = m-1;
            int r = n-1;
            int f = n+m-1;
    
            while(r>=0){
                if(l>=0 && nums1[l]>nums2[r]){
                    nums1[f--]= nums1[l--];
                }else{
                    nums1[f--]= nums2[r--];
                }
            }
            return nums1;
    
        }
        public static void main(String[] args){
            int[] num1=new int[]{1,2,3,0,0,0};
            int[] num2=new int[]{2,5,6};
            int m=3;
            int n=3;
            int[] result=merge(num1,m,num2,n);
            System.out.print("[ ");
            for(int i=0;i<result.length;i++){
                 System.out.print(result[i]+" ");
             }
             System.out.println("]");
        }
    
}
