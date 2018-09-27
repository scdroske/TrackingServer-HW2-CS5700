package trackingserver;

import java.net.InetAddress;


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

public interface IMessageStrategy{

    public void process(String message);
}

class Hello implements IMessageProcessor {
    @Override
    public void process(String message, InetAddress address, int port) {
        String parts[] = message.split(",");
        if (parts[1] == "Hello") {
            //send client Race, <race name>, <course length in meters>
            //add client to list of observers
            RaceStarted race = new RaceStarted();
            //if(started ==true; )
            message = "Race, <race name>, <course length in meters>";
            //InetAddress where = address;
            //int portLocation = port;
            //if simulation is running, then send started, otherwise send, basic message.. simulation not running yet.
        }
    }
}


class Subscribe implements IMessageProcessor{
    @Override
    public void process(String message, InetAddress address, int port) {

    }
}

class Unsubscribe implements IMessageProcessor{
    @Override
    public void process(String message, InetAddress address, int port) {

    }
}




class RaceStarted implements IMessageProcessor {
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "Race") {
            String type = parts[1];
            String raceName = parts[2];
            String raceLength = parts[3];
            System.out.println(parts[1].trim() + "," + parts[2].trim() + "," +  parts[3]);
        }
    }
}


class RegisteredUpdate implements IMessageProcessor{
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

class DidNotStart implements IMessageProcessor {
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "DidNotStart") {
            System.out.println(parts[1].trim() + "," + parts[2].trim() + "," + parts[3].trim());
        }
    }
}

class Started implements  IMessageProcessor{
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "Started") {
            System.out.println(parts[1].trim() + "," + parts[2].trim());
        }
    }
}

class OnCourse implements IMessageProcessor{
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "OnCourse") {
            System.out.println(parts[1].trim() + "," + parts[2].trim() + "," + parts[3].trim() + "," + parts[4].trim());
        }
    }
}

class DidNotFinish implements IMessageProcessor {
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "DidNotFinish") {
            System.out.println(parts[1].trim() + "," + parts[2].trim() + "," + parts[3].trim());
        }
    }
}

class Finished implements IMessageProcessor {
    @Override
    public void process(String message, InetAddress address, int port) {
        //when the race starts build info to send to all clients telling them race started
        String parts[] = message.split(",");
        if (parts[1].trim() == "Finished") {
            System.out.println(parts[1].trim() + "," + parts[2].trim() + "," + parts[3].trim());
        }
    }
}


