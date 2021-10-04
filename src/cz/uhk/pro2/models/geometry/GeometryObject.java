package cz.uhk.pro2.models.geometry;

public abstract class GeometryObject {
    protected int a, b;

    protected GeometryObject(int a, int b){
        this.a = a;
        this.b = b;
    }

    public abstract void draw();
    public int calc() {
        return a * b;
    }
}
