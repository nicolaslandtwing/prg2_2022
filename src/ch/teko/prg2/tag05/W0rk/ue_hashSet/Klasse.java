package ch.teko.prg2.tag05.W0rk.ue_hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Klasse implements IKlasse {
    private String klassenname;
    private String semester;
    // Lehrpersonenliste
    private HashSet<Lehrperson> lehrpersonen = new HashSet<>();

    // Studentenliste
    private HashSet<Student> studenten = new HashSet<>();

    public Klasse(String klassenname, String semester) {
        this.klassenname = klassenname;
        this.semester = semester;
    }

    public String getKlassenname() {
        return klassenname;
    }

    public String getSemester() {
        return semester;
    }

    @Override
    public void add(Student s) {
        studenten.add(s);
    }

    @Override
    public void add(Lehrperson l) {
        lehrpersonen.add(l);

    }

    @Override
    public Person get(int id) {
        Iterator<Student> itrstud = studenten.iterator();
        Iterator<Lehrperson> itrlehr = lehrpersonen.iterator();

        Person p = null;
        while (itrstud.hasNext()) {
            if (itrstud.next().getStudentID() == id) {
                p = itrstud.next();
            }
        }
        while (itrlehr.hasNext()) {
            if (itrlehr.next().getLehrpersonID() == id) {
                p = itrlehr.next();
            }
        }
        return p;
    }

    @Override
    public Person get(String name, String vorname) {
        Iterator<Student> itrstud = studenten.iterator();
        Iterator<Lehrperson> itrlehr = lehrpersonen.iterator();

        Person p = null;
        while (itrstud.hasNext()) {
            if (itrstud.next().getName().equals(name) && itrstud.next().getVorname().equals(vorname)) {
                p = itrstud.next();
            }
        }
        while (itrlehr.hasNext()) {
            if (itrlehr.next().getName().equals(name) && itrlehr.next().getVorname().equals(vorname)) {
                p = itrlehr.next();
            }
        }

        return null;
    }

    @Override
    public void remove(int id) {


    }

    @Override
    public void print() {
        // Implementieren Sie!

    }
}
