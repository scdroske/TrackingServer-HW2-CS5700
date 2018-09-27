
package trackingserver;

import java.net.InetAddress;
import java.util.List;

public class Athlete {
    protected String firstname;
    protected String lastname;
    protected String bibnum;
    protected String distancecovered;
    protected boolean started;
    protected boolean finished;
    protected InetAddress Observer;


    List<Client> Observers; //a list of clients observing athletes
    for(Client.address : Observers){
    if(Client.address != Observer){
        Observers += Observer;

    }


    public void addObserver(Client c);
    Observers.add(c);

    public void StateChange(){
        notify Observer():
        for(Client : Observers){
            c.Message();
        }
    }
}

//will notify observers > send string of data to client using communicator
