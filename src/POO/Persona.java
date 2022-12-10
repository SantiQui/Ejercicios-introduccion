package POO;

public class Persona {
    private String name;
    private String surname;
    private int age;
    private Integer phone;

    public void setName(String name){
       this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setAge(int  age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setPhone(Integer phone){
        this.phone = phone;
    }
    public Integer getPhone(){
        return this.phone;
    }


}
