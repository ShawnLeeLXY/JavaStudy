package testpack.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Develop\\Java\\source\\test\\HelloWorld.txt");
        int by;
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }
        fis.close();
    }
}
