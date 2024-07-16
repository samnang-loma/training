package iostream;

import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamWriteExample {
    public static void main(String[] args) {
        String data = "Hello, world!";
        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
