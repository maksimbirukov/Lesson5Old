package ua.levelup;

import java.io.FileInputStream;
import java.io.IOException;

public class Reader {

    public byte[] readFromFile(String fileName) {

        try(FileInputStream fos = new FileInputStream(fileName)) {
            int available = fos.available();
            byte[] bytes = new byte[available];
            System.out.println("From file " + fileName +" was read " + fos.read(bytes) + " bytes");
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        }

        throw new IllegalArgumentException("It is not possible to read from file " + fileName);
    }
}
