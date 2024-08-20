package Geometria_Computacional;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();
        while (input.hasNext()) {

            c1.setR(input.nextInt());
            c1.setX(input.nextInt());
            c1.setY(input.nextInt());

            c2.setR(input.nextInt());
            c2.setX(input.nextInt());
            c2.setY(input.nextInt());
            Verificador v1 = new Verificador();

            v1.resultado(c1, c2);

        }
    }

}

class Circulo {

    private int r;
    private int x;
    private int y;

    /**
     * @return int return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @return int return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return int return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setR(int r) {
        this.r = r;
    }

    double area() {

        return Math.PI * r * r;

    }

}

class Verificador {

    void resultado(Circulo c1, Circulo c2) {
        double d = Math.sqrt(Math.pow(c2.getX()- c1.getX(),2) + Math.pow(c2.getY()- c1.getY(),2));
        if (c1.getR() >= c2.getR()+d) {
            System.out.println("RICO");
        }
        else {
        System.out.println("MORTO");
        }
    }

}
