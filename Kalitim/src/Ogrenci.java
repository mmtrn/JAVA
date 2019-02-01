public class Ogrenci {
    private String name;
    private String surname;
    private long schoolNumber;
    private Integer age;

    public Ogrenci(String name, String surname, Integer schoolNumber, Integer age) {
        this.name = name;
        this.surname = surname;
        this.schoolNumber = schoolNumber;
        this.age = age;
    }

    public Ogrenci() {
        name="Henüz Girilmedi";
        surname="Henüz girilmedi";
        age=0;
        schoolNumber=0;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<1 && age>65){
            System.err.println("Doğru yaş değeri giriniz");}
        else this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(long schoolNumber) {
        if (schoolNumber>0){
            System.err.println("yanlış numara");
            this.schoolNumber = 0;
        }else {
            this.schoolNumber = schoolNumber;
        }}
    public String getKimlikBilgileri(){
        return name + " " + surname + " " + age +" yaşındadır.   okul numarası: "+schoolNumber;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age +" yaşındadır..TS   Okul numarası: "+schoolNumber;
    }
}
