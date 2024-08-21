package btHinhhoc;

public class rectangle extends geometry {
    private float length;
    private float width;

    public rectangle() {
    }

    public rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public rectangle(float a, float b, float perimeter, float acreage, float length, float width) {
        super(a, b, perimeter, acreage);
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "length=" + length +
                ", width=" + width +
                ",perimeter="+ getPerimeter(length, width)+
                ",acreage="+ getAcreage(length, width)+
                '}';
    }
}
