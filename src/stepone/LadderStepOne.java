package stepone;

import java.util.Scanner;

public class LadderStepOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.println("Height of ladder: ");
        int ladderHeight = scanner.nextInt();
        scanner.close();

        Ladder ladder = new Ladder(ladderHeight, numPlayers);
        ladder.printLadder();
    }

}
