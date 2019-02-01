public class Personal {
    private String name;
    private String surname;
    private int age;
    private String PersonalId;



    public Personal(){
        name ="Henüz girilmedi";
        surname="Henüz girilmedi";
        age=0;

    }
    public Personal(String name,String surname,int age){

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

    public int getAge() {
        return age;
    }

    public void setPersonalId(String personalId) {
        PersonalId = personalId;
    }

    public String getPersonalId() {
        return "kimlik Bilgileri: İsmi : "+name +"Soyismi : "+surname+ "Yaşı : "+age;
    }

    public void setAge(int age) {
        if (age<0){
            this.age=0;
        }else
            this.age = age;
    }


    }
