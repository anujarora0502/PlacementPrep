// passed on leetcode

import java.util.*;

class NQueens {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];

        List<List<String>> ans = new ArrayList<>();

        NQueensRec(n, board, ans, 0);

        return ans;

    }

    public void NQueensRec(int n, boolean[][] board, List<List<String>> ans, int r) {

        if (r == n) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (validityChecker(r, i, board)) {
                board[r][i] = true;
                if (r == n - 1) {
                    ans.add(boardToString(board));
                }
                NQueensRec(n, board, ans, r + 1);
                board[r][i] = false;
            }
        }

    }

    public List<String> boardToString(boolean[][] board) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String str = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]) {
                    str += "Q";
                } else {
                    str += ".";
                }
            }

            result.add(str);
        }

        return result;
    }

    public boolean validityChecker(int row, int col, boolean[][] board) {
        int[][] directions = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 } };

        for (int i = 0; i < 8; i++) {

            int itrRow = row;
            int itrColumn = col;

            while (true) {

                itrRow = itrRow + directions[i][0];
                itrColumn = itrColumn + directions[i][1];
                if (itrRow >= 0 && itrRow < board.length && itrColumn >= 0 && itrColumn < board[0].length) {
                    if (board[itrRow][itrColumn]) {
                        return false;
                    }
                } else {
                    break;
                }

            }

        }

        return true;

    }
}