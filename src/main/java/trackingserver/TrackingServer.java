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

            Message update = new Message(new RaceStarted()); //this might have to be seperate because its coming from client?
           // communicator.send(message, InetAddress targetAddress, int targetPort );
            //now have to build classes that return this info

            update = new Message(new RegisteredUpdate());
            update = new Message(new DidNotStart());

            update = new Message(new Started());


            update = new Message(new OnCourse());


            update = new Message(new DidNotFinish());

            update = new Message(new Finished());


            //communicator.send("Hello", InetAddress.getLocalHost(), client.getLocalPort());



            //DatagramPacket packet = comm2.getMessage();
        }
    }
