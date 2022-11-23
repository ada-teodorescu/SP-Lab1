package org.example;

public abstract class An implements Element{
   private String nume;

    public An(String n) {
        this.nume = n;
    }

    public void print(){
       System.out.println(this.nume);
   }
}
