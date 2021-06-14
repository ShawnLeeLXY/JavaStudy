package testpack.io;

import java.io.File;

public class FileRecursionDemo {
    public static void main(String[] args) {
        File file = new File("D:\\Develop\\Java\\source");
        showFiles(file);
    }

    public static void showFiles(File file) {
        File[] fileArr = file.listFiles();
        if (fileArr != null) {
            for (File f : fileArr) {
                if (f.isDirectory()) {
                    showFiles(f);
                } else {
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
