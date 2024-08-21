package btHinhhoc;

public class square extends geometry {
    private float side;

    public square() {
    }

    public square(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "square{" +
                "side=" + side +
                ",perimeter="+ getPerimeter(side,side) +
                ",acreage="+ getAcreage(side,side)+
                '}';
    }
}
