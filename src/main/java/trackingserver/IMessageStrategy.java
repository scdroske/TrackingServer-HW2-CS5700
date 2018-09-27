package trackingserver;

import java.net.DatagramPacket;
import java.net.InetAddress;

public interface IMessageStrategy {
    //first need to evaluate what kind of message
    //String Execute(String messageType, double bib, String messageReceived);
    //then message will need to be sent to the correct place
    void process(String message, InetAddress address, int port);
    //String sendRaceStart(String toWhere, String message);
    //String sendUpdate(String toWhere, String bibNumber, String Message);
}


//if Port = 12000 -> message from simulator;
//else if Port != null -> message from client;
//if message from simulator : format and send to all clients via update;
//


/**
 * two types of messages recieved:
 * Messages from Client to Server
 * Messages from Simulator to Server
 */


/**
 * Messages from the Simulator to the Server
 */

class Hello implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {
        if (message == "Hello") {
            //send client Race, <race name>, <course length in meters>
            //add client to list of observers
            RaceStarted race = new RaceStarted();
            //if(started ==true; )

            message = "Race, <race name>, <course length in meters>";
            InetAddress where = address;
            int portLocation = port;

            //if simulation is running, then send started, otherwise send, basic message.. simulation not running yet.

        }

    }
}


class RaceStarted implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "Race") {
            System.out.println(parts[1].trim() + "," + parts[2].trim() + "," + parts[3]);
        }
        return;
    }
}


class RegisteredUpdate implements IMessageStrategy{
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "Registered"){
            System.out.println(parts[1].trim() + "," + parts[2].trim() + "," + parts[3].trim() + "," + parts[4].trim()
                    + "," + parts[5].trim() + "," + parts[6].trim() + "," + parts[7].trim() + "," + parts[8].trim());
        }
    }
}

class DidNotStart implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "DidNotStart") {
            System.out.println(parts[1].trim() + "," + parts[2].trim() + "," + parts[3].trim());
        }
    }
}

class Started implements  IMessageStrategy{
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "Started") {
            System.out.println(parts[1].trim() + "," + parts[2].trim());
        }
        return;
    }
}

class OnCourse implements IMessageStrategy {
        @Override
        public void process(String message, InetAddress address, int port) {
            //when the race starts build info to send to all clients telling them race started
            String parts[] = message.split(",");
            if (parts[1].trim() == "OnCourse") {
                System.out.println(parts[1].trim() + "," + parts[2].trim() + "," + parts[3].trim() + "," + parts[4].trim());
            }
        }
    }

class DidNotFinish implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "DidNotFinish") {
            System.out.println(parts[1].trim() + "," + parts[2].trim() + "," + parts[3].trim());
        }
    }
}

class Finished implements IMessageStrategy {
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "Finished") {
            System.out.println(parts[1].trim() + "," + parts[2].trim() + "," + parts[3].trim());
        }
    }
}


