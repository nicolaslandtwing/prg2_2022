package ch.teko.prg2.tag05.W0rk.ue_hashMap;

public class Student extends Person {
    private Integer studentID;

    public Student(String name, String vorname, Integer studentID) {
        super(name, vorname);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                '}' + super.toString();
    }
}
