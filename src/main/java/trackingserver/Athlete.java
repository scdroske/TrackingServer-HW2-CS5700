/**

package trackingserver;

import java.util.List;



public class Athlete {
    protected String firstname;
    protected String lastname;
    protected String bibnum;
    protected String distancecovered;
    protected boolean started;
    protected boolean finished;



    List<Client> Observers;



    add.Observer(Client c);
    Observers.add(c);

    public void StateChange(){
        notify Observer():
        for(Client : Observers){
            c.update();
        }
    }
}

//will notify observers > send string of data to client using communicator


*/