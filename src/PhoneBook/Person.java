package PhoneBook;

public class Person {
    String surname;
    String name;
    String lastname;
    String birthday;
    String phone;
    String gender;

    public Person(String surname, String name, String lastname, String birthday, String phone, String gender) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return surname+" "+name+" "+lastname+" "+birthday+" "+" "+phone+" "+gender+"\n";
    }
}
