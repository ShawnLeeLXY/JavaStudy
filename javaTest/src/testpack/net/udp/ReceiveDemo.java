package testpack.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] bys = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bys, bys.length);
        socket.receive(packet);
        System.out.println("接收到的数据是：" + new String(packet.getData(), 0, packet.getLength()));
        socket.close();
    }
}
