package hu.main;

import hu.asztal.*;
import hu.ember.*;
import hu.jatekos.*;
import hu.kezdo.*;
import hu.mester.*;
import hu.nincsjatekos.*;
import hu.nyuszi.*;
import hu.robot.*;

public class Main{
    public static void main(String[] args) {

        Asztal asztal = new Asztal();
        Jatekos jatekos1 = new Kezdo("Mark");
        Jatekos jatekos2 = new Kezdo("Albert");
        Jatekos jatekos3 = new Robot();

        asztal.addJatekos(jatekos1);
        asztal.addJatekos(jatekos2);
        asztal.addJatekos(jatekos3);

        asztal.UjJatek();

        for (int i = 0; i < 3; i++) {
            try{
                asztal.kor();
            } catch(NincsJatekos error) {
                System.out.println(error);
            }
        }

        Asztal uresasztal = new Asztal();

        try{
            uresasztal.kor();
        } catch(NincsJatekos error) {
            System.out.println(error);
        }

        Asztal nyusziAsztal = new Asztal();
        Jatekos nyuszi = new Nyuszi("kek");
        Jatekos mester = new Mester(3);

        nyusziAsztal.addJatekos(nyuszi);
        nyusziAsztal.addJatekos(mester);

        for (int i = 0; i < 15; i++) {
            try{
                nyusziAsztal.kor();
            } catch(NincsJatekos error) {
                System.out.println(error);
            }
        }

        Asztal emberiasztal = new Asztal();
        Jatekos jatekosRandom1 = new Kezdo("Mark");
        Jatekos jatekosRandom2 = new Kezdo("Albert");
        Jatekos jatekosEmber = new Ember();

        emberiasztal.addJatekos(jatekosRandom1);
        emberiasztal.addJatekos(jatekosRandom2);
        emberiasztal.addJatekos(jatekosEmber);

        emberiasztal.UjJatek();

        for (int i = 0; i < 3; i++) {
            try{
                emberiasztal.kor();
            } catch(NincsJatekos error) {
                System.out.println(error);
            }
        }

    }
}