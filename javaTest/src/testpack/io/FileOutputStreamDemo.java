package testpack.io;

import java.io.FileOutputStream;
import java.io.IOException;

//字节流写数据与异常处理
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Z:\\Develop\\Java\\source");
            fos.write("hello".getBytes());
        } catch (IOException exp) {
            exp.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException exp) {
                    exp.printStackTrace();
                }
            }
        }
    }
}
