package udpcharroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket socket = new DatagramSocket();
        String line;
        while ((line = bf.readLine()) != null) {
            if (line.equals("886")) break;
            byte[] bys = line.getBytes();
            DatagramPacket packet = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.31.72"), 6666);
            socket.send(packet);
        }
        socket.close();
    }
}
