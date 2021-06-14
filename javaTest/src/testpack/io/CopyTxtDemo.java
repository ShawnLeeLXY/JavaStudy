package testpack.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Develop\\Java\\source\\test\\HelloWorld.txt");
        FileOutputStream fos = new FileOutputStream("idea_test\\HelloWorld.txt");
        int br;
        while ((br = fis.read()) != -1) {
            fos.write(br);
        }
        fos.close();
        fis.close();
    }
}
