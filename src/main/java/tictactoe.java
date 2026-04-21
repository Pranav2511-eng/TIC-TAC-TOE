import java.util.Random;
import java.util.Scanner;
public class tictactoe {
     static char[][] board = new char[3][3];
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        initializeBoard();
        tossAndAssignSymbols();
        printBoard();
        displayTossResult();

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static void tossAndAssignSymbols() {
        Random rand = new Random();
        isHumanTurn = rand.nextBoolean();

        if (isHumanTurn) {
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human plays first.");
        } else {
            System.out.println("Computer plays first.");
        }

        System.out.println("Human symbol: " + humanSymbol);
        System.out.println("Computer symbol: " + computerSymbol);
    }

    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        int slot = sc.nextInt();
        return slot;
    }
}
