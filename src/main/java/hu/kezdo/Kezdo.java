package hu.kezdo;

import hu.jatekos.*;

public class Kezdo extends Jatekos{
    private final String nev;

    public Kezdo(String n){
        nev = n;
    }

    @Override 
    public String toString(){
        return nev;
    }

    @Override 
    public void lep() {
        System.out.println(this.toString()+" kor: "+asztal.getKor());
        if(asztal.getKor() % 2 == 1){
            asztal.pass();
        } else {
            asztal.emel(1);
        }
    }
}