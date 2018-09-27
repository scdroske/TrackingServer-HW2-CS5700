package trackingserver;

import java.net.DatagramPacket;
import java.net.InetAddress;

public interface IMessageStrategy {
    //first need to evaluate what kind of message
    //String Execute(String messageType, double bib, String messageReceived);
    //then message will need to be sent to the correct place
    void process(String message, InetAddress address, int port);

}




class addClient implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {
        if (message == "Hello") {
            String ipAddress = address.toString();

            //if simulation is running, then send started, otherwise send, basic message.. simulation not running yet.
            return;
        }
    }
}

class RaceStarted implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {
        if (message == "Race") {
            return;
        }
    }
}

class RegisteredUpdate implements IMessageStrategy{
    @Override
    public void process(String message, InetAddress address, int port) {
        if (message == "Registered") {
            return;
        }
    }
}

class DidNotStart implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {

        if (message == "DidNotStart") {
            DidNotStart();
            return;
        }
    }
}

class Started implements IMessageStrategy{
    @Override
    public void process(String message, InetAddress address, int port) {

        if (message == "Started") {
            Started();
            return;
        }
    }
}

class OnCourse implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {

        if (message == "OnCourse") {
            OnCourse();
            return;
        }
    }
}

class DidNotFinish implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {

        if (message == "DidNotFinish") {
            DidNotFinish();
            return;
        }
    }
}

class Finished implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {

        if (message == "Finished") {
            Finished();
            return;
        }
    }
}


        if (address==null) {
            System.out.println("Null address");
            return;
        }

        System.out.println(String.format("%s received: %s from %s:%d", name, message, address.toString(), port));
        receiveCount++;
    }


    Communicator comm1 = new Communicator(12001);
    Communicator comm2 = new Communicator(12002);


        comm1.send("Hello", InetAddress.getLocalHost(), comm2.getLocalPort());
    DatagramPacket packet = comm2.getMessage();


}
