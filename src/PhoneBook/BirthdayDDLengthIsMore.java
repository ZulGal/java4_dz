package PhoneBook;

public class BirthdayDDLengthIsMore extends Exception{
    public BirthdayDDLengthIsMore(String message) {
        super(message);
    }
    public BirthdayDDLengthIsMore(int size) {
        this(String.format("Длина дня в дате рождения больше %d", size));
    }

}
