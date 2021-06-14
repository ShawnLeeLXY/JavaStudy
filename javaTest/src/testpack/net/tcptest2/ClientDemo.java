package testpack.net.tcptest2;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.31.72", 12345);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals("886")) break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        socket.close();
    }
}
