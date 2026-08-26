class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int n = board[i][j] - '1';
                    if (row[n]) return false;
                    row[n] = true;
                }
                if (board[j][i] != '.') {
                    int n = board[j][i] - '1';
                    if (col[n]) return false;
                    col[n] = true;
                }
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                boolean[] box = new boolean[9];
                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        if (board[r][c] != '.') {
                            int n = board[r][c] - '1';
                            if (box[n]) return false;
                            box[n] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}