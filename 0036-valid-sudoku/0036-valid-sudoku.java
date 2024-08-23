class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                else if (set.contains(board[i][j])) return false;
                else set.add(board[i][j]);
            }
        }
        for(int i = 0; i < 9; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i] == '.') continue;
                else if (set.contains(board[j][i])) return false;
                else set.add(board[j][i]);
            }
        }
        
        
        for(int blockRow = 0; blockRow < 9; blockRow+=3){
            for(int blockCol = 0; blockCol < 9; blockCol+=3){
                HashSet<Character> set = new HashSet<>();
                for(int row = 0; row < 3; row++){
                    for(int col = 0; col < 3; col++){
                        int i = blockRow + row;
                        int j = blockCol + col;
                        if(board[i][j] == '.') continue;
                        else if (set.contains(board[i][j])) return false;
                        else set.add(board[i][j]);
                    }
                }
            }
        }
        
        return true;
        
        
    }
}