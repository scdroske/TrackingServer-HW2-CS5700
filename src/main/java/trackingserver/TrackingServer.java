package trackingserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class TrackingServer{
        static final int Local_Port = 12000;


        public static void main(String[] args) throws SocketException {

            Communicator communicator = new Communicator(Local_Port);
            DummyMessageProcessor dummyProcessor = new DummyMessageProcessor("Tracker");
            communicator.setProcessor(dummyProcessor);
            communicator.start();
            InetAddress targetAddress;
            //DatagramPacket datagramPacket = new DatagramSocket(localPort);
            //targetAddress = communicator.getLocalPort(targetAddress)
            //where the message will be the message type, the InetAddress will be the address of the client and port

            Message update = new Message(new RaceStarted());
            //this is where you would send the required data to the clients

            //communicator.send("Race", targetAddress, targetPort);
            //this might have to be seperate because its coming from client?
            //System.out.println("Message to print: " +  update.execute("Race", 127.0.0.1 , Local_Port));
            update = new Message(new Hello());
            update = new Message(new Subscribe());
            update = new Message(new Unsubscribe());

            update = new Message(new RegisteredUpdate());

            update = new Message(new DidNotStart());

            update = new Message(new Started());


            update = new Message(new OnCourse());


            update = new Message(new DidNotFinish());

            update = new Message(new Finished());


        }
    }
