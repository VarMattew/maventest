package hu.nyuszi;

import hu.jatekos.*;

public class Nyuszi extends Jatekos{
    private final String szin;

    public Nyuszi(String szin) {
        this.szin = szin;
    }

    @Override
    public String toString(){
        return szin+"Nyuszi";
    }

    @Override
    public void lep() {
        System.out.println(this.toString()+" kor: "+asztal.getKor());
        if(asztal.getTet() >= 50){
            System.out.println("Huha...");
        } else {
            asztal.emel(5);
        }
    }
}