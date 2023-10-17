package stepone;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LadderStepThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player names: (Separate names with comma(,))");
        List<String> players = Arrays.asList(scanner.next().split(","));
        System.out.println("Height of ladder: ");
        int ladderHeight = scanner.nextInt();
        scanner.close();

        Ladder ladder = new Ladder(ladderHeight, players);
        System.out.println("Result");
        ladder.printLadder();
    }
}
