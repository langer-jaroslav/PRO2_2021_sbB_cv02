package cz.uhk.pro2.models.dataSaver;

public class MemoryDataSaver implements DataSaver {
    private int number;

    @Override
    public void save(int a) {
        number = a;
        System.out.println("saved to memory");
    }

    @Override
    public int load() {
        return number;
    }


    public void foo(){

    }
}
