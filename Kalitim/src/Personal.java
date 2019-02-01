public class Personal {
    private String name;
    private String surname;
    private int age;
    public Personal(){
        name ="Henüz girilmedi";
        surname="Henüz girilmedi";
        age=0;

    }
    public Personal(String name,String  surname,Integer age){
        this.name =name;
        this.surname =surname;
        this.age=age;
    }

    public void setAge(int age) {
        if (age<1 && age>65){
            System.err.println("Doğru yaş değeri giriniz");}
        else this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
    public String getKimlikBilgileri(){
        return name + " " + surname + " " + age +" yaşındadır.";
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age +" yaşındadır..";
    }
}
