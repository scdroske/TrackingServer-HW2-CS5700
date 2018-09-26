package trackingserver;

import java.net.SocketException;

public class TrackingServer{
        static final int Local_Port = 12000;


        public static void main(String[] args) throws SocketException {

            Communicator communicator = new Communicator(Local_Port);
            DummyMessageProcessor dummyProcessor = new DummyMessageProcessor("Scout");
            communicator.setProcessor(dummyProcessor);
            communicator.start();

        }
    }
