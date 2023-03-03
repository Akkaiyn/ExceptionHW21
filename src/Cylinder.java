import static java.lang.Math.PI;

public class Cylinder{
    private int r;
    private int h;

    public Cylinder(){}

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public void cylindersSC(){
        System.out.println("Square of cylinder is: " + 2* PI * r * ( h + r));
        System.out.println("Capacity of cylinder is: " + PI * r * r * h);

    }
}
