class Solution {
    public int numRookCaptures(char[][] board) {
        int r=0;
        int c=0;
        for(int i=0; i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(board[i][j]=='R')
                {
                    r=i;
                    c=j;
                    return check(board,r,c);
                }
            }
        }
        return 0;
    }

    public int check(char[][] board, int r, int c){
        int res=0;

        for(int i=c-1;i>=0;i--)
        {
            if(board[r][i]=='B')break;
            else if(board[r][i]=='p')
            {
                res++;
                break;
            }
        }

        for(int i=c+1; i<8; i++)
        {
            if(board[r][i]=='B')break;
            else if(board[r][i]=='p')
            {
                res++;
                break;
            }
        }

        for(int i=r-1;i>=0;i--)
        {
            if(board[i][c]=='B')break;
            else if(board[i][c]=='p')
            {
                res++;
                break;
            }
        }
        for(int i=r+1;i<8;i++)
        {
            if(board[i][c]=='B')break;
            else if(board[i][c]=='p')
            {
                res++;
                break;
            }
        }
        return res;
    }
}