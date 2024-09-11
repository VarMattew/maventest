package hu.robot;

import hu.jatekos.*;

public class Robot extends Jatekos{
    private static int nextId = 1;
    private final int id;

    public Robot(){
        this.id = nextId++;
    }

    @Override
    public String toString(){
        return "Robot"+this.id;
    }

    @Override
    public void lep() {
        System.out.println(this.toString()+" kor: "+asztal.getKor());
        asztal.pass();
    }
}