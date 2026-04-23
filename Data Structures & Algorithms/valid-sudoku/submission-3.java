class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                // Encode uniqueness constraints
                String rowKey = c + " in row " + i;
                String colKey = c + " in col " + j;
                String boxKey = c + " in box " + (i / 3) + "-" + (j / 3);

                // If any already exists → duplicate
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
                }
            }
        }
        return true;
    }
}
