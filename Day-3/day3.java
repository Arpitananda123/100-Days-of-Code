
public class Day3 {

        public Day3() {
        }
 
        public static boolean isPalindrome(int x) {
            int num=x;
            while(num!=0){
                num/=10;
            }
    
            int rev=0;
            int m=x;
            while(m!=0){
                int k=m%10;
                rev=rev*10+k;
                m/=10;
            }
    
            if((rev==x)&&(x>=0)){
                return true;
            }else{
                return false;
            }
            
        }
        
        public static void main(String[] args){
            int k=5668;
            Boolean ans=isPalindrome(k);
            System.out.println(ans);


        }
    
    
}
