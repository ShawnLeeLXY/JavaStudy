package testpack.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("idea_test");
        FileOutputStream fos = new FileOutputStream("idea_test\\scenery.jpg");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }
}
