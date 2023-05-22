import java.util.Scanner;

import static utilities.FileTools.fileExists;
import static utilities.TerminalColors.ANSI_BLUE;
import static utilities.TerminalColors.ANSI_RESET;

public final class Launcher {

    private Launcher() {
    }

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){
        Scanner sc = new Scanner(System.in);
        fileExists();
        while (true) {
            title();
            switch (sc.next()) {
                case "1":
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
                        " 1 -> Stats" + "\n" +
                        " 0 -> Exit" + ANSI_RESET
        );
    }
}
