class Solution {
    public boolean isValidSudoku(char[][] board) {

        //handle each row
        for(int i = 0; i<board.length; i++){
                    Set<Integer> set1 = new HashSet<>();

            for(int j = 0;j<board.length;j++){
                if(board[i][j] == '.') continue;
                int val = board[i][j] - '0';
                if(set1.contains(val))
                return false;
                set1.add(val);
            }
        }

        //handle each column
         for(int i = 0; i<board.length; i++){
                    Set<Integer> set1 = new HashSet<>();

            for(int j = 0;j<board.length;j++){
                if(board[j][i] == '.') continue;
                int val = board[j][i] - '0';
                if(set1.contains(val))
                return false;
                set1.add(val);
            }
        }

        //handle 3*3
        for(int square = 0;square<9;square++){
            Set<Integer> seen = new HashSet<>();
            for(int i = 0;i<3;i++){
                for(int j = 0;j<3;j++){
                    int row = (square/3)*3+i;
                    int col = (square%3)*3+j;
                    if(board[row][col] == '.') continue;
                    int val = board[row][col]-'0';
                    if(seen.contains(val)) return false;
                    seen.add(val);
                }
            }
        }

        return true;
    }
}
