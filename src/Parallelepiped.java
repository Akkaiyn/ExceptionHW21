public class Parallelepiped {
    private int h;
    private int w;
    private int l;

    public Parallelepiped(){}

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
    public void parallelepipedSC(){
        System.out.println("Parallelepiped's square is: " + 2 * ((w * h ) + (l * w) + (h * l)));
        System.out.println("Parallelepiped's capacity is: " + getW() * getH() * getL());
    }
}
