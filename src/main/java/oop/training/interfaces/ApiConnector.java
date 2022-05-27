package oop.training.interfaces;

public class ApiConnector implements Connectable {
    @Override
    public void connect() {
        System.out.println("Connected to API");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from API");
    }
}
