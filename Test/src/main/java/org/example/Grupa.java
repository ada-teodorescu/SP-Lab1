package org.example;

import java.util.ArrayList;
import java.util.List;

public class Grupa{
    private List<Semigrupa> semigrupe;
    protected final List<Element> children;
    private String nume;

    public Grupa(String n){
        this.nume = n;
        this.semigrupe = new ArrayList<Semigrupa>();
        children = new ArrayList<Element>();
    }

    public void adaugareSemigrupa(Semigrupa semigrupa){
        this.semigrupe.add(semigrupa);
    }

    public String getNume() {
        return nume;
    }

    public void print() {
        for (Semigrupa semigrupa : this.semigrupe) {
            semigrupa.print();
        }
    }



}
