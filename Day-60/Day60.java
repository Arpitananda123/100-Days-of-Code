public class Day60 {
        public static int countNegatives(int[][] grid) {
            int count=0;
            for(int i=0;i<grid.length;i++){
              for(int j=0;j<grid[0].length;j++){
                 if(grid[i][j]<0){
                    count+=grid[0].length-j;
                    break;
                 }
                 
              }
            }
            return count;
    
        }
        public static void main(String[] args){
                int[][] grid=new int[][]{{3,2},{1,0}};
                System.out.println(countNegatives(grid));
        }
    
}
