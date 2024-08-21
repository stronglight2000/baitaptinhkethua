package btHinhhoc;

public class geometry {
    private float a;
    private float b;
    private float perimeter ;
    private float acreage ;

    public geometry() {
    }


    public geometry(float a, float b, float perimeter, float acreage) {
        this.a = a;
        this.b = b;
        this.perimeter = perimeter;

        this.acreage = acreage;

    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getPerimeter(float a, float b) {
        perimeter=(a+b)*2;
        return perimeter;
    }

    public void setPerimeter(float a, float b){

        this.perimeter = perimeter;
    }

    public float getAcreage(float a, float b) {
        acreage=a*b;
        return acreage;
    }

    public void setAcreage(float acreage) {

        this.acreage = acreage;
    }


}
