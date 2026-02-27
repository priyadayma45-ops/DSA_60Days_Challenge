public class Day01_SudokuSolver {

    private boolean isSafe(char[][] b, int r, int c, char d) {
        for (int i = 0; i < 9; i++)
            if (b[i][c] == d || b[r][i] == d) return false;
        int sr = (r/3)*3, sc = (c/3)*3;
        for (int i = sr; i < sr+3; i++)
            for (int j = sc; j < sc+3; j++)
                if (b[i][j] == d) return false;
        return true;
    }

    private boolean solve(char[][] b, int r, int c) {
        if (r == 9) return true;
        int nr = (c==8)? r+1:r, nc = (c==8)?0:c+1;
        if (b[r][c] != '.') return solve(b, nr, nc);
        for (char d='1'; d<='9'; d++)
            if (isSafe(b,r,c,d)) {
                b[r][c] = d;
                if (solve(b,nr,nc)) return true;
                b[r][c] = '.';
            }
        return false;
    }

    public void solveSudoku(char[][] b){ solve(b,0,0); }
    public static void main(String[] args) {
        Day01_SudokuSolver s = new Day01_SudokuSolver();
        char[][] b = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        s.solveSudoku(b);
        for (char[] r : b){ for (char c:r) System.out.print(c+" "); System.out.println(); }
    }
}
