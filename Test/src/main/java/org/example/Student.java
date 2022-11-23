package org.example;

public class Student {
    private String name;
    private String adresa;

    public Student(String n, String a) {
        this.name = n;
        this.adresa = a;
    }
    public String getNume() {
        return name;
    }
    public void print(){
        System.out.print(this.name);
        System.out.print(",");
        System.out.print(this.adresa);
    }
}
