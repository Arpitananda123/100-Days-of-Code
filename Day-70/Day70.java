public class Day70 {
        public static int largestAltitude(int[] gain) {
            int[] arr=new int[gain.length+1];
            int count=0;
            arr[0]=count;
            for(int i=1;i<=gain.length;i++){
               count+=gain[i-1];
               arr[i]=count;
            }
            int max=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
            
        }
        public static void main(String[] args){
            int[] gain=new int[]{-5,1,5,0,-7};
            System.out.println(largestAltitude(gain));
        }
}
