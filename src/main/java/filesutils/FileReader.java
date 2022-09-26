package filesutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public static String loadFile(String filePath) {
        byte[] allBytes = new byte[]{};

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            allBytes = fileInputStream.readAllBytes();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(allBytes);
    }
}
