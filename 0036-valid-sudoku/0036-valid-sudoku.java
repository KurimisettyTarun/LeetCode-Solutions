class Solution {
    public boolean isValidSudoku(char[][] board) {
       //  public static boolean isValidSudoku(char[][] board) {
        Set<String> a=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch!='.'){
                    if(!a.add(ch+"in row"+i)||
                       !a.add(ch+"in col"+j)||
                       !a.add(ch+"in row"+i/3+"-"+j/3))
                       return false;
                }
            }
        }
        return true;
    }
}