import java.util.Scanner;

import static utilities.TerminalColors.ANSI_BLUE;
import static utilities.TerminalColors.ANSI_RESET;

public final class Launcher {

    private Launcher() {
    }

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            title();

            switch (scanner.next()) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "0":
                    return;
                default:
                    System.err.println("No such option");
            }
        }
    }

    private static void title() {
        System.out.println(
                ANSI_BLUE + "\n" +
                        "**************************************" + "\n" +
                        "***     Welcome to SwapAnomaly     ***" + "\n" +
                        "**************************************" + "\n" +
                        " 1 -> " + "\n" +
                        " 2 -> " + "\n" +
                        " 3 -> " + "\n" +
                        " 0 -> Exit" + ANSI_RESET
        );
    }
}
