public class Day41 {
        public static int differenceOfSums(int n, int m) {
            int div=0;
            int nondiv=0;
            for(int i=1;i<n+1;i++){
                if(i%m==0){
                    div=div+i;
                }else{
                    nondiv=nondiv+i;
                }
            }
            return nondiv-div;
            
        }
        public static void main(String[] args){
            int n=10;
            int m=3;
            System.out.println(differenceOfSums(n,m));
        }
    
    
}
