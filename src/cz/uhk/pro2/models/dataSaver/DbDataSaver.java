package cz.uhk.pro2.models.dataSaver;

import cz.uhk.pro2.models.MyDbConnector;

public class DbDataSaver implements DataSaver {
    @Override
    public void save(int a) {
        MyDbConnector dbConnector = new MyDbConnector();
        String conn = dbConnector.getConnection();

    }

    @Override
    public int load() {
        return 0;
    }
}
