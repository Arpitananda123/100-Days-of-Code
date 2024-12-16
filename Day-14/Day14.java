

public class Day14 {
        public static int mySqrt(int x) {
            int low=0;
            int high=x;
            int ans=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if((long) mid*mid<=(long)(x)){
                    ans=mid;
                    low=mid+1;
                }else{
                    high=mid-1;
                }
    
            }
            return ans;
    
            
        }
        public static void main(String[] args){
            int x=8;
            int k=mySqrt(x);
            System.out.println(k);
        }
    
    
}
