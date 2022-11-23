package org.example;
import java.util.ArrayList;
import java.util.List;

public class Visitor {
    private List<Grupa> grupe;
    private List<Semigrupa> semigrupe;
    private List<Student> studenti;

    public Visitor(){
        this.grupe = new ArrayList<Grupa>();
        this.semigrupe = new ArrayList<Semigrupa>();
        this.studenti = new ArrayList<Student>();
    }


    public void print(){
        for(Grupa grupa:this.grupe){
            System.out.print("      ");
            System.out.println(grupa.getNume());
            for(Semigrupa semigrupa:this.semigrupe){
                System.out.print("      ");
                System.out.println(semigrupa.getNume());
                for(Student student:this.studenti){
                    System.out.print("      ");
                    System.out.println(student.getNume());
                }
            }
        }
    }
}
