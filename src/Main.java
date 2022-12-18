import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        Player player1 = new Player("Player 1", 1);
        Player player2 = new Player("Player 2", 2);

        while (true) {
            // Player 1's turn
            System.out.println("It's " + player1.getName() + "'s turn.");
            int row = getInput("Enter row (0-2): ");
            int col = getInput("Enter column (0-2): ");
            board.shoot(row, col, player1);

            if (board.wins(player1)) {
                System.out.println(player1.getName() + " wins!");
                break;
            }

            if (board.isDraw()) {
                System.out.println("It's a draw!");
                break;
            }

            System.out.println("It's " + player2.getName() + "'s turn.");
            row = getInput("Enter row (0-2): ");
            col = getInput("Enter column (0-2): ");
            board.shoot(row, col, player2);

            if (board.wins(player2)) {
                System.out.println(player2.getName() + " wins!");
                break;
            }

            if (board.isDraw()) {
                System.out.println("It's a draw!");
                break;
            }
        }
    }

    // Method to get input from the user
    public static int getInput(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.print(prompt);
        return in.nextInt();
    }
}