package Iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for (int i = 0; i < q; i++) {

            Pokemon p1 = new Pokemon();
            int bonus = input.nextInt();
            p1.setBonus(bonus);
            p1.setAtk(input.nextInt());
            p1.setDef(input.nextInt());
            p1.setLi(input.nextInt());
            Pokemon p2 = new Pokemon();
            p2.setBonus(bonus);
            p2.setAtk(input.nextInt());
            p2.setDef(input.nextInt());
            p2.setLi(input.nextInt());

            double poder1 = p1.calculaVG(p1.getAtk(), p1.getDef(), p1.getLi(), bonus);
            p1.setPoder(poder1);

            double poder2 = p2.calculaVG(p2.getAtk(), p2.getDef(), p2.getLi(), bonus);
            p2.setPoder(poder2);
            Batalha batalha1 = new Batalha();
            batalha1.Vitoria(p1, p2);
        }
    }
}

class Pokemon {

    private int atk;
    private int def;
    private int li;
    private int bonus;
    private int vg;
    private double poder;

    public static double calculaVG(int a, int d, int l, int b) {
        if (l % 2 == 0) {

            double vg = (a + d) / 2 + b;
            return vg;

        }
        if (l % 2 == 1) {

            double vg = (a + d) / 2;
            return vg;

        }
        return 0;
    }

    /**
     * @return int return the atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * @param atk the atk to set
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * @return int return the def
     */
    public int getDef() {
        return def;
    }

    /**
     * @param def the def to set
     */
    public void setDef(int def) {
        this.def = def;
    }

    /**
     * @return int return the li
     */
    public int getLi() {
        return li;
    }

    /**
     * @param li the li to set
     */
    public void setLi(int li) {
        this.li = li;
    }

    /**
     * @return int return the bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    /**
     * @return int return the vg
     */
    public int getVg() {
        return vg;
    }

    /**
     * @param vg the vg to set
     */
    public void setVg(int vg) {
        this.vg = vg;
    }

    /**
     * @return int return the poder
     */
    public double getPoder() {
        return poder;
    }

    /**
     * @param poder the poder to set
     */
    public void setPoder(double poder) {
        this.poder = poder;
    }

}

class Batalha {

    public void Vitoria(Pokemon p1, Pokemon p2) {

        if (p1.getPoder() > p2.getPoder()) {
            System.out.println("Dabriel");
        }
        if (p1.getPoder() < p2.getPoder()) {
            System.out.println("Guarte");
        }
        if (p1.getPoder() == p2.getPoder()) {
            System.out.println("Empate");
        }

    }

}
