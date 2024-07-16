package iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamReadExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
