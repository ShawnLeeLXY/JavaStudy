package testpack.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] bys = "Hello, UDP, 我来了".getBytes();
        DatagramPacket packet = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.31.72"), 12345);
        socket.send(packet);
        socket.close();
    }
}
