
package trackingserver;

import java.net.InetAddress;

public class Message {

    private IMessageStrategy messageStrategy;

    public Message(IMessageStrategy messageStrategy){
        this.messageStrategy = messageStrategy;
    }

    public void execute(String message, InetAddress address, int port){
         messageStrategy.process(message, address, port);
    }
}


