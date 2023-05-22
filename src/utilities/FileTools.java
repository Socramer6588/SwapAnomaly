package utilities;

import java.io.*;

public final class FileTools {

    private static final File SAVE_FILE = new File("./GameData/SaveFile.txt");
    private static final File TEMPORAL_SAVE_FILE = new File("./GameData/TemporalSaveFile.txt");

    private FileTools() {
    }

    public static void fileExists(){
/*        if (!SAVE_FILE.exists()) {
            SAVE_FILE.createNewFile();
            prepareSaveFile();
        }*/
        prepareSaveFile2();
    }

    private static void prepareSaveFile2() {
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(TEMPORAL_SAVE_FILE));
                BufferedReader br = new BufferedReader(new FileReader(SAVE_FILE))
        ) {

            String comparator;

            while ((comparator = br.readLine()) != null) {
                System.out.println("0");
                if (comparator.split(" = ")[0].equals("PilotName")) {
                    comparator = comparator.replaceAll("Socramer", "NoName");
                    bw.write(comparator);
                    bw.write("\n");
                } else {
                    bw.write(comparator);
                    bw.write("\n");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

/*        SAVE_FILE.delete();
        TEMPORAL_SAVE_FILE.renameTo(SAVE_FILE);*/
    }
}
