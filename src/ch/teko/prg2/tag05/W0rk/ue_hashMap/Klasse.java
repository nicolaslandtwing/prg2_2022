package ch.teko.prg2.tag05.W0rk.ue_hashMap;

import java.util.*;

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
            Integer ids = itrstud.next();
            if (ids == id){
                p = studenten.get(ids);
            }
        }
        while (itrlehr.hasNext()){
            Integer idl = itrlehr.next();
            if (idl == id){
                p = lehrpersonen.get(idl);
                }
        }

        return p;
    }

    @Override
    public Person get(String name, String vorname) {
        Person p = null;
        Set<Map.Entry<Integer, Student>> entrySetstud = studenten.entrySet();
        Set<Map.Entry<Integer,Lehrperson>> entrySetlehr = lehrpersonen.entrySet();
        Iterator<Map.Entry<Integer, Student>> itrstud = entrySetstud.iterator();
        Iterator<Map.Entry<Integer, Lehrperson>> itrlehr = entrySetlehr.iterator();


        while (itrstud.hasNext()){
            Map.Entry<Integer,Student> s = itrstud.next();
            if (s.getValue().getName().equals(name) && s.getValue().getVorname().equals(vorname))
                p = studenten.get(s.getKey());
        }
        while (itrlehr.hasNext()){
            Map.Entry<Integer,Lehrperson> l = itrlehr.next();
            if (l.getValue().getName().equals(name) && l.getValue().getVorname().equals(vorname))
                p = lehrpersonen.get(l.getKey());
        }

        return p;
    }

    @Override
    public void remove(int id) {
        studenten.remove(id);
        lehrpersonen.remove(id);
    }

    @Override
    /*public void print() {
        public String toString(){
            Collection<Lehrperson> collehr = lehrpersonen.values();
            Iterator<Lehrperson> itrlehr = collehr.iterator();
            while(itrlehr.hasNext()){
            return "Lehrperson{" +
                    "lehrpersonID=" + itrlehr.next().getLehrpersonID() +
                    ", Lehrperson Name=" + itrlehr.next().getName() + itrlehr.next().getVorname() +
                    '}';
        }
          */
            public void print() {
                System.out.printf("Die Klasse %s im Semester %s besteht aus folgenden Studenten und wird von nachfolgenden Lehrern unterrichtet: \n", this.getKlassenname(), this.getSemester());
                System.out.println("Lehrpersonen:");
                for (Map.Entry<Integer, Lehrperson> l: this.lehrpersonen.entrySet()) {
                    System.out.printf("%d, %s \n",l.getKey(), l.getValue().toString());
                }

                System.out.println("Studenten:");
                for (Map.Entry<Integer, Student> s: this.studenten.entrySet()) { //?? wo wird entrySet erstellt
                    System.out.printf("%d, %s \n",s.getKey(), s.getValue().toString());
                }
                System.out.println("");
            }

    }


