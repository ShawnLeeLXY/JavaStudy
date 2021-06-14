package testpack.io;

import java.io.*;

public class CopyBuffDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("idea_test\\src\\testpack\\io\\CopyCharDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("idea_test\\Copy.java"));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
