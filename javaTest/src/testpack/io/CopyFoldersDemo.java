package testpack.io;

import java.io.*;

//复制多级文件夹
public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("D:\\Develop\\Java\\source");
        String srcName = srcFolder.getName();
        File destFolder = new File("D:\\Develop\\Java\\dest", srcName);
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        copyFolder(srcFolder, destFolder);
    }

    //复制文件夹
    private static void copyFolder(File srcFolder, File destFolder) throws IOException {
        File[] srcFiles = srcFolder.listFiles();
        if (srcFiles != null) {
            for (File f : srcFiles) {
                String srcFileName = f.getName();
                File destFile = new File(destFolder, srcFileName);
                if (f.isDirectory()) { //是文件夹则递归调用
                    if (!destFile.exists()) {
                        destFile.mkdir();
                    }
                    copyFolder(f, destFile);
                } else {
                    copyFile(f, destFile);
                }
            }
        }
    }

    //字节流缓冲复制文件
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
