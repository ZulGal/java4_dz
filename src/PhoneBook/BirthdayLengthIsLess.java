package PhoneBook;

public class BirthdayLengthIsLess extends Exception{
    public BirthdayLengthIsLess(String message) {
        super(message);
    }
    public BirthdayLengthIsLess(int size) {
        this(String.format("Длина даты рождения меньше %d",size));
    }
}
