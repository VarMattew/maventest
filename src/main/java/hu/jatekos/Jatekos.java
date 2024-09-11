package hu.jatekos;

import hu.asztal.*;

public abstract class Jatekos {
    protected Asztal asztal;

    public Jatekos() {}

    public abstract void lep();

    public void setAsztal(Asztal a) {
        asztal = a;
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     System.out.println("Objektum azonosítója: " + System.identityHashCode(this));
    //     System.out.println("toString(): " + this.toString());
    //     super.finalize();
    // }
}