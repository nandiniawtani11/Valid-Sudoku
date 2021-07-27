class Solution {
    public boolean isValidSudoku(char[][] board) {  
        Set<String>set=new HashSet<>();
        int i=0;
        int j=0;
        while(i<9)
        {
            j=0;
            while(j<9)
            {
                if(board[i][j]!='.')
                {
                    String row= "Row + "+i+board[i][j];
                    String col= "Col + "+j+board[i][j];
                    String box= "box + "+((i/3)*3+j/3)+board[i][j];
                    if(!set.add(row) || !set.add(col) || !set.add(box) )
                        return false;
                    else
                    {
                        set.add(row);
                        set.add(col);
                        set.add(box);
                    }
                }
               j++;                
            }
            i++;
        }
        return true;
    }
}
