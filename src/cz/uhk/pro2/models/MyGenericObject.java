package cz.uhk.pro2.models;

import java.time.LocalDateTime;

public class MyGenericObject<E> {
    private E myObject;
    private LocalDateTime lastUpdate;

    public MyGenericObject(E object){
        myObject = object;
        update();
    }
    public E getMyObject(){
        return myObject;
    }
    public void setMyObject(E object){
        myObject = object;
        update();
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    private void update(){
        lastUpdate = LocalDateTime.now();
    }
}
