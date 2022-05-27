package oop.training.interfaces;

public class DbConnector implements Connectable {
    @Override
    public void connect() {
        System.out.println("Connected do DataBase");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from DataBase");
    }
}
