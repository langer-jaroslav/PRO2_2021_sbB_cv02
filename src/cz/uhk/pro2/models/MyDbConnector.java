package cz.uhk.pro2.models;

public class MyDbConnector {
    private static String connection;

    public String getConnection(){
        if(connection == null)
            connection = "opened connection";

        return connection;
    }
}
