import java.util.ArrayList;
import java.util.List;

public class Day50 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int rowbegin=0;
        int rowend=matrix.length-1;
        int colbegin=0;
        int colend=matrix[0].length-1;
        while(rowbegin<=rowend && colbegin<=colend){
            for(int j=colbegin;j<=colend;j++){
                ans.add(matrix[rowbegin][j]);
            }
            rowbegin++;

            for(int j=rowbegin;j<=rowend;j++){
                ans.add(matrix[j][colend]);
            }
            colend--;

            if(rowbegin<=rowend){
                for(int j=colend;j>=colbegin;j--){
                    ans.add(matrix[rowend][j]);
                }
                rowend--;
            

            }
            
            if(colbegin<=colend){
                for(int j=rowend;j>=rowbegin;j--){
                    ans.add(matrix[j][colbegin]);
                }
                colbegin++;
            }
            
        }
        return ans;
        
    }

    public static void main(String[] args){
        int[][] matrix=new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        List<Integer> result=spiralOrder(matrix);
            System.out.print("[ ");
            for(int i=0;i<result.size();i++){
                 System.out.print(result.get(i)+" ");
             }
             System.out.println("]");

    }

    
}
