package filesutils;

import java.io.IOException;
import java.io.InputStream;

public class FileReader {

    public String loadFile() {
        byte[] allBytes = new byte[]{};

        InputStream is = getClass().getClassLoader().getResourceAsStream("textfile.txt");
        try {
            allBytes = is.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(allBytes);
    }

}
