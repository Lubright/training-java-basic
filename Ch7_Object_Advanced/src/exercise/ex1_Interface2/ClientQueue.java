package exercise.ex1_Interface2;

import java.util.ArrayList;

public class ClientQueue {
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<ClientListener> listeners = new ArrayList<>();

    public void addClientListener(ClientListener listener){
        listeners.add(listener);
    }

    public void add(Client client){
        clients.add(client);
        ClientEvent event = new ClientEvent(client);
        for(int i=0; i<listeners.size(); i++){
            listeners.get(i).clientAdded(event);
        }
    }
    public void remove(Client client){
        clients.remove(client);
        ClientEvent event = new ClientEvent(client);
        for(ClientListener listener : listeners){
            listener.clientRemoved(event);
        }
    }
}
