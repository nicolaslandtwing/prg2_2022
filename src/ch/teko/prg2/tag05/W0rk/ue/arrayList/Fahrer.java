package ch.teko.prg2.tag05.W0rk.ue.arrayList;

public class Fahrer {
    private String name;
    private String vorname;

    public Fahrer(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return "Fahrer{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }
}
