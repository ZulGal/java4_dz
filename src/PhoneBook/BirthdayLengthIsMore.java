package PhoneBook;

public class BirthdayLengthIsMore extends Exception{
    public BirthdayLengthIsMore(String message) {
        super(message);
    }

    public BirthdayLengthIsMore(int size) {
        this(String.format("Длина даты рождения больше %d",size));
    }

}
