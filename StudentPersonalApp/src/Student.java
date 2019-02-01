public class Student extends Personal {
    private long studentNumber;


    public long getStudentNumber() {
        return studentNumber;
    }

    public Student() {
        setName("Henüz Girilmedi");
        setSurname("Henüz Girilmedi");
        setAge(0);
        studentNumber =0;
    }

    public Student(String name, String surname, int age, long studentNumber) {
        setName(name);
        setSurname(surname);
        setAge(age);
        this.studentNumber = studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }



}
