package ch.teko.prg2.tag05.W0rk.ue_hashMap;

public interface IKlasse {
    void add(Student s);
    void add(Lehrperson l);
    Person get(int id);
    Person get(String name, String vorname);
    void remove(int id);
    void print();
}
