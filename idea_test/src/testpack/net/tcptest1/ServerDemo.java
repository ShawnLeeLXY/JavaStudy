package testpack.net.tcptest1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务器端收发数据，先收再发
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12345);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("服务器端：" + data);
        OutputStream os = socket.getOutputStream();
        os.write("服务器已接收到数据！".getBytes());
        ss.close();
    }
}
