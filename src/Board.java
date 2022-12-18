public class Board {

    // Constants for empty, player 1, and player 2 spaces
    public static final int EMPTY = 0;
    public static final int PLAYER_1 = 1;
    public static final int PLAYER_2 = 2;

    // The game board
    private int[][] board;

    // Constructor
    public Board() {
        // Initialize the board
        board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    // Method to place a marker on the board
    public void shoot(int row, int col, Player player) {
        if (board[row][col] != EMPTY) {
            System.out.println("This space is already occupied. Choose another space.");
            return;
        }
        board[row][col] = (player.getId() == 1) ? PLAYER_1 : PLAYER_2;
    }


    public boolean wins(Player player) {
        int playerId = (player.getId() == 1) ? PLAYER_1 : PLAYER_2;
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == playerId && board[i][1] == playerId && board[i][2] == playerId) {
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == playerId && board[1][i] == playerId && board[2][i] == playerId) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == playerId && board[1][1] == playerId && board[2][2] == playerId) {
            return true;
        }
        if (board[0][2] == playerId && board[1][1] == playerId && board[2][0] == playerId) {
            return true;
        }
        return false;
    }

    public boolean isDraw() {
        // Check if all spaces are filled
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
