

package trackingserver;

public class Client {
    protected int port;
    protected int IPaddress;

    public void Subscribe(Athlete a){
        a.addObserver(this);

    }

    public void Unsubscribe(Athlete a){
        a.deleteObserver(this);
    }
}

    public void Update(){
    }

