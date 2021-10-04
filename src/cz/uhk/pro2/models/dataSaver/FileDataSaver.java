package cz.uhk.pro2.models.dataSaver;

public class FileDataSaver implements DataSaver {
    private int numberInFile;

    @Override
    public void save(int a) {
        numberInFile = a;
        System.out.println("saved to file");
    }

    @Override
    public int load() {
        return numberInFile;
    }
}
