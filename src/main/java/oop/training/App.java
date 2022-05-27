package oop.training;

import oop.training.interfaces.ApiConnector;
import oop.training.interfaces.Connectable;
import oop.training.interfaces.DbConnector;

public class App
{
    public static void main( String[] args )
    {
        Connectable dbConnector = new DbConnector();
        Connectable apiConnector = new ApiConnector();

        connect(dbConnector);
        connect(apiConnector);

    }

    public static void connect(Connectable connectable) {
        if(connectable instanceof DbConnector) {
            System.out.println("Trying to connect to DataBase");
            try {
                Thread.sleep(2000);
                connectable.connect();
                Thread.sleep(2000);
                connectable.disconnect();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        } else {
            System.out.println(connectable.getClass().getSimpleName() + " is not a DataBase.");
        }
    }

}
