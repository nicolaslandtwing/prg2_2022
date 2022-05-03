package ch.teko.prg2.tag01.work.aufgabe3;

public class Person {
    private String name;
    private String vorname;
    private int alter;
    private int gehalt;
    private int ferien;

    public Person(String name, String vorname, int alter, int gehalt, int ferien){
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.gehalt = gehalt;
        this. ferien = ferien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getGehalt() {
        return gehalt;
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }

    public int getFerien() {
        return ferien;
    }

    public void setFerien(int ferien) {
        this.ferien = ferien;
    }
}
