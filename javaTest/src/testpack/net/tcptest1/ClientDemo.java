package testpack.net.tcptest1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//客户端收发数据，先发再收
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.31.72", 12345);
        OutputStream os = socket.getOutputStream();
        os.write("Hello, TCP, 我来了".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客户端：" + data);
        socket.close();
    }
}
