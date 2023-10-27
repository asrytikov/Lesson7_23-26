package p4;

public abstract class Figure {

    float x;
    float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract float getArea();
    public abstract float getPerimetr();
}
