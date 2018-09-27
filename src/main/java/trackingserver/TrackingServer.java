package trackingserver;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;


public class TrackingServer{
        static final int Local_Port = 12000;


        public static void main(String[] args) throws SocketException {

            Communicator communicator = new Communicator(Local_Port);
            DummyMessageProcessor dummyProcessor = new DummyMessageProcessor("Tracker");
            communicator.setProcessor(dummyProcessor);
            communicator.start();

            //where the message will be the message type, the InetAddress will be the address of the client and port

            for (clients : observers):
            communicator.send("Hello", InetAddress.getLocalHost(), client.getLocalPort());



            DatagramPacket packet = comm2.getMessage();
        }
    }
