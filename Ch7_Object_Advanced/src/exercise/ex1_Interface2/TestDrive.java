package exercise.ex1_Interface2;

/*
* 1. using anonymous class to create ClientListener instance
*
* */

public class TestDrive {

    public static void main(String[] args) {
        Client client1 = new Client("127.0.0.1", "Amy");
        Client client2 = new Client("192.168.0.2", "Candy");

        ClientQueue clientQueue = new ClientQueue();
        clientQueue.addClientListener(new ClientListener(){

            @Override
            public void clientAdded(ClientEvent clientEvent) {
                System.out.printf("%s connects from ip: %s%n", clientEvent.getName(), clientEvent.getIp());
            }

            @Override
            public void clientRemoved(ClientEvent clientEvent) {
                System.out.printf("%s disconnects from ip: %s%n", clientEvent.getName(), clientEvent.getIp());
            }
        });

        clientQueue.add(client1);
        clientQueue.add(client2);

        clientQueue.remove(client1);
        clientQueue.remove(client2);

    }

}
