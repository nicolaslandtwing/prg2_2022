package ch.teko.prg2.tag05.W0rk.ue_hashMap;

public class Lehrperson extends Person {
    private Integer lehrpersonID;

    public Lehrperson(String name, String vorname, Integer lehrpersonID) {
        super(name, vorname);
        this.lehrpersonID = lehrpersonID;
    }

    public int getLehrpersonID() {
        return lehrpersonID;
    }

    @Override
    public String toString() {
        return "Lehrperson{" +
                "lehrpersonID=" + lehrpersonID +
                '}' + super.toString();
    }
}
