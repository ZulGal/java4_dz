package PhoneBook;

public class BirthdayYYYYLengthIsLess extends Exception{
    public BirthdayYYYYLengthIsLess(String message) {
        super(message);
    }
    public BirthdayYYYYLengthIsLess(int size) {
        this(String.format("Длина года в дате рождения меньше %d", size));
    }
}
