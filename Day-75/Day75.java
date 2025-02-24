public class Day75 {
        public static int[] finalPrices(int[] prices) {
            for(int i=0;i<prices.length;i++){
                for(int j=i+1;j<prices.length;j++){
                    if(prices[i]>=prices[j]){
                        prices[i]=prices[i]-prices[j];
                        break;
                    }
                }
                
            }
            return prices;
        }
        public static void main(String[] args){
            int[] prices=new int[]{8,4,6,2,3};
            int[] result=finalPrices(prices);
            System.out.print("[ ");
            for(int i=0;i<result.length;i++){
                 System.out.print(result[i]+" ");
             }
             System.out.println("]");
        }
    
}
