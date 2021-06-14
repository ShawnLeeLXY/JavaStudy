package testpack.net.tcptest6;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.31.72", 12345);
        BufferedReader br = new BufferedReader(new FileReader("idea_test\\src\\testpack\\str\\TestString.java"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        socket.shutdownOutput();
        BufferedReader brClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器的反馈：" + data);
        br.close();
        socket.close();
    }
}
