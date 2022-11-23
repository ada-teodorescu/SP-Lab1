package org.example;

import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements An {

    private List<Student> studenti;
    private String nume;

    public Semigrupa(String n) {
        this.nume = n;
        this.studenti = new ArrayList<Student>();
    }

    public String getNume() {
        return nume;
    }

    public void adaugareStudenti(Student s) {
        this.studenti.add(s);
    }

    public void print() {
        System.out.println(this.nume + "\n");
        for (Student student : this.studenti) {
            student.print();
        }

    }
}


