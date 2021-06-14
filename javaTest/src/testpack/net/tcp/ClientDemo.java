package testpack.net.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.31.72", 11111);
        OutputStream os = socket.getOutputStream();
        os.write("Hello, TCP, 我来了".getBytes());
        socket.close();
    }
}
