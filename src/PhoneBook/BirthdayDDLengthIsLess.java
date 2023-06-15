package PhoneBook;

public class BirthdayDDLengthIsLess extends Exception {
    public BirthdayDDLengthIsLess(String message) {
        super(message);
    }
    public BirthdayDDLengthIsLess(int size) {
        this(String.format("Длина дня в дате рождения !меньше %d", size));
    }
}
