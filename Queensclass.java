public class Queens {
    private int[][] board;
    private final int SIZE = 8;

    public Queens() {
        board = new int[SIZE][SIZE];
        clearBoard();
    }

    // Clears the chess board
    public void clearBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 0;
            }
        }
    }

    // Displays the chess board
    public void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 1) {
                    System.out.print(" Q "); // Queen is represented by Q
                } else {
                    System.out.print(" . "); // Empty square is represented by .
                }
            }
            System.out.println();
        }
    }

    // Other methods for solving the Eight Queens problem...
}
