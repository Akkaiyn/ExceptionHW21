import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Parallelepiped parallelepiped = new Parallelepiped();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Square and capacity of parallelepiped");
        // 1.1
        System.out.println("Please write width of parallelepiped: ");
        try {
            parallelepiped.setW(scanner.nextInt());
            if (parallelepiped.getW() <= 0){
                throw new OurException("Width of parallelepiped can't be negative");
            }
        } catch (OurException o){
            System.out.println(o.getMessage());
        } catch (InputMismatchException i){
            System.out.println(" Parameter must be integer, please write integer");
        }
        // 1.2
        System.out.println("Please write height of parallelepiped: ");
        try {
            parallelepiped.setH(scanner.nextInt());
            if(parallelepiped.getH() <= 0){
                throw new OurException("Height of parallelepiped can't be negative");
            }
        } catch (OurException h){
            System.out.println(h.getMessage());
        } catch (InputMismatchException h){
            System.out.println("Parameter must be integer, please write integer");
        }
        // 1.3
        System.out.println("Please write length of parallelepiped: ");
        try {
            parallelepiped.setL(scanner.nextInt());
            if (parallelepiped.getL() <= 0){
                throw new OurException("Height of parallelepiped can't be negative");
            }
        }catch (OurException l){
            System.out.println(l.getMessage());
        } catch (InputMismatchException l){
            System.out.println("Parameter must be integer, please write integer");
        }

        parallelepiped.parallelepipedSC();

        Cylinder cylinder = new Cylinder();
        System.out.println("Square and capacity of cylinder");

        // cylinder 2.1 common
        System.out.println("Please write height of cylinder: ");
        try{
        cylinder.setH(scanner.nextInt());
        System.out.println("Please write radius of cylinder: ");
        cylinder.setR(scanner.nextInt());
        if (cylinder.getH() <= 0 && cylinder.getR() <= 0) {
            throw new OurException("Parameters can't be negative");
        } } catch (OurException c){
            System.out.println(c.getMessage());
        } catch (InputMismatchException cil){
            System.out.println("Parameter must be integer, please write integer");
        }

        cylinder.cylindersSC();


    }
}