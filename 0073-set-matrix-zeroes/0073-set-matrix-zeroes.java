class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        int c =0;
        while(c<row.size()){
            if(matrix[0].length<matrix.length){
                for(int i=0;i<matrix.length;i++){
                    matrix[i][col.get(c)]=0;                    
                    if(i<matrix[0].length){

                        matrix[row.get(c)][i]=0;
                    }
                }
            }
            else if(matrix[0].length>matrix.length){
                for(int i=0;i<matrix[0].length;i++){
                    matrix[row.get(c)][i]=0;
                    if(i<matrix.length){
                        matrix[i][col.get(c)]=0;
                    }
                }
            }
            else{
                for(int i=0;i<matrix.length;i++){
                    matrix[row.get(c)][i]=0;
                    matrix[i][col.get(c)]=0;
                }
            }
            c++;
        }
        
        
        
    }
}