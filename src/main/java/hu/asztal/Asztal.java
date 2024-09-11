package hu.asztal;

import hu.jatekos.*;
import hu.nincsjatekos.*;
import java.util.ArrayList;
import java.util.List;

public class Asztal {
    private List<Jatekos> jatekosok;
    private double tet;
    private int kor;
    private double goal;
    private boolean vege;

    public final void UjJatek() {
        tet = 0;
        kor = 0;
        goal = 0 + (int)(Math.random() * ((100 - 0) + 1));
        vege = false;
    }

    public Asztal(){
        jatekosok = new ArrayList<>();
        UjJatek();
    }

    public void addJatekos(Jatekos jatekos) {
        if(jatekosok.size() == 10) {System.out.println("Nem fer tobb jatekos az asztalhoz"); return;}
        jatekosok.add(jatekos);
        jatekos.setAsztal(this);
    }

    public int getKor() {
        return kor;
    }

    public void emel(double d) {
        tet += d;
    }

    private void nyert(Jatekos jatekos) { System.out.println(jatekos.toString()+" nyerte a jatekot");}

    private void mindenkiVeszit() { System.out.println("Mindeki Veszitett");}

    public void kor() throws NincsJatekos {
        if(this.vege) { System.out.println("Vege a Jateknak"); return;}
        if(jatekosok.isEmpty()){ throw new NincsJatekos(); }
        kor++;
        for(Jatekos jatekos: jatekosok){
            jatekos.lep();
            if(tet > goal && tet - goal <= tet*0.1){
                nyert(jatekos);
                vege = true;
                return;
            } else if(tet > goal && tet - goal > tet*0.1) {
                mindenkiVeszit();
                vege = true;
                return;
            }
        }
        System.out.println("Aktualis tet: "+tet);
    }

    public double getTet() {
        return tet;
    }

    public double getGoal() {
        return goal;
    }

    public void pass(){}

}