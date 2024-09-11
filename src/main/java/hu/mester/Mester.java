package hu.mester;

import hu.jatekos.*;

public class Mester extends Jatekos{
    private final int fokozat;

    public Mester(int fok) {
        fokozat = fok;
    }

    @Override
    public String toString(){
        return "Mester"+fokozat;
    }

    @Override
    public void lep() {
        System.out.println(this.toString()+" kor: "+asztal.getKor());
        asztal.emel(asztal.getTet()*(fokozat/100));
    }
}