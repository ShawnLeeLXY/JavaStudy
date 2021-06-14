package testpack.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("idea_test\\src\\testpack\\io\\FileOutputStreamDemo.java");
        FileWriter fw = new FileWriter("idea_test\\Copy.java");
        //每次读写一个字符
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            osw.write(ch);
//        }
        //每次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }
        fw.close();
        fr.close();
    }
}
