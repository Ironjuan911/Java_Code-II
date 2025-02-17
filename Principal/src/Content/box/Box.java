package Content.box;

public class Box {
    private float width;
    private float height;
    private float length;

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getVolume() {
        return width * height * length;
    }
}