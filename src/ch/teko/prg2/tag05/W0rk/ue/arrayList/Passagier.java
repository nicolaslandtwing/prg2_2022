package ch.teko.prg2.tag05.W0rk.ue.arrayList;

public class Passagier {
    private String name;
    private String vorname;

    public Passagier(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    @Override
    public String toString() {
        return "Passagier{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }
}
