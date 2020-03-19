package exercise.ex1_Interface2;

public interface ClientListener {
    void clientAdded(ClientEvent clientEvent);
    void clientRemoved(ClientEvent clientEvent);
}
