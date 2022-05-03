package ch.teko.prg2.tag01.work.aufgabe3;

public class Manager extends Person{

    private int managerID;

    public Manager(String name, String vorname, int alter, int gehalt, int ferien, int managerID){
        super (name,vorname,alter,gehalt,ferien);
        this.managerID = managerID;
    }

    public int getManagerID() {
        return managerID;
    }
}
