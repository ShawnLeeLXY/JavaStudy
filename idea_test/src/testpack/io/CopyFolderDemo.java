package testpack.io;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("D:\\Develop\\Java\\source\\foldertest");
        String srcName = srcFolder.getName();
        File destFolder = new File("idea_test", srcName);
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        File[] srcFiles = srcFolder.listFiles();
        if (srcFiles != null) {
            for (File f : srcFiles) {
                String srcFileName = f.getName();
                File destFile = new File(destFolder, srcFileName);
                copyFile(f, destFile);
            }
        }
    }

    public static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();
    }
}
