package testpack.io;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Develop\\Java\\source\\test\\scenery.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("idea_test\\scenery.jpg"));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();
    }
}
