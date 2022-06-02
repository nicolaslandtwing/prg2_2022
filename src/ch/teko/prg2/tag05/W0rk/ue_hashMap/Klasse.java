package ch.teko.prg2.tag05.W0rk.ue_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Klasse implements IKlasse {
    private String klassenname;
    private String semester;

    // Lehrpersonen Map
    private HashMap<Integer, Lehrperson> lehrpersonen = new HashMap<>();

    // Studenten Map
    private HashMap<Integer, Student> studenten = new HashMap<>();

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
        studenten.put(s.getStudentID(),s);
    }

    @Override
    public void add(Lehrperson l) {
        lehrpersonen.put(l.getLehrpersonID(),l);

    }

    @Override
    public Person get(int id) {
        Person p = null;
        Set<Integer> studentkeyset = studenten.keySet();
        Iterator<Integer> itrstud = studentkeyset.iterator();
        Set<Integer> lehrerkeyset = lehrpersonen.keySet();
        Iterator<Integer> itrlehr = lehrerkeyset.iterator();

        while (itrstud.hasNext()){
            if (itrstud.next() == id){
                p = studenten.get(itrstud.next());
            }
        }
        while (itrlehr.hasNext()){
            if (itrlehr.next() == id){
                p = lehrpersonen.get(itrstud.next());
                }
        }

        return p;
    }

    @Override
    public Person get(String name, String vorname) {
        // Implementieren Sie!

        return null;
    }

    @Override
    public void remove(int id) {
        // Implementieren Sie!

    }

    @Override
    public void print() {
        // Implementieren Sie!

    }
}
