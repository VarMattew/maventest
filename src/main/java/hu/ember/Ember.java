package hu.ember;

import hu.jatekos.*;
import java.util.Scanner;

public class Ember extends Jatekos{
    private final String nev;

    public Ember() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a neved: ");
        this.nev = scanner.nextLine(); 
    }

    @Override
    public String toString(){
        return nev;
    }

    private void szamBekeres(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg egy szammal hogy mennyit szeretnel emelni (ha nem szeretnel akkor nyilvan 0): ");
        while (true) { 
            try {
                asztal.emel(scanner.nextDouble());
                return;
            } catch (Exception e) {
                System.out.println("Gondoltam egyertelmu hogy szamot kell megadni... Probald ujra: ");
                scanner.nextLine();
            }    
        }
    }

    @Override
    public void lep() {
        System.out.println(this.toString()+" kor: "+asztal.getKor());
        szamBekeres();
    }
}