

public class Day43 {
        public static int sumOfMultiples(int n) {
            int count=0;
            for(int i=1;i<n+1;i++){
                if(i%3==0 || i%5==0 || i%7==0){
                    count+=i;
                }
            }
            return count;
            
        }
        
        public static void main(String[] args){
            int n=7;
            int count=sumOfMultiples(n);
            System.out.println(count);
        }
    
}
