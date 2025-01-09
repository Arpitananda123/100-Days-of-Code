public class Day40 {
        public static double[] convertTemperature(double celsius) {
            double[] ans=new double[2];
            ans[0]=celsius+273.15;
            ans[1]=celsius*1.80+32.00;
            return ans;
        }
        public static void main(String[] args){
            double celsius=36.50;
            double[] result=convertTemperature(celsius);
            System.out.print("[ ");
            for(int i=0;i<result.length;i++){
                 System.out.print(result[i]+" ");
             }
             System.out.println("]");
         }
}
